package com.example.choosingcat

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.MotionEvent
    import kotlinx.android.synthetic.main.activity_main.*
    import kotlinx.android.synthetic.main.random_main.*

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            first_xml_btn_start.setOnClickListener {
                setContentView(R.layout.random_main)



            }
        }
    private var mActivePointerId : Int = 0
    var i  = 0
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

        test.setText("$pointCount")







        return super.onTouchEvent(event)


    }


}
