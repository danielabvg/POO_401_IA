package com.mx.curso.Unidad1.ElementosRobot;

public class Bateria {

    private int nivel;

    public void cargar(int energia){
        nivel = energia;
        System.out.println("Batería cargada a: " + nivel + "%");
    }
}
