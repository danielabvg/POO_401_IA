package com.mx.curso.Unidad1.Abstraccion;

public class Main {

    public static void main(String[] args) {

        ModeloIA agente = new Reconocimiento();
        agente.procesarEntrada("imagen_usuario.jpg");

    }
}
