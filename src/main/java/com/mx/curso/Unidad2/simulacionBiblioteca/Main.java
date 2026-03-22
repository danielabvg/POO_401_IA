package com.mx.curso.Unidad2.simulacionBiblioteca;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Libro libro1 = new Libro("El Quijote", "Cervantes", 500);
        Revista revista1 = new Revista("National Geographic", "Varios", 202);

        biblioteca.agregarMaterial(libro1);
        biblioteca.agregarMaterial(revista1);

        biblioteca.mostrarMateriales();
    }
}
