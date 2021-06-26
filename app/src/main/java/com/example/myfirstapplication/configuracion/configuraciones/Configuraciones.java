package com.example.lah;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.lah.databinding.ActivityConfiguracionesBinding;

import java.util.HashMap;
import java.util.Map;

public class Configuraciones extends AppCompatActivity {

    Button colores;
    Button fondo;
    Button cambiarpass;
    Button editarperfil;
    Button avatar;
    Button borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuraciones);
        Map<String,String> mapa= new HashMap<>();

        colores=(Button)findViewById(R.id.color);
        colores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent color = new Intent(Configuraciones.this, Color.class);
                startActivity(color);
            }
        });


        fondo=(Button)findViewById(R.id.fondo);
        fondo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                Intent fondo = new Intent(Configuraciones.this, MainActivity3.class);
                startActivity(fondo);
            }
        });




        cambiarpass=(Button)findViewById(R.id.cambiarcontrasenia);
        cambiarpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                Intent cambiarpass = new Intent(Configuraciones.this, MainActivity7.class);
                startActivity(cambiarpass);
            }
        });



        editarperfil=(Button)findViewById(R.id.editarperfil);
        editarperfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                Intent editarperfil = new Intent(Configuraciones.this, MainActivity6.class);
                startActivity(editarperfil);
            }
        });

        avatar=(Button)findViewById(R.id.avatar);
        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v5) {
                Intent avatar = new Intent(Configuraciones.this, MainActivity5.class);
                startActivity(avatar);
            }
        });


        borrar=(Button)findViewById(R.id.eliminarperfil);
        borrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v6) {
                Intent borrar = new Intent(Configuraciones.this, MainActivity4.class);
                startActivity(borrar);
            }
        });

    }
}