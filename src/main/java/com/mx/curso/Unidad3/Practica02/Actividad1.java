package com.mx.curso.Unidad3.Practica02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingrese la hora de la cita: ");
            int hora = sc.nextInt();
            sc.nextLine();

            System.out.print("Ingrese el día de la semana: ");
            String dia = sc.nextLine().toLowerCase();

            if (hora >= 9 && hora <= 17) {
                if (!dia.equals("sabado") && !dia.equals("domingo")) {
                    System.out.println("Cita agendada con éxito.");
                } else {
                    System.out.println("No se pueden agendar citas en fin de semana.");
                }
            } else {
                System.out.println("La hora está fuera del horario permitido.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Debe ingresar un número válido para la hora.");
        }
    }
}
