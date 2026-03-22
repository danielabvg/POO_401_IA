package com.mx.curso.Unidad2.simulacionBiblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Material> materiales = new ArrayList<>();

    public void agregarMaterial(Material m) {
        materiales.add(m);
    }

    public void mostrarMateriales() {
        for (Material m : materiales) {
            m.mostrarInfo(); // Polimorfismo
        }
    }
}
