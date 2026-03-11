package com.mx.curso.Unidad1.Metrica;

public class ECM extends Metrica {

    public ECM(double[] valoresReales, double[] predicciones) {
        super(valoresReales, predicciones);
    }

    @Override
    public double calcularResultado() {

        double suma = 0;

        for (int i = 0; i < valoresReales.length; i++) {

            double error = valoresReales[i] - predicciones[i];
            suma += error * error;
        }

        double mse = suma / valoresReales.length;

        System.out.println("Error Cuadrático Medio: " + mse);

        return mse;
    }
}
