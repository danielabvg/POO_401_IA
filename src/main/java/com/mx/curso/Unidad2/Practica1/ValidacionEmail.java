package com.mx.curso.Unidad2.Practica1;

import java.util.Scanner;

public class ValidacionEmail {

    public static boolean validarEmail(String email) {
        if (email.contains("@") && email.contains(".")) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email;

        do {
            System.out.print("Ingresa un email: ");
            email = sc.nextLine();

            if (!validarEmail(email)) {
                System.out.println("Email inválido.");
            }

        } while (!validarEmail(email));

        System.out.println("Email válido registrado.");
    }
}
