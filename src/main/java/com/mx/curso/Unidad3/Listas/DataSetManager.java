package com.mx.curso.Unidad3.Listas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DataSetManager {

    public static void main(String[] args) {

        List<String> dataset = new ArrayList<>();
        dataset.add("gato_01.jpg");
        dataset.add("gato_02.jpg");
        dataset.add("gato_03.jpg");
        dataset.add("gato_04.jpg");

        System.out.println("data set original " + dataset);

        // Metodo para saber el tamaño de la lista
        System.out.println("Tamaño de la lista (Dataset): " + dataset.size());

        // Saber si la lista contiene un elemento en específico
        if (dataset.contains("gato_05.png")) {
            int index = dataset.indexOf("gato_05.png");
            System.out.println("Lo encontro en posicion: " + index);
            dataset.remove(index);
        }

        // Creación de una sublista
        List<String> subLista = dataset.subList(0, 3);
        System.out.println("SubLista " + subLista);

        // Para reemplazar un elemento en específico
        dataset.set(0, dataset.get(0).replace(".jpg", ".tmp"));
        System.out.println("dataSet " + dataset);

        // Metodo clear
        System.out.println("Ultimo elemento " + dataset.get(0));
        dataset.clear();
        System.out.println("Tamaño de la lista actual " + dataset.size());
    }
}
