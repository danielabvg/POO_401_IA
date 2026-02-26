package com.mx.curso.Unidad1.elementosRobot;

public class Brazo {

    private String tipoMovimiento;
    private float velocidad;

    // método sencillo
    public void asignarMovimiento(String tipo, float vel) {
        tipoMovimiento = tipo;
        velocidad = vel;
    }

    public void mostrarInfo() {
        System.out.println("Movimiento: " + tipoMovimiento);
        System.out.println("Velocidad: " + velocidad);
    }

    public static void main(String[] args) {

        Brazo brazo = new Brazo();   // crear objeto
        brazo.asignarMovimiento("Rotación", 3.5f);
        brazo.mostrarInfo();

    }
}
