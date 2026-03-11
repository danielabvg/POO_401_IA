package com.mx.curso.Unidad1.Metrica;

public class Metrica {

    protected double[] valoresReales;
    protected double[] predicciones;

    // Constructor
    public Metrica(double[] valoresReales, double[] predicciones) {
        this.valoresReales = valoresReales;
        this.predicciones = predicciones;
    }

    // Método general
    public double calcularResultado() {
        System.out.println("Calculando métrica...");
        return 0.0;
    }
}
