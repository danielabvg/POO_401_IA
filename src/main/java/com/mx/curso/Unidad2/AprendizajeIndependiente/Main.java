package com.mx.curso.Unidad2.AprendizajeIndependiente;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // =========================
        // PRÁCTICA 1: LIBRO
        // =========================
        Libro libro1 = new Libro("1984", "George Orwell", 328);
        Libro libro2 = new Libro("El Principito", "Antoine de Saint-Exupéry", 96);

        libro1.mostrarInfo();
        libro2.mostrarInfo();

        // =========================
        // PRÁCTICA 2: BANCO
        // =========================
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        cuenta.depositar(500);
        cuenta.retirar(300);
        cuenta.retirar(1500); // prueba de fondos insuficientes

        System.out.println("Saldo actual: " + cuenta.getSaldo());

        // =========================
        // PRÁCTICA 3 Y 4: HERENCIA + POLIMORFISMO
        // =========================
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal animal : animales) {
            animal.hacerSonido();
        }

        // =========================
        // PRÁCTICA 5: INTERFACS
        // =========================
        ArrayList<PuedeVolar> voladores = new ArrayList<>();

        voladores.add(new Avion());
        voladores.add(new Pajaro());

        for (PuedeVolar v : voladores) {
            v.volar();
        }
    }
}
