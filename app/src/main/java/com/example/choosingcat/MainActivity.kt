package com.example.choosingcat

    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.os.Handler
    import android.view.MotionEvent
    import kotlinx.android.synthetic.main.activity_main.*
    import kotlinx.android.synthetic.main.random_main.*

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            //시작 로딩 창 만들기!




            first_xml_btn_start.setOnClickListener{


                val intent = Intent(this,MainRandomActivity::class.java)
                startActivity(intent)

            }

        }



}
