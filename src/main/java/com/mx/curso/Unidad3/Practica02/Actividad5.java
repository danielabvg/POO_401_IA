package com.mx.curso.Unidad3.Practica02;

import java.util.Scanner;

public class Actividad5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {

            System.out.print("Usuario: ");
            String usuario = sc.nextLine();

            System.out.print("Contraseña: ");
            String contraseña = sc.nextLine();

            if (usuario.equals("medico1") && contraseña.equals("doc123")) {
                System.out.println("Acceso de Médico exitoso.");
                break;
            } else if (usuario.equals("enfermera2") && contraseña.equals("enf456")) {
                System.out.println("Acceso de Enfermera exitoso.");
                break;
            } else {
                System.out.println("Credenciales incorrectas.");
                if (i == 3) {
                    System.out.println("Acceso denegado");
                }
            }
        }
    }
}
