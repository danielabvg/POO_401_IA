package com.mx.curso.Unidad1.Metrica;

public class Accuracy extends Metrica {

    public Accuracy(double[] valoresReales, double[] predicciones) {
        super(valoresReales, predicciones);
    }

    @Override
    public double calcularResultado() {

        int correctos = 0;

        for (int i = 0; i < valoresReales.length; i++) {
            if (valoresReales[i] == predicciones[i]) {
                correctos++;
            }
        }

        double accuracy = (double) correctos / valoresReales.length;

        System.out.println("Accuracy calculado: " + accuracy);

        return accuracy;
    }
}
