package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val btnBack = findViewById<View>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, Genre::class.java)
            startActivity(intent)
        }

        val arrayAdapter: ArrayAdapter<*>
        val setting = arrayOf("Theme", "Font Size", "Text Alignment",
            "Line Spacing", "Chords")
        //val displaySetting = arrayOf("Light", "Normal", "Left", "1.1", "Display chords when available.")
        var sListView = findViewById<ListView>(R.id.listView)
        arrayAdapter = ArrayAdapter(this,
            android.R.layout.simple_spinner_item, setting)
        sListView.adapter = arrayAdapter
    }
}