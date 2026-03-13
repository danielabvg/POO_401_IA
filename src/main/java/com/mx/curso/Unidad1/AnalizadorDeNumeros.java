package com.mx.curso.Unidad1;

import java.util.Scanner;

public class AnalizadorDeNumeros {

    public static void main(String[] args) {

        // -----------------------------
        // TAREA 1: SUMA DEL 1 AL 100 (FOR)
        // -----------------------------
        int suma = 0;

        for (int i = 1; i <= 100; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los números del 1 al 100 es: " + suma);


        // -----------------------------
        // TAREA 2: PRIMER NÚMERO MAYOR A 50 (WHILE)
        // -----------------------------
        int num = 1;

        while (num <= 100) {

            if (num > 50) {
                System.out.println("El primer número mayor a 50 es: " + num);
                break; // salir del ciclo
            }

            num++;
        }


        // -----------------------------
        // TAREA 3: VALIDAR CONTRASEÑA (DO-WHILE)
        // -----------------------------
        Scanner scanner = new Scanner(System.in);

        String contraseñaCorrecta = "java123";
        String contraseñaIngresada;

        boolean esCorrecta = false;

        do {

            System.out.print("Ingresa la contraseña: ");
            contraseñaIngresada = scanner.nextLine();

            if (contraseñaIngresada.equals(contraseñaCorrecta)) {

                System.out.println("Contraseña correcta. Acceso permitido.");
                esCorrecta = true;

            } else {

                System.out.println("Contraseña incorrecta. Intenta nuevamente.");

            }

        } while (!esCorrecta);

    }
}
