package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.ContextMenu
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotaUno: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.patalla_nota_uno)

        val textNombreX = findViewById<TextView>(R.id.textViewPasarNombre)
        val textoConocerte = findViewById<TextView>(R.id.textViewConocerte)
        val textoAyuda = findViewById<TextView>(R.id.textViewAyuda)
        val imagenTeste = findViewById<ImageView>(R.id.imageViewTest)

        imagenTeste.setOnClickListener {
            val intent = Intent(this, Test::class.java)
            startActivity(intent)
        }
    }
}