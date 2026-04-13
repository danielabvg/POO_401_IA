package com.mx.curso.Unidad2.ParadigmaOO;

class Vehiculo {
    int velocidad;
    int numLlantas;

    void acelerar() {
        velocidad += 5;
    }
}

class Bicicleta extends Vehiculo {
}

class Automovil extends Vehiculo {
    @Override
    void acelerar() {
        velocidad += 20;
    }
}

public class MainVehiculo {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta();
        Automovil auto = new Automovil();

        bici.acelerar();
        auto.acelerar();

        System.out.println("Velocidad bici: " + bici.velocidad);
        System.out.println("Velocidad auto: " + auto.velocidad);
    }
}