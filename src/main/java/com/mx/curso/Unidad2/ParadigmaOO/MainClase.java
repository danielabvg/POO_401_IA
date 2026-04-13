package com.mx.curso.Unidad2.ParadigmaOO;

import java.util.ArrayList;

class Estudiante {
    String nombre;
    int id;

    Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}

class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> estudiantes = new ArrayList<>();

    void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.nombre);
        }
    }
}

public class MainClase {
    public static void main(String[] args) {
        Clase c = new Clase();
        c.nombreDeClase = "POO";

        c.agregarEstudiante(new Estudiante("Ana", 1));
        c.agregarEstudiante(new Estudiante("Luis", 2));

        c.mostrarEstudiantes();
    }
}
