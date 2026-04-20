package com.mx.curso.Unidad3.Practica03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new Cocinero());
        empleados.add(new Mesero());

        for (Empleado e : empleados) {
            e.saludar();
            e.trabajar();
            System.out.println("-------------------");
        }
    }
}