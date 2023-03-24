package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var letgo = findViewById<Button>(R.id.button)
        letgo.setOnClickListener {
            intent = Intent(applicationContext, courses :: class.java)
            startActivity(intent)
        }
    }
}