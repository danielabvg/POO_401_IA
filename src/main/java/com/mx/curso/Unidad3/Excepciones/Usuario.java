package com.mx.curso.Unidad3.Excepciones;

public class Usuario {
    String nombre;

    public int longitudNombre() {
        return nombre.length(); // puede lanzar NullPointerException
    }
}