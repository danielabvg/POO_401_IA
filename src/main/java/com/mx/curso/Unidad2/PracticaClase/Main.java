package com.mx.curso.Unidad2.PracticaClase;

public class Main {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[2];
        figuras[0] = new Circulo(5.0);         // Radio = 5
        figuras[1] = new Rectangulo(4.0, 3.0); // Base = 4, Altura = 3

        for (FiguraGeometrica figura : figuras) {
            figura.mostrarNombre();
            System.out.println("Área: " + figura.calcularArea());
            System.out.println();
        }

        System.out.println("Implementacion 2 ");

        Rectangulo2 rectanguloV2 = new Rectangulo2();
        rectanguloV2.setBase(6.0);
        rectanguloV2.setAltura(4.8);

        System.out.println("Calcular area version 2.0" + " " + rectanguloV2.calcularArea());

        Rectangulo2 rectangulo2 = new Rectangulo2("Rectangulo 2");
        rectangulo2.setBase(20);
        rectangulo2.setAltura(13);
        rectangulo2.mostrarNombre();
        System.out.println("El área es: " + rectangulo2.calcularArea());

    }
}
