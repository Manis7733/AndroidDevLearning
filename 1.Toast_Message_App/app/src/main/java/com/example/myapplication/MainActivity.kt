package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ButtonUpload = findViewById<Button>(R.id.btnUp)
        val ButtonDownlaod = findViewById<Button>(R.id.btnDown)

        ButtonUpload.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading",Toast.LENGTH_SHORT).show()
        }
        ButtonDownlaod.setOnClickListener{
            Toast.makeText(applicationContext, "Downloading", Toast.LENGTH_SHORT).show()
        }
    }
}