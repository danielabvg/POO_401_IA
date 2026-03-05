package com.mx.curso.Unidad1.DataSet;

public class Main {

    public static void main(String[] args) {

        DataSetImagen datasetImg = new DataSetImagen("ImagenesMedicas");
        DataSetTexto datasetTxt = new DataSetTexto("CorpusNoticias");

        datasetImg.cargarDatos();
        datasetTxt.cargarDatos();
    }
}
