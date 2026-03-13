package com.mx.curso.Unidad1;

import java.util.Scanner;

public class ProcesarListas {

    public static void main(String[] args) {

        // Arreglo de frutas
        String[] frutas = {"manzana", "banana", "pera", "uva"};

        // -----------------------------------------
        // TAREA 1: IMPRIMIR ELEMENTOS DEL ARREGLO (FOR)
        // -----------------------------------------
        System.out.println("Lista de frutas:");

        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        // -----------------------------------------
        // TAREA 2: BUSCAR PRIMERA FRUTA QUE INICIE CON P (WHILE)
        // -----------------------------------------
        int contador = 0;
        boolean encontrado = false;

        while (contador < frutas.length && !encontrado) {

            if (frutas[contador].toUpperCase().startsWith("P")) {

                System.out.println("\nFruta encontrada que inicia con P:");
                System.out.println("Nombre: " + frutas[contador]);
                System.out.println("Posición: " + contador);

                encontrado = true;
            }

            contador++;
        }

        // -----------------------------------------
        // TAREA 3: VALIDAR ENTRADA DEL USUARIO (DO-WHILE)
        // -----------------------------------------
        Scanner scanner = new Scanner(System.in);

        String frutaIngresada;
        boolean frutaValida;

        do {

            System.out.print("\nIngresa una fruta de la lista: ");
            frutaIngresada = scanner.nextLine();

            frutaValida = false;

            for (String fruta : frutas) {

                if (fruta.equalsIgnoreCase(frutaIngresada)) {
                    frutaValida = true;
                    break;
                }

            }

            if (!frutaValida) {
                System.out.println("La fruta no está en la lista. Intenta nuevamente.");
            }

        } while (!frutaValida);

        System.out.println("Fruta válida. Gracias por ingresar: " + frutaIngresada);

        scanner.close();
    }
}
