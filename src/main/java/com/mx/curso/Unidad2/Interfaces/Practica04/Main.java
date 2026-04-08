package com.mx.curso.Unidad2.Interfaces.Practica04;

import com.mx.curso.Unidad1.DataSet.DataSet;

public class Main {

    public static void main(String[] args) {

        // Crear datasets
        DataSet d1 = new DataSet("Iris");
        DataSet d2 = new DataSet("MNIST");

        // Crear arreglo de datasets
        DataSet[] datos = {d1, d2};

        // Crear objeto del modelo
        EjemploSobreCargaMetodos modelo = new EjemploSobreCargaMetodos();

        // Llamar métodos
        modelo.entrenar(datos);
        modelo.entrenar(datos, 10);
    }
}
