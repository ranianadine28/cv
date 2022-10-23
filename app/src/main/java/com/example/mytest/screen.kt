package com.example.mytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen)
        Handler(mainLooper).postDelayed({
            val i = Intent(this@screen, MainActivity::class.java)
            startActivity(i)
            finish()
        }, 300)
    }
}