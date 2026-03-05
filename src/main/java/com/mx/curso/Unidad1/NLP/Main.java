package com.mx.curso.Unidad1.NLP;

/*
 Clase principal donde se usa el sistema de IA
*/
public class Main {

    public static void main(String[] args) {

        System.out.println("Sistema de IA iniciado...");

        // Creamos el modelo usando la clase abstracta
        MotorIA miModelo = new AnalizadorSentimientos();

        // Probamos diferentes textos
        miModelo.analizar("Hoy estoy muy feliz y todo es excelente");
        miModelo.analizar("El servicio fue terrible y horrible");
        miModelo.analizar("Hoy fui al supermercado");

        /*
         No podemos hacer:
         miModelo.precision = 5.0;

         porque precision es private (encapsulamiento).
         Solo se puede modificar con setPrecision().
        */
    }
}
