package com.mx.curso.Unidad2.sensores1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHD = new ArrayList<>();

        SensorLidar obj1 = new SensorLidar("1.1", 1.30);
        SensorLidar obj2 = new SensorLidar("1.4", 2.65);
        SensorVision obj3 = new SensorVision("1.23", 2.44);
        SensorVision obj4 = new SensorVision("1.9", 2.01);
        SensorUltrasonido obj5 = new SensorUltrasonido("1.43", 1.54);
        SensorUltrasonido obj6 = new SensorUltrasonido("1.92", 1.26);

        percepcionHD.add(obj1);
        percepcionHD.add(obj2);
        percepcionHD.add(obj3);
        percepcionHD.add(obj4);
        percepcionHD.add(obj5);
        percepcionHD.add(obj6);

        // Nueva instancia de obj1
        obj1 = new SensorLidar("1.2", 1.5);
        percepcionHD.add(obj1);

        // Cambio de estado en obj5
        obj5.setModelo("1.72");
        percepcionHD.add(obj5);

        // Ejecución polimórfica
        for (SensorIA f : percepcionHD) {
            f.leerDatos();
        }
    }
}