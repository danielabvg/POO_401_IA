package com.mx.curso.Unidad1.OptimizadorIA;

public class DescensoGradiente extends OptimizadorIA {

    public DescensoGradiente() {
        super("Descenso de Gradiente");
    }

    @Override
    public void ajustarParametros() {
        System.out.println(nombreAlgoritmo + ": Calculando derivadas parciales y actualizando pesos...");
    }
}
