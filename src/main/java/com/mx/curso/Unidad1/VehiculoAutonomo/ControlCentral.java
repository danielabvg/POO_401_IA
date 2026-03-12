package com.mx.curso.Unidad1.VehiculoAutonomo;

public class ControlCentral {

    VehiculoAutonomo vehiculo;

    // Constructor
    public ControlCentral(VehiculoAutonomo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public void iniciarViaje(String destino) {

        System.out.println("Iniciando sistema de conducción autónoma...");

        vehiculo.modoAutonomo(true);

        vehiculo.detectarEntorno();

        vehiculo.planearRuta(destino);

        vehiculo.acelerar(60);

        vehiculo.girar("derecha");

        vehiculo.frenar();

        vehiculo.estacionarse();

        System.out.println("Viaje completado.");
    }
}
