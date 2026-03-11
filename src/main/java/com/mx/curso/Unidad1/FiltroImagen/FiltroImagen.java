package com.mx.curso.Unidad1.FiltroImagen;

public abstract class FiltroImagen {

    protected String nombre;

    public FiltroImagen(String nombre) {
        this.nombre = nombre;
    }

    // Método que todas las subclases deben implementar
    public abstract void procesar(int[][] imagen);
}
