package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //vista de la pantalla "activity_main"
        val textoBienvenido = findViewById<TextView>(R.id.textViewBienvenido)
        val imagenLogo = findViewById<ImageView>(R.id.imageViewLostAllHope)
        val textoNombre = findViewById<TextView>(R.id.textViewNombreApodo)
        val ingresarNombre = findViewById<EditText>(R.id.editTextNombreUsuario)
        val textoContrasena = findViewById<TextView>(R.id.editTextTextPassword)
        val buttonSiguiente = findViewById<Button>(R.id.buttonSiguiente)

        buttonSiguiente.setOnClickListener {
            val intent = Intent(this, NotaUno::class.java)
            startActivity(intent)
        }

    }
}