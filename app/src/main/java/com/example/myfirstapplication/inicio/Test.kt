package com.example.myfirstapplication.inicio

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstapplication.R
import com.example.myfirstapplication.TestDos

class Test: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test)

        val textPerfil = findViewById<TextView>(R.id.textViewPerfilTest)
        val imageA = findViewById<ImageView>(R.id.imageViewA)
        val scrollPerfil = findViewById<ScrollView>(R.id.scrollViewPerfil)
        val buttonContinuar = findViewById<Button>(R.id.buttonContinuar)

        buttonContinuar.setOnClickListener {
            val intent = Intent(this, TestDos::class.java)
            startActivity(intent)
        }
    }
}