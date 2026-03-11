package com.mx.curso.Unidad1.CapaNeuronal;

public class CapaNeuronal {

    protected String nombreCapa;

    // Constructor
    public CapaNeuronal(String nombreCapa) {
        this.nombreCapa = nombreCapa;
    }

    // Método general
    public void procesar() {
        System.out.println("Procesando capa neuronal: " + nombreCapa);
    }
}
