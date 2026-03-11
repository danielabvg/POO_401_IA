package com.mx.curso.Unidad1.Pipeline;

import com.mx.curso.Unidad1.FiltroImagen.FiltroImagen;

public class ReductorDeRuido extends FiltroImagen {

    public ReductorDeRuido() {
        super("Reductor de Ruido");
    }

    @Override
    public void procesar(int[][] imagen) {

        System.out.println("Aplicando reducción de ruido...");

        for (int i = 1; i < imagen.length - 1; i++) {
            for (int j = 1; j < imagen[i].length - 1; j++) {

                int promedio = (
                        imagen[i][j] +
                                imagen[i-1][j] +
                                imagen[i+1][j] +
                                imagen[i][j-1] +
                                imagen[i][j+1]
                ) / 5;

                imagen[i][j] = promedio;
            }
        }

        System.out.println("Ruido reducido.");
    }
}
