package com.mx.curso.Unidad1;

public class SistemaCalificaciones {

    public static void main(String[] args) {

        // Variable con la nota del examen
        int notaExamen = 92;

        // Validar que la nota esté entre 0 y 100
        if (notaExamen < 0 || notaExamen > 100) {

            System.out.println("La nota es inválida");

        } else {

            // Verificar si aprobó
            if (notaExamen >= 60) {

                System.out.println("¡Felicidades, has aprobado!");

                // IF ANIDADO
                if (notaExamen >= 90) {
                    System.out.println("¡Excelente desempeño!");
                }

            } else {

                System.out.println("Lo sentimos, no has aprobado.");

            }

            // SWITCH para asignar letra
            char calificacion;

            switch (notaExamen / 10) {

                case 10:
                case 9:
                    calificacion = 'A';
                    break;

                case 8:
                    calificacion = 'B';
                    break;

                case 7:
                    calificacion = 'C';
                    break;

                case 6:
                    calificacion = 'D';
                    break;

                default:
                    calificacion = 'F';
                    break;
            }

            System.out.println("Tu calificación es: " + calificacion);
        }

    }
}
