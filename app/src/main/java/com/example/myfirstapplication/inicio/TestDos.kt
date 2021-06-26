package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TestDos: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.test_dos)

        val textTeste = findViewById<TextView>(R.id.textViewPerfilTest)
        val imageB = findViewById<ImageView>(R.id.imageViewB)
        val scrollTeste = findViewById<ScrollView>(R.id.scrollViewTest)
        val buttonTerminar = findViewById<Button>(R.id.buttonTerminar)

        buttonTerminar.setOnClickListener {
            val intent = Intent(this, NotaDos::class.java)
            startActivity(intent)
        }
    }
}