package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class ListElec : AppCompatActivity() {
    val song = arrayOf<String>("Sweetheart", "Chinese Fairytale")
    val artist = arrayOf<String>(
        "Tiger Baby", "Tiger Baby"
    )

    val imgCover = arrayOf<Int>(
        R.drawable.cover_sweetheart, R.drawable.cover_chinese_fairytale
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_elec)

        val btnBack = findViewById<View>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, Genre::class.java)
            startActivity(intent)
        }

        val myListAdapter = MyListAdapter(this,song,artist,imgCover)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener() { adapterView, view, position, id ->
            if (position === 0) {
                val sweetheart = Intent(this, LySweetheart::class.java)
                startActivity(sweetheart)
            } else if (position === 1) {
                val chinese_fairytale = Intent(this, LyChineseFairytale::class.java)
                startActivity(chinese_fairytale)
            }
        }
    }
}