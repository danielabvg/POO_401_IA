package com.mx.curso.Unidad1.DataSet;

public class Main {

    public static void main(String[] args) {

        DataSetImagen datasetImg = new DataSetImagen("ImagenesEjemplos");
        DataSetTexto datasetTxt = new DataSetTexto("NoticiasRelevantes");

        datasetImg.cargarDatos();
        datasetTxt.cargarDatos();
    }
}
