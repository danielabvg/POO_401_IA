package com.mx.curso.Unidad1.OptimizadorIA;

public abstract class OptimizadorIA {

    protected String nombreAlgoritmo;

    public OptimizadorIA(String nombreAlgoritmo) {
        this.nombreAlgoritmo = nombreAlgoritmo;
    }

    public abstract void ajustarParametros();
}