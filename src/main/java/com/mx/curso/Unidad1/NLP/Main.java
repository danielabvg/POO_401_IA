package com.mx.curso.Unidad1.NLP;

/**
 * Clase principal que usa el sistema
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de IA Iniciado...");

        // Polimorfismo: referencia abstracta
        MotorIA miModelo = new AnalizadorSentimientos();

        miModelo.analizar("Hoy es un día muy bueno y estoy feliz");
        miModelo.analizar("El servicio fue terrible");

        /*
         REFLEXIÓN:
         ¿Puedes hacer miModelo.precision = 5.0? → No.
         Porque el atributo es private (Encapsulamiento).

         Solo puede modificarse con setPrecision()
         y además tiene validación entonces no se podría.
        */
    }
}
