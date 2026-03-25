package com.mx.curso.Unidad2.sensores1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHD = new ArrayList<>();

        SensorLidar obj1 = new SensorLidar();
        SensorLidar obj2 = new SensorLidar();
        SensorVision obj3 = new SensorVision();
        SensorVision obj4 = new SensorVision(); // ← faltaba esto

        percepcionHD.add(obj1);
        percepcionHD.add(obj2);
        percepcionHD.add(obj3);
        percepcionHD.add(obj4);
        percepcionHD.add(new SensorUltrasonido());

        for (SensorIA f : percepcionHD) {
            f.operar();
        }
    }
}