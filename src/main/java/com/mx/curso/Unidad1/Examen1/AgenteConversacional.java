package com.mx.curso.Unidad1.Examen1;

public abstract class AgenteConversacional {
    private String nombre;
    private String tipo;

    // Constructor
    public AgenteConversacional(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    // polimorfismo
    public abstract void responder();
}
