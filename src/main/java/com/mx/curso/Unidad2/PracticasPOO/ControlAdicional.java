package com.mx.curso.Unidad2.PracticasPOO;

public class ControlAdicional {

    public static void main(String[] args) {

        // ==============================
        // Sección 1: break
        // ==============================
        System.out.println("Uso de break:");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        // ==============================
        // Sección 2: continue
        // ==============================
        System.out.println("\nUso de continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // ==============================
        // Sección 3: return
        // ==============================
        int[] numeros = {3, 7, 10, 15, 20};
        int objetivo = 10;

        String resultado = encontrarNumero(numeros, objetivo);
        System.out.println("\nResultado de búsqueda: " + resultado);
    }

    public static String encontrarNumero(int[] arreglo, int objetivo) {
        for (int num : arreglo) {
            if (num == objetivo) {
                return "Número encontrado: " + objetivo;
            }
        }
        return "Número no encontrado";
    }
}
