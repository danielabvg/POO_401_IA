package com.mx.curso.Unidad2.ParadigmaOO;

class Calculadora {

    int sumar(int a, int b) {
        return a + b;
    }

    int sumar(int a, int b, int c) {
        return a + b + c;
    }

    double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora c = new Calculadora();

        System.out.println(c.sumar(2, 3));
        System.out.println(c.sumar(2, 3, 4));
        System.out.println(c.sumar(2.5, 3.5));
    }
}
