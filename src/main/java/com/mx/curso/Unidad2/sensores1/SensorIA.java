package com.mx.curso.Unidad2.sensores1;

public abstract class SensorIA {

    protected String modelo;
    protected double consumoEnergia;

    // Constructor
    public SensorIA(String modelo, double consumoEnergia) {
        this.modelo = modelo;
        this.consumoEnergia = consumoEnergia;
    }

    // Método abstracto (polimorfismo)
    public abstract void leerDatos();

    // Getters y Setters
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
}
