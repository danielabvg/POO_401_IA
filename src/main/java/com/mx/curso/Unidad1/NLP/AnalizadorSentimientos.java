package com.mx.curso.Unidad1.NLP;

/*
 Clase que hereda de MotorIA
*/
public class AnalizadorSentimientos extends MotorIA {

    // Constructor
    public AnalizadorSentimientos() {
        super("ModeloSimpleSentimientos", 0.85);
    }

    // Implementación del método abstracto
    @Override
    public void analizar(String texto) {

        System.out.println("Usando modelo: " + getNombreModelo());

        // Convertimos el texto a minúsculas
        texto = texto.toLowerCase();

        if (texto.contains("feliz") || texto.contains("bueno")) {
            System.out.println("Sentimiento: POSITIVO");
        } else {
            System.out.println("Sentimiento: NEGATIVO");
        }

        System.out.println("-----------------------");
    }
}
