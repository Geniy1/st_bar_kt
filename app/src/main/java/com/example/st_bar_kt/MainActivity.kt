package com.example.st_bar_kt

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(resources.getColor(R.color.DodgerBlue)))
        go_sec_page()
    }

    fun go_sec_page() {
        val b_sec_page = findViewById<View>(R.id.b_main) as Button
        b_sec_page.setOnClickListener { open_sec_page() }
    }

    fun open_sec_page() {
        val intent = Intent(this, PhotoActivaty::class.java)
        startActivity(intent)
    }
}