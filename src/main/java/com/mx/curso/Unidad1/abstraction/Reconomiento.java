package com.mx.curso.Unidad1.abstraction;

public class Reconomiento extends ModeloIA{

    public Reconomiento() {
        super("Vision 1.0");
    }

    @Override
    public void procesarEntrada(String entrada) {
        System.out.println("Cargando datos...");
        System.out.println("Extrayendo datos...");
        System.out.println("Comparando vector...");
    }
}
