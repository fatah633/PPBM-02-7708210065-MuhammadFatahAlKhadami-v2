package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ncorti.slidetoact.SlideToActView

class Intro : AppCompatActivity() {
    lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

//        handler = Handler()
//        handler.postDelayed({
//            val intent = Intent(this, Main::class.java)
//            startActivity(intent)
//            finish()
//        }, 3000)

        val _slider = findViewById<SlideToActView>(R.id.btnSlide)
        _slider.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener {
            override fun onSlideComplete(view: SlideToActView) {
//                Log.d("fatah", "slide1: " + view.text + ", id: " + view.id)
                val _intent = Intent(this@Intro, Main::class.java)
                startActivity(_intent)
            }
        }
    }
}