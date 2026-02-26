package com.mx.curso.Unidad1.elementosRobot;

public class Motor {

    private float potencia;

    public void encender(float p){
        potencia = p;
        System.out.println("Motor encendido con potencia: " + potencia);
    }
}