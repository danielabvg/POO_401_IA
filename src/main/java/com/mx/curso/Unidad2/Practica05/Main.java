package com.mx.curso.Unidad2.Practica05;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String texto = "El producto es excelente, muy bueno y genial.";

        List<ProcesadorNLP> procesadores = new ArrayList<>();

        procesadores.add(new ProcesadorSimple());
        procesadores.add(new ProcesadorAnalisisSentimientos());

        for (ProcesadorNLP p : procesadores) {
            p.cargarTexto(texto);

            p.limpiarTexto();
            List<String> tokens = p.tokenizar();
            Object resultado = p.transformarParaModelo();

            System.out.println("Clase: " + p.getClass().getSimpleName());
            System.out.println("Tokens: " + tokens);
            System.out.println("Resultado: " + resultado);
            System.out.println("---------------");
        }
    }
}
