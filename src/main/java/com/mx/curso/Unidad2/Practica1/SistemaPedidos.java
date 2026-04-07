package com.mx.curso.Unidad2.Practica1;

import java.util.Scanner;

public class SistemaPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estado = "";

        while (!estado.equals("Entregado")) {
            System.out.print("Estado del pedido: ");
            estado = sc.nextLine();

            if (estado.equals("Error en envío")) {
                System.out.println("Proceso detenido por error.");
                break;
            }

            if (estado.equals("En camino")) {
                System.out.println("Pedido en tránsito...");
                continue;
            }

            if (estado.equals("Procesando")) {
                System.out.println("Pedido en preparación.");
            }
        }

        if (estado.equals("Entregado")) {
            System.out.println("Pedido entregado correctamente.");
        }
    }
}
