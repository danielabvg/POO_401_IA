package com.mx.curso.Unidad2.simulacionBiblioteca;

public class Libro extends Material {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(titulo, autor);
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Libro: " + getTitulo() +
                ", Autor: " + getAutor() +
                ", Páginas: " + numeroPaginas);
    }
}
