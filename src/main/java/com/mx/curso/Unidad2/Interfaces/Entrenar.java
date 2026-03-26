package com.mx.curso.Unidad2.Interfaces;

interface Serializable {
    public void a();
}

interface Tokenizable {
    public void b();
}

public interface Entrenar {
    public void c();
}

class Modelo implements Serializable, Tokenizable, Entrenar {

    private String nombre;
    private int epocas;

    public Modelo(String nombre, int epocas) {
        this.nombre = nombre;
        this.epocas = epocas;
    }

    @Override
    public void a() {
        System.out.println("Serializando modelo: " + nombre);
    }

    @Override
    public void b() {
        System.out.println("Tokenizando datos para el modelo: " + nombre);
    }

    @Override
    public void c() {
        System.out.println("Entrenando modelo por " + epocas + " épocas...");
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + nombre);
        System.out.println("Épocas: " + epocas);
    }

    public static void main(String[] args) {
        Modelo modelo = new Modelo("IA_Modelo_1", 10);

        modelo.mostrarInfo();
        modelo.a(); // Serializable
        modelo.b(); // Tokenizable
        modelo.c(); // Entrenable
    }
}
