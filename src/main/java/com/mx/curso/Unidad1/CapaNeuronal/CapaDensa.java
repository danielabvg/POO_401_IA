package com.mx.curso.Unidad1.CapaNeuronal;

public class CapaDensa extends CapaNeuronal {

    private int numeroNeuronas;

    // Constructor
    public CapaDensa(String nombreCapa, int numeroNeuronas) {
        super(nombreCapa);
        this.numeroNeuronas = numeroNeuronas;
    }

    // Sobrescritura del método
    @Override
    public void procesar() {
        super.procesar();
        System.out.println("Activando " + numeroNeuronas + " neuronas en la capa densa...");
    }
}
