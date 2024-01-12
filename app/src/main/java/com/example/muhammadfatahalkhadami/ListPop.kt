package com.example.muhammadfatahalkhadami

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class ListPop : AppCompatActivity() {
    val song = arrayOf<String>("Maps")
    val artist = arrayOf<String>(
        "Maroon 5"
    )

    val imgCover = arrayOf<Int>(
        R.drawable.cover_maps
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_pop)

        val btnBack = findViewById<View>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, Main::class.java)
            startActivity(intent)
        }

        val myListAdapter = MyListAdapter(this,song,artist,imgCover)
        val listView = findViewById<ListView>(R.id.listView)
        listView.adapter = myListAdapter

        listView.setOnItemClickListener(){adapterView, view, position, id ->
            if (position === 0) {
                val maps = Intent(this, LyMaps::class.java)
                startActivity(maps)
            }
        }
    }
}