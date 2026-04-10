package com.mx.curso.Unidad2.PracticaClase;

class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}