package com.mx.curso.Unidad1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalculadoraPromedio {

    public static void main(String[] args) {

        // Variables para las notas
        double nota1;
        double nota2;

        Scanner scanner = new Scanner(System.in);

        try {

            // Pedir primera nota
            System.out.print("Ingresa la primera nota: ");
            nota1 = scanner.nextDouble();

            // Pedir segunda nota
            System.out.print("Ingresa la segunda nota: ");
            nota2 = scanner.nextDouble();

            // Calcular promedio
            double promedio = (nota1 + nota2) / 2;

            // Mostrar resultado
            System.out.println("El promedio de las dos notas es: " + promedio);

        } catch (InputMismatchException e) {

            // Si el usuario escribe texto en lugar de número
            System.out.println("Error: Debes ingresar solo números para las notas.");

        } finally {

            // Cerrar scanner
            scanner.close();
            System.out.println("Programa finalizado.");

        }
    }
}
