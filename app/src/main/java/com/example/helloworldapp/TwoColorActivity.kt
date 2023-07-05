package com.example.helloworldapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TwoColorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two_color)
        settingBtns()
    }

    fun settingBtns(){
        val btn_blue = findViewById<Button>(R.id.btn_blue)
        val btn_red = findViewById<Button>(R.id.btn_red)

        btn_blue.setOnClickListener{
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_layout,RedFragment())
            fragmentTransaction.commit()

//        fragmentTransaction 클래스는 fragment를 생성,수정,삭제하는 역할을한다.
//        반드시 커밋해야한다
        }

        btn_red.setOnClickListener{
            val frameTransaction = supportFragmentManager.beginTransaction()
            frameTransaction.replace(R.id.frame_layout,BlueFragment())
            frameTransaction.commit()
        }

    }
}