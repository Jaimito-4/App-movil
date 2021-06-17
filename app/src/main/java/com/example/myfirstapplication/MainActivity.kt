package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ConexionSQLiteHelper conn = new ConexionSQLiteHelper(
            this,
            "bd_usuarios",
            null,
            1);
    }
/*
    public void onClick(View view){
        switch (view.getNombre()){
            case R.nombre.btnSiguiente:
                    guardar();
            break;
            case R
        }
    }

 */
}