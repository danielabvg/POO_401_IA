package com.mx.curso.Unidad2.sensores1;

public class SensorLidar extends SensorIA {

    // Constructor
    public SensorLidar(String modelo, double consumoEnergia) {
        super(modelo, consumoEnergia);
    }

    // Método sobrescrito
    @Override
    public void leerDatos() {
        System.out.println(
                "Escaneando entorno 360°... Generando nube de puntos láser. " +
                        "Modelo: " + modelo + " Consumo de energía: " + consumoEnergia
        );
    }
}
