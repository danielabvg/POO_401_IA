package com.mx.curso.Unidad2.ParadigmaOO;

class Producto {
    String nombre;
    double precio;

    void mostrarDetalles() {
        System.out.println(nombre + " $" + precio);
    }
}

class Electronica extends Producto {
    int garantia;

    @Override
    void mostrarDetalles() {
        System.out.println(nombre + " $" + precio + " Garantía: " + garantia + " años");
    }
}

class Alimento extends Producto {
    String fechaDeCaducidad;

    @Override
    void mostrarDetalles() {
        System.out.println(nombre + " $" + precio + " Caduca: " + fechaDeCaducidad);
    }
}

public class MainProductos {
    public static void main(String[] args) {
        Producto[] productos = new Producto[2];

        Electronica e = new Electronica();
        e.nombre = "Laptop";
        e.precio = 15000;
        e.garantia = 2;

        Alimento a = new Alimento();
        a.nombre = "Leche";
        a.precio = 25;
        a.fechaDeCaducidad = "10/05/2026";

        productos[0] = e;
        productos[1] = a;

        for (Producto p : productos) {
            p.mostrarDetalles();
        }
    }
}
