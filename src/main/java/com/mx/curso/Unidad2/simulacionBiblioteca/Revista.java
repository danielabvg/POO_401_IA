package com.mx.curso.Unidad2.simulacionBiblioteca;

public class Revista extends Material {
    private int edicion;

    public Revista(String titulo, String autor, int edicion) {
        super(titulo, autor);
        this.edicion = edicion;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Revista: " + getTitulo() +
                ", Autor: " + getAutor() +
                ", Edición: " + edicion);
    }
}
