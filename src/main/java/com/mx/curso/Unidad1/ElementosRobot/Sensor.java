package com.mx.curso.Unidad1.ElementosRobot;

public class Sensor {

    private String tipo;

    public void activar(String t){
        tipo = t;
        System.out.println("Sensor activado: " + tipo);
    }
}
