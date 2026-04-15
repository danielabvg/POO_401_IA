package com.mx.curso.Unidad3.Excepciones;

public class Calculadora {

    public int dividir(int a, int b) {
        return a / b; // puede lanzar ArithmeticException si b = 0
    }
}