package com.mx.curso.Unidad1.Pipeline;

import com.mx.curso.Unidad1.FiltroImagen.FiltroImagen;

public class EscalaDeGrises extends FiltroImagen {

    public EscalaDeGrises() {
        super("Escala de Grises");
    }

    @Override
    public void procesar(int[][] imagen) {

        System.out.println("Convirtiendo imagen a escala de grises...");

        for (int i = 0; i < imagen.length; i++) {
            for (int j = 0; j < imagen[i].length; j++) {

                int gris = imagen[i][j] / 3;

                imagen[i][j] = gris;
            }
        }

        System.out.println("Imagen convertida a escala de grises.");
    }
}
