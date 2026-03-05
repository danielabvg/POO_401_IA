package com.mx.curso.Unidad1.DataSet;

public class DataSet {

    protected String nombreDataset;

    // Constructor
    public DataSet(String nombreDataset) {
        this.nombreDataset = nombreDataset;
    }

    // Método para cargar datos (estructura general)
    public void cargarDatos() {
        System.out.println("Cargando dataset: " + nombreDataset);
    }
}
