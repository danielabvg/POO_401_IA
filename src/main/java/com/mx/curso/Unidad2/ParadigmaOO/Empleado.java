package com.mx.curso.Unidad2.ParadigmaOO;

public class Empleado {
    private int id;
    private double salario;

    public Empleado(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario += salario * porcentaje / 100;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        Empleado e = new Empleado(1, 10000);
        e.aumentarSalario(10);
        System.out.println("Salario: " + e.getSalario());
    }
}
