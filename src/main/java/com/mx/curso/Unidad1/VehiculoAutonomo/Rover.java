package com.mx.curso.Unidad1.VehiculoAutonomo;

public class Rover extends VehiculoAutonomo {

    @Override
    public void detectarEntorno() {
        System.out.println("Rover analizando terreno con sensores.");
    }

    @Override
    public void planearRuta(String destino) {
        System.out.println("Rover calculando ruta terrestre hacia: " + destino);
    }

    @Override
    public void acelerar(double velocidad) {
        System.out.println("Rover aumentando velocidad a: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println("Rover frenando.");
    }

    @Override
    public void girar(String direccion) {
        System.out.println("Rover girando hacia: " + direccion);
    }

    @Override
    public void estacionarse() {
        System.out.println("Rover estacionándose.");
    }

    @Override
    public void modoAutonomo(boolean activar) {
        System.out.println("Modo autónomo del Rover: " + activar);
    }
}
