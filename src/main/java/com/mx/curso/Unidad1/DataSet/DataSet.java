package com.mx.curso.Unidad1.DataSet;

public class DataSet {

    protected String nombreDataset;

    public DataSet(String nombreDataset) {
        this.nombreDataset = nombreDataset;
    }

    public void cargarDatos() {
        System.out.println("Cargando dataset: " + nombreDataset);
    }
}