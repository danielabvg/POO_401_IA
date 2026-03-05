package com.mx.curso.Unidad1;

public class Drone {

    private String ID;
    private double nivelBateria;

    // Constructor
    public Drone(String ID, double nivelBateria) {
        this.ID = ID;
        this.nivelBateria = nivelBateria;
    }

    // Método para modificar batería
    public void setNivelBateria(double nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    // Método para obtener batería
    public double getNivelBateria() {
        return nivelBateria;
    }

    // Método para mostrar estado
    public void mostrarEstado() {
        System.out.println("Drone ID: " + ID + " | Batería: " + nivelBateria + "%");
    }

    public static void main(String[] args) {

        // Crear 3 drones con baterías independientes
        Drone n1 = new Drone("1.0", 100);
        Drone n2 = new Drone("2.0", 100);
        Drone n3 = new Drone("3.0", 100);

        // Cambiar batería SOLO del drone 1
        n1.setNivelBateria(50);

        // Mostrar estado de todos
        n1.mostrarEstado();
        n2.mostrarEstado();
        n3.mostrarEstado();
    }
}


