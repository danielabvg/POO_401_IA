package com.mx.curso.Unidad2.Interfaces.Practica04;

import com.mx.curso.Unidad1.DataSet.DataSet;

public class EjemploSobreCargaMetodos {

    public void entrenar(DataSet[] datasets) {
        System.out.println("Método entrenar con un parámetro");
    }

    public void entrenar(DataSet[] datasets, int epochs) {
        System.out.println("Método entrenar sobrecargado con epochs: " + epochs);
    }
}
