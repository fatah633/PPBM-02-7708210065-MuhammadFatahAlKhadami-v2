package com.example.muhammadfatahalkhadami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.material.bottomsheet.BottomSheetDialog

class LyChineseFairytale : AppCompatActivity() {
    lateinit var btnShowBottomSheet: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ly_chinese_fairytale)

        val btnBack = findViewById<View>(R.id.back)
        btnBack.setOnClickListener {
            val intent = Intent(this, ListElec::class.java)
            startActivity(intent)
        }

        btnShowBottomSheet = findViewById(R.id.share);
        btnShowBottomSheet.setOnClickListener {
            val dialog = BottomSheetDialog(this)
            val view = layoutInflater.inflate(R.layout.bottom_sheet_dialog, null)
            val btnClose = view.findViewById<View>(R.id.close)
            btnClose.setOnClickListener {
                dialog.dismiss()
            }
            dialog.setCancelable(false)
            dialog.setContentView(view)
            dialog.show()
        }
    }
}