package com.mx.curso.Unidad1.Metrica;

public class EAM extends EvaluadorMetricas {

    @Override
    public double calcularError(double real, double predicho) {

        return Math.abs(real - predicho);

    }
}
