package com.mx.curso.Unidad1.Pipeline;

import com.mx.curso.Unidad1.FiltroImagen.FiltroImagen;

public class DetectorDeBordes extends FiltroImagen {

    public DetectorDeBordes() {
        super("Detector de Bordes");
    }

    @Override
    public void procesar(int[][] imagen) {

        System.out.println("Aplicando detector de bordes...");

        for (int i = 1; i < imagen.length - 1; i++) {
            for (int j = 1; j < imagen[i].length - 1; j++) {

                int valor = Math.abs(imagen[i][j] - imagen[i+1][j+1]);

                imagen[i][j] = valor;
            }
        }

        System.out.println("Bordes detectados.");
    }
}
