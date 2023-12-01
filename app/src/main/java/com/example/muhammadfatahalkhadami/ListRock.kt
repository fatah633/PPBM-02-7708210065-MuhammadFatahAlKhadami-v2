package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ListView

class ListRock : AppCompatActivity() {
    val song = arrayOf<String>("M.I.A.")
    val artist = arrayOf<String>(
        "Avenged Sevenfold"
    )

    val imgCover = arrayOf<Int>(
        R.drawable.cover_mia
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_rock)

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
                val mia = Intent(this, LyMia::class.java)
                startActivity(mia)
            }
        }
    }
}