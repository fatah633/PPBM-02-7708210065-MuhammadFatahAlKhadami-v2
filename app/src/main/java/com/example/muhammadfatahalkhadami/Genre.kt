package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class Genre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genre)

        val btnSettings = findViewById<Button>(R.id.settings)
        btnSettings.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }

        val btnPop = findViewById<CardView>(R.id.card_pop)
        btnPop.setOnClickListener {
            val intent = Intent(this, ListPop::class.java)
            startActivity(intent)
        }

        val btnRock = findViewById<CardView>(R.id.card_rock)
        btnRock.setOnClickListener {
            val intent = Intent(this, ListRock::class.java)
            startActivity(intent)
        }

        val btnElec = findViewById<CardView>(R.id.card_elec)
        btnElec.setOnClickListener {
            val intent = Intent(this, ListElec::class.java)
            startActivity(intent)
        }
    }
}