package com.mx.curso.Unidad2.ParadigmaOO;

class Circulo2 {
    private double radio;

    public Circulo2(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    public static void main(String[] args) {
        Circulo2 c = new Circulo2(5);

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Circunferencia: " + c.calcularCircunferencia());
    }
}