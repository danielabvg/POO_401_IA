package com.mx.curso.Unidad1.Practica04;

public abstract class SensorIA {

    protected String modelo;
    protected double consumoEnergia;

    public SensorIA(String modelo, double consumoEnergia) {
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    public abstract void leerDatos();
}
