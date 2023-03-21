package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonDark = findViewById<Button>(R.id.btnDark)
        val ButtonRead = findViewById<Button>(R.id.btnRead)
        val Layout = findViewById<LinearLayout>(R.id.LinearLayout)

        ButtonRead.setOnClickListener{
            Layout.setBackgroundResource(R.color.yellow)
        }
        ButtonDark.setOnClickListener {
            Layout.setBackgroundResource(R.color.black)
        }
    }
    
}