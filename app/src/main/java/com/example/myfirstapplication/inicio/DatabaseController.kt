package com.example.myfirstapplication

import android.content.ContentValues
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.myfirstapplication.inicio.Usuario

class DatabaseController(val context: Context): SQLiteOpenHelper(context, "LogInDatabase", null, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE DatosDelUsuario (_id INTEGER PRIMARY KEY, nombre TEXT, contrasena TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

    fun agregarUsuario (usuario: Usuario){
        val contentVales = ContentValues()
        contentVales.put("nombre", usuario.nombre)
        contentVales.put("contrasena", usuario.contrasena)
        writableDatabase.insert("Registro de Usuario", null, contentVales)
        }
    }

