package com.example.myfirstapplication.entidades;

public class Usuario {

    private String contraseña;
    private String nombre;

    public Usuario(String contraseña, String nombre){
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
