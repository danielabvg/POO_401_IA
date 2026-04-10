package com.mx.curso.Unidad2.PracticaClase;

public class Rectangulo2 extends FiguraGeometrica{

    private double base;
    private double altura;

    public Rectangulo2() {
        super("Rectangulo");
    }

    public Rectangulo2(String nombre) {
        super(nombre);
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }

}
