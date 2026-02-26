package com.mx.curso.Unidad1.abstraction;

public abstract class ModeloIA {

    protected String nombre;

    public ModeloIA(String nombre) {
        this.nombre = nombre;
    }

    public abstract void procesarEntrada(String entrada);
}
