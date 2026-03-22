package com.mx.curso.Unidad2.Practica05;

import com.mx.curso.Unidad2.Practica05.ProcesadorNLP;
import java.util.*;

public class ProcesadorSimple extends ProcesadorNLP {

    private List<String> tokens = new ArrayList<>();

    @Override
    public List<String> tokenizar() {
        tokens = Arrays.asList(textoCrudo.split("\\s+"));
        return tokens;
    }

    @Override
    public void limpiarTexto() {
        textoCrudo = textoCrudo.toLowerCase().replaceAll("[.,]", "");
    }

    @Override
    public Object transformarParaModelo() {
        return tokens.size(); // número de palabras
    }
}
