package com.mx.curso.Unidad1.elementosRobot;

public class Main {

    public static void main(String[] args) {

        System.out.println("Robot iniciado");

        // Crear objetos
        Brazo brazo = new Brazo();
        Motor motor = new Motor();
        Sensor sensor = new Sensor();
        Bateria bateria = new Bateria();

        // Usar métodos (ejemplo)
        brazo.asignarMovimiento("Rotación", 3.0f);
        motor.encender(5.0f);
        sensor.activar("Proximidad");
        bateria.cargar(80);

    }
}