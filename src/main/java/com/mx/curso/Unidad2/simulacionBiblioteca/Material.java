package com.mx.curso.Unidad2.simulacionBiblioteca;

public class Material {
    private String titulo;
    private String autor;

    public Material(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}
