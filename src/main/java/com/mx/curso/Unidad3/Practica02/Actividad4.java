package com.mx.curso.Unidad3.Practica02;

import java.util.Scanner;

public class Actividad4 {

    public static boolean validarIDPaciente(int id) {
        return (id >= 10000 && id <= 99999);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("Ingrese ID (5 dígitos): ");
            id = sc.nextInt();

            if (!validarIDPaciente(id)) {
                System.out.println("ID inválido.");
            }

        } while (!validarIDPaciente(id));

        System.out.println("ID válido.");
    }
}
