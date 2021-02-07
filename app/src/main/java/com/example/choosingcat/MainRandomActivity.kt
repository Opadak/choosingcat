package com.example.choosingcat

import android.animation.ObjectAnimator
import android.graphics.Point
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.view.View
import androidx.core.view.MotionEventCompat.getPointerId
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.random_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import java.lang.Thread.sleep
import java.util.*
import kotlin.concurrent.timer
import kotlin.math.log
import java.util.Random


class MainRandomActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.random_main)
   /*     var timerTask: Timer? = null*/




    }



    private var mActivePointerId : Int = 0
    var i : Int  = 0

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        val pointCount = event!!.pointerCount
        // 다중 터치 수 만큼 의 수
        val point = Array(10,{0})
        val pointCountx = Array(10,{0f})
        // x좌표
        val pointCounty = Array(10,{0f})
        // y좌표



        // 인덱스 값
        when (event.action){

            MotionEvent.ACTION_POINTER_DOWN -> {


                if (pointCount <= 9){
                    mActivePointerId = event.getPointerId(pointCount)
                    i = pointCount

                    pointCountx[i] = event.getX(i)
                    pointCounty[i] = event.getY(i)
                    //터치 좌표를 저장.


                }

            }
            else -> {}
        }


     /*   GlobalScope.launch {
            doSomething()

        }*/
        GlobalScope.launch(Dispatchers.Main) {
            doSomething()
            test2.setText("안녕하세요!")
        }

        test.setText("$pointCount")









        return super.onTouchEvent(event)


    }

   /* private var time = 0
    private var isRunning = false
    private var timerTask: Timer? = null
    private var index :Int = 1

    private fun start() {

        timerTask = kotlin.concurrent.timer(period = 10) {	// timer() 호출
            time++	// period=10, 0.01초마다 time를 1씩 증가
            val sec = time / 100	// time/100, 나눗셈의 몫 (초 부분)
            if (sec == 5){
                pause()
            }
        }
    }

    private fun pause() {


        timerTask?.cancel();	// 안전한 호출(?.)로 timerTask가 null이 아니면 cancel() 호출
        test2.setText("실행시간이 끝이 났습니다! 제발제발 ㅜㅜ")
    }

*/
    //타이머
   private suspend fun doSomething() {
       GlobalScope.launch {
           sleep(3000)

       }

   }
 /*   val random = Random()
    private fun rand(from: Int, to: Int) : Int {
        val r= random.nextInt(to - from) + from
        return r
    }*/
/*
    val random = Random

    fun rand(from: Int, to: Int) : Int {
        return random.nextInt(to - from) + from
    }
*/

//랜덤 함수 오류

}


