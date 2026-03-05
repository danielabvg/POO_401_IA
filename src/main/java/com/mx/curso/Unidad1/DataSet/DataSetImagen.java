package com.mx.curso.Unidad1.DataSet;

public class DataSetImagen extends DataSet {

    private int[][] pixeles;

    // Constructor
    public DataSetImagen(String nombreDataset) {
        super(nombreDataset);
    }

    // Sobrescribir método
    @Override
    public void cargarDatos() {
        super.cargarDatos();
        System.out.println("Procesando imagenes y cargando pixeles...");
    }
}
