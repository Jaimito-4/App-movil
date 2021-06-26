package com.example.myfirstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class NotaDos: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pantalla_nota_dos)

        val textGracias = findViewById<TextView>(R.id.textViewGracias)
        val textSelecc = findViewById<TextView>(R.id.textViewSelecciona)
        val buttonVamos = findViewById<Button>(R.id.buttonVamos)


        buttonVamos.setOnClickListener {
            val intent = Intent(this, PantallaPrincipalMenu::class.java)
            startActivity(intent)
        }
    }
}