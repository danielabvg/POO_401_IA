package com.mx.curso.Unidad1.Practica04;

public class SensorLidar extends SensorIA {

    public SensorLidar(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    @Override
    public void leerDatos() {
        System.out.println("Escaneando entorno 360°... Generando nube de puntos láser.");
    }
}
