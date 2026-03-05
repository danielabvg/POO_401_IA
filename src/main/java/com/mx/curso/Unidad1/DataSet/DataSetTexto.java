package com.mx.curso.Unidad1.DataSet;

public class DataSetTexto extends DataSet {

    private String[] tokens;

    // Constructor
    public DataSetTexto(String nombreDataset) {
        super(nombreDataset);
    }

    // Sobrescribir método
    @Override
    public void cargarDatos() {
        super.cargarDatos();
        System.out.println("Procesando texto y generando tokens...");
    }
}
