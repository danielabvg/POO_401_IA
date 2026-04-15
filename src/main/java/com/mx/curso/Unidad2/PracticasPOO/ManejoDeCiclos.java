package com.mx.curso.Unidad2.PracticasPOO;

public class ManejoDeCiclos {

    public static void main(String[] args) {

        // Tarea 1: Conteo Ascendente (while)

        int contador = 1;

        System.out.println("Conteo Ascendente (while):");
        while (contador <= 5) {
            System.out.println(contador);
            contador++;
        }

        // Tarea 2: Conteo Descendente (do-while)

        int numero = 10;

        System.out.println("\nConteo Descendente (do-while):");
        do {
            System.out.println(numero);
            numero--;
        } while (numero >= 8);

        // Tarea 3: Tabla de multiplicar (for)

        System.out.println("\nTabla del 7 (for):");
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }
    }
}
