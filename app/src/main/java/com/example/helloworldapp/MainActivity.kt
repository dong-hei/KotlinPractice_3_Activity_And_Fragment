package com.example.helloworldapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        settingBtn()
    }

    fun settingBtn(){
        val btn = findViewById<Button>(R.id.main_btn)
        btn.setOnClickListener{
            // activity_sub.xml 로 이동, intent : 의지,지향,의도를 밝혀준다.
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }
    }
}