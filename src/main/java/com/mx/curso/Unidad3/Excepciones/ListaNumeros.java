package com.mx.curso.Unidad3.Excepciones;

public class ListaNumeros {

    int[] numeros = {1, 2, 3};

    public int obtenerNumero(int indice) {
        return numeros[indice]; // puede lanzar ArrayIndexOutOfBoundsException
    }
}
