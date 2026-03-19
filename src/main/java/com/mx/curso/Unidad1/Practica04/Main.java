package com.mx.curso.Unidad1.Practica04;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        percepcionHub.add(new SensorLidar("LidarX", 50.0));
        percepcionHub.add(new SensorVision("VisionPro", 30.0));
        percepcionHub.add(new SensorUltrasonido("UltraSense", 10.0));

        // Polimorfismo en acción
        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }
    }
}
