package com.mx.curso.Unidad1.NLP;

/*
 Clase principal
*/
public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema iniciado...");

        // Polimorfismo: usamos la clase abstracta como referencia
        MotorIA miModelo = new AnalizadorSentimientos();

        miModelo.analizar("Hoy estoy muy feliz y todo es bueno");
        miModelo.analizar("El servicio fue terrible");

        /*
         No puedes hacer:
         miModelo.precision = 5.0;
         porque precision es private.
        */
    }
}
