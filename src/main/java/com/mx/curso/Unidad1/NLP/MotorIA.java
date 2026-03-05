package com.mx.curso.Unidad1.NLP;

/*
 Clase abstracta que representa un motor de IA.
 Define los atributos básicos de un modelo y el método analizar().
*/
public abstract class MotorIA {

    // Atributos privados (encapsulamiento)
    private String nombreModelo;
    private double precision;

    // Constructor
    public MotorIA(String nombreModelo, double precision) {
        this.nombreModelo = nombreModelo;
        this.precision = precision;
    }

    // Getter para el nombre del modelo
    public String getNombreModelo() {
        return nombreModelo;
    }

    // Getter para la precisión
    public double getPrecision() {
        return precision;
    }

    // Setter con validación simple
    public void setPrecision(double precision) {
        if (precision >= 0.0 && precision <= 1.0) {
            this.precision = precision;
        } else {
            System.out.println("La precisión debe estar entre 0.0 y 1.0");
        }
    }

    // Método abstracto (contrato)
    public abstract void analizar(String texto);
}
