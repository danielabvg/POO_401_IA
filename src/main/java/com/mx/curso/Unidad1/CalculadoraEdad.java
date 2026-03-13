package com.mx.curso.Unidad1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraEdad {

    public static void main(String[] args) {

        // Año actual
        int anioActual = 2026;

        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        try {

            // Pedir año de nacimiento
            System.out.print("Ingresa tu año de nacimiento: ");

            int anioNacimiento = scanner.nextInt();

            // Calcular edad
            int edad = anioActual - anioNacimiento;

            // Mostrar resultado
            System.out.println("Tu edad aproximada es: " + edad + " años.");

        } catch (InputMismatchException e) {

            // Manejo del error si el usuario escribe texto
            System.out.println("Error: Debes ingresar un número válido para el año.");

        } finally {

            // Cerrar scanner
            scanner.close();
            System.out.println("Programa finalizado.");

        }

    }
}
