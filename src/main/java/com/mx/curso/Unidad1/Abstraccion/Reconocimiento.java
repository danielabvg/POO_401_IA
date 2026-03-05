package com.mx.curso.Unidad1.Abstraccion;

public class Reconocimiento extends ModeloIA {

    @Override
    public void procesarEntrada(String entrada) {
        System.out.println("Procesando imagen para reconocimiento: " + entrada);
    }

}
