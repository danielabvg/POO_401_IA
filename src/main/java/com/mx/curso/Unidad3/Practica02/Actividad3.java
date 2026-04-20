package com.mx.curso.Unidad3.Practica02;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equalsIgnoreCase("Listo para revisión")) {

            System.out.print("Ingrese el estado: ");
            estado = sc.nextLine();

            if (estado.equalsIgnoreCase("En proceso")) {
                continue;
            } else if (estado.equalsIgnoreCase("Error en muestra")) {
                System.out.println("Proceso detenido.");
                break;
            } else if (estado.equalsIgnoreCase("Listo para revisión")) {
                System.out.println("Resultados listos.");
            } else {
                System.out.println("Estado no reconocido.");
            }
        }
    }
}
