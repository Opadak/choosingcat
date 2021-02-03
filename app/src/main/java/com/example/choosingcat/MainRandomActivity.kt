package com.example.choosingcat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.core.view.MotionEventCompat.getPointerId
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.random_main.*
import kotlin.random.Random

class MainRandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_main)




    }
    private var mActivePointerId : Int = 0
    override fun onTouchEvent(event: MotionEvent?): Boolean {

        val pointCount = event!!.pointerCount
        // 다중 터치 수 만큼 의 수


        if (event != null) {
            for (i in 0..pointCount) {
                mActivePointerId = event.getPointerId(i)
                val (x: Float, y: Float) = event.findPointerIndex(mActivePointerId).let { pointerIndex ->
                    // Get the pointer's current position
                    event.getX(pointerIndex) to event.getY(pointerIndex)

                } // id 마다 위치를 가지고 오는거. 굳이 필요한가..?

            }
        }else false
        // 다중 터치 id 부여

           val result_random =  rand(1,pointCount)




            test.setText("$result_random")


        return super.onTouchEvent(event)


    }



    val random = Random
    fun rand(start: Int,finish : Int):Int{
        return random.nextInt(finish-start)+start
    }

}