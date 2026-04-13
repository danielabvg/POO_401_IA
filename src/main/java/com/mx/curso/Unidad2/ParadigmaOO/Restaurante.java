package com.mx.curso.Unidad2.ParadigmaOO;

public class Restaurante {
    String nombre;
    String tipoDeComida;
    int calificacion;

    void abrir() {
        System.out.println("El restaurante " + nombre + " está abierto 🍽️");
    }

    public static void main(String[] args) {
        Restaurante r1 = new Restaurante();
        r1.nombre = "La Pasta Feliz";
        r1.tipoDeComida = "Italiana";
        r1.calificacion = 5;

        Restaurante r2 = new Restaurante();
        r2.nombre = "Tacos Don Pepe";
        r2.tipoDeComida = "Mexicana";
        r2.calificacion = 4;

        r1.abrir();
        r2.abrir();
    }
}
