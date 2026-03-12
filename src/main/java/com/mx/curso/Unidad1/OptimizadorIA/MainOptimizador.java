package com.mx.curso.Unidad1.OptimizadorIA;

import java.util.ArrayList;
import java.util.List;

public class MainOptimizador {

    public static void main(String[] args) {

        List<OptimizadorIA> optimizadores = new ArrayList<>();

        optimizadores.add(new DescensoGradiente());
        optimizadores.add(new AlgoritmoGenetico());

        for (OptimizadorIA optimizador : optimizadores) {
            optimizador.ajustarParametros();
        }
    }
}
