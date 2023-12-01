package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LyChineseFairytale : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ly_chinese_fairytale)

        val btnBack = findViewById<View>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, ListElec::class.java)
            startActivity(intent)
        }
    }
}