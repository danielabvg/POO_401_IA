package com.mx.curso.Unidad3.Listas;

import java.util.ArrayList;
import java.util.List;

public class MonitorIA {

    private int epoca;
    private double loss;
    private double accuracy;

    // Constructor
    public MonitorIA(int epoca, double loss, double accuracy) {
        this.epoca = epoca;
        this.loss = loss;
        this.accuracy = accuracy;
    }

    // Getters
    public int getEpoca() {
        return epoca;
    }

    public double getLoss() {
        return loss;
    }

    public double getAccuracy() {
        return accuracy;
    }

    // Setters
    public void setEpoca(int epoca) {
        this.epoca = epoca;
    }

    public void setLoss(double loss) {
        this.loss = loss;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    @Override
    public String toString() {
        return "MonitorIA{" +
                "epoca=" + epoca +
                ", loss=" + loss +
                ", accuracy=" + accuracy +
                '}';
    }

    public static void main(String[] args) {

        List<MonitorIA> metricas = new ArrayList<>();

        metricas.add(new MonitorIA(7, 0.12, 0.1));
        metricas.add(new MonitorIA(3, 0.62, 0.3));
        metricas.add(new MonitorIA(4, 0.22, 0.4));
        metricas.add(new MonitorIA(1, 0.32, 0.5));

        System.out.println("Lista de Metrica de Entrenamiento " + metricas);

        // Imprimir el primer y ultimo elemento
        System.out.println("Primer elemento: " + metricas.get(0));
        System.out.println("Ultimo elemento: " + metricas.get(metricas.size() - 1));

        // eliminar el primer y ultimo elemento
        metricas.remove(0);
        metricas.remove(metricas.size() - 1);

        // Iterar la lista de metricas y detectar el orden de inserccion
        for (MonitorIA m : metricas) {
            System.out.println(m);
        }
    }
}
