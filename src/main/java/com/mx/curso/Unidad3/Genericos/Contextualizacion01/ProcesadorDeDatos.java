package com.mx.curso.Unidad3.Genericos.Contextualizacion01;

import java.util.List;
import java.util.Map;

public interface ProcesadorDeDatos<T, K, V> {

    void procesarSecuencia(List<T> elementos);

    void procesarMapa(Map<K, V> datosAsociativos);
}

class ProcesadorVision implements ProcesadorDeDatos<String, String, String> {

    @Override
    public void procesarSecuencia(List<String> elementos) {

    }

    @Override
    public void procesarMapa(Map<String, String> datosAsociativos) {

    }
}


class MotorRecomendaciones implements ProcesadorDeDatos<Integer, String, Double> {

    @Override
    public void procesarSecuencia(List<Integer> elementos) {

    }

    @Override
    public void procesarMapa(Map<String, Double> datosAsociativos) {

    }
}

class ProcesadorNumerico implements ProcesadorDeDatos<Double, Integer, Boolean> {

    @Override
    public void procesarSecuencia(List<Double> elementos) {

    }

    @Override
    public void procesarMapa(Map<Integer, Boolean> datosAsociativos) {

    }
}
