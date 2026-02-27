package com.mx.curso.Unidad1.NLP;

/**
 * Clase abstracta que define el contrato general de un Motor de IA
 */
public abstract class MotorIA {

    // Atributos encapsulados
    private String nombreModelo;
    private double precision;

    public MotorIA(String nombre, double precision) {
        this.nombreModelo = nombre;
        setPrecision(precision); // validación
    }

    // Getter
    public String getNombre() {
        return nombreModelo;
    }

    public double getPrecision() {
        return precision;
    }

    // Setter con validación (Encapsulamiento)
    public void setPrecision(double precision) {
        if (precision >= 0.0 && precision <= 1.0) {
            this.precision = precision;
        } else {
            System.out.println("Error: La precisión debe estar entre 0.0 y 1.0");
        }
    }

    // Método abstracto (Contrato)
    public abstract void analizar(String texto);
}
