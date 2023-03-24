package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class courses : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)

        val callbutton = findViewById<Button>(R.id.btnCall)

        callbutton.setOnClickListener {
            val intent = Intent(Intent.ACTION_CALL)
            intent.data = Uri.parse("tel:7774829576")
            startActivity(intent)
        }

        val cardblockchain = findViewById<CardView>(R.id.blockchain)

        cardblockchain.setOnClickListener {

        }

    }
}