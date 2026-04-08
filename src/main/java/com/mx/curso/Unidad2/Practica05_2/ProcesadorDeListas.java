package com.mx.curso.Unidad2.Practica05_2;

import java.util.Scanner;

public class ProcesadorDeListas {

    public static void main(String[] args) {

        // Arreglo de frutas
        String[] frutas = {"Manzana", "Pera", "Plátano", "Uva"};

        int contador = 0;
        boolean bandera = true;

        // Buscar fruta que contenga "P"
        while (contador < frutas.length) {
            if (frutas[contador].contains("P")) {
                System.out.println("Fruta encontrada: " + frutas[contador]);
                break;
            }
            contador++;
        }

        // Leer entrada del usuario
        Scanner cs = new Scanner(System.in);
        String fruta;

        // Ciclo do-while
        do {
            System.out.println("Escribe una fruta (o 'salir' para terminar):");
            fruta = cs.nextLine();

            System.out.println("Escribiste: " + fruta);

        } while (!fruta.equalsIgnoreCase("salir"));

        System.out.println("Programa terminado.");
    }
}
