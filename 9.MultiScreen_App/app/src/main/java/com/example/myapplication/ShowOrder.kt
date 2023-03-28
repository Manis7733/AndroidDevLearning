package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_show_order.*

class ShowOrder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_order)

        val orderOfCustomers = intent.getStringExtra(MainActivity.KEY)
        tvOrder.text = "Order Placed" + orderOfCustomers.toString()
    }
}