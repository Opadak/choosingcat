package com.example.choosingcat

    import android.content.Intent
    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.os.Handler
    import android.view.MotionEvent
    import kotlinx.android.synthetic.main.activity_main.*
    import kotlinx.android.synthetic.main.random_main.*
    import kotlinx.coroutines.Dispatchers
    import kotlinx.coroutines.GlobalScope
    import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)





            first_xml_btn_start.setOnClickListener{


                val intent = Intent(this,MainRandomActivity::class.java)
                startActivity(intent)

            }

        }



}
