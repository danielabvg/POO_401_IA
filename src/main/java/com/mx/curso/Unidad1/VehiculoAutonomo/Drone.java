package com.mx.curso.Unidad1.VehiculoAutonomo;

public class Drone extends VehiculoAutonomo {

    @Override
    public void detectarEntorno() {
        System.out.println("Drone escaneando el entorno con sensores aéreos.");
    }

    @Override
    public void planearRuta(String destino) {
        System.out.println("Drone calculando ruta aérea hacia: " + destino);
    }

    @Override
    public void acelerar(double velocidad) {
        System.out.println("Drone aumentando velocidad a: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        System.out.println("Drone reduciendo velocidad.");
    }

    @Override
    public void girar(String direccion) {
        System.out.println("Drone girando hacia: " + direccion);
    }

    @Override
    public void estacionarse() {
        System.out.println("Drone aterrizando en zona segura.");
    }

    @Override
    public void modoAutonomo(boolean activar) {
        System.out.println("Modo autónomo del Drone: " + activar);
    }
}
