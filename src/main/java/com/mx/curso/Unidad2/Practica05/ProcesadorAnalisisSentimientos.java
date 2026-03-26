package com.mx.curso.Unidad2.Practica05;

import java.util.*;

public class ProcesadorAnalisisSentimientos extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();

    private static final Set<String> STOP_WORDS = Set.of(
            "el", "la", "los", "las", "un", "una", "y", "de"
    );

    private static final Set<String> PALABRAS_POSITIVAS = Set.of(
            "bueno", "excelente", "feliz", "increible", "genial", "increíble"
    );

    @Override
    public List<String> tokenizar() {
        tokens = new ArrayList<>(Arrays.asList(textoCrudo.split("\\s+")));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        textoCrudo = textoCrudo.toLowerCase().replaceAll("[.,]", "");
        tokens = new ArrayList<>(Arrays.asList(textoCrudo.split("\\s+")));

        tokens.removeIf(p -> STOP_WORDS.contains(p));
    }

    @Override
    public Object transformarParaModelo() {
        Map<String, Integer> frecuencia = new HashMap<>();

        for (String palabra : tokens) {
            if (PALABRAS_POSITIVAS.contains(palabra)) {
                frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
            }
        }

        return frecuencia;
    }
}
