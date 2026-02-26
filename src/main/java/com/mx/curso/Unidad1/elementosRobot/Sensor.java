package com.mx.curso.Unidad1.elementosRobot;

public class Sensor {

    private String tipo;

    public void activar(String t){
        tipo = t;
        System.out.println("Sensor activado: " + tipo);
    }
}