package com.mx.curso.Unidad2.Interfaces.Practica03;

import java.util.Arrays;
import java.util.List;

// Clase que separa palabras por espacios
public class TokenizadorBasico implements Tokenizador {

    @Override
    public List<String> dividirTexto(String parrafo) {

        // Paso 1: separar por espacios
        String[] palabras = parrafo.split(" ");

        // Paso 2: convertir arreglo a lista
        List<String> lista = Arrays.asList(palabras);

        // Paso 3: regresar resultado
        return lista;
    }
}
