package com.mx.curso.Unidad1.CapaNeuronal;

public class CapaConvolucional extends CapaNeuronal {

    private int[][] filtro;

    // Constructor
    public CapaConvolucional(String nombreCapa) {
        super(nombreCapa);
    }

    // Sobrescritura del método
    @Override
    public void procesar() {
        super.procesar();
        System.out.println("Aplicando convolución con filtros sobre la imagen...");
    }
}
