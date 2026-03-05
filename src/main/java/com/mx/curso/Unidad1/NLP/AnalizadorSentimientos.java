package com.mx.curso.Unidad1.NLP;

/*
 Clase que hereda de MotorIA.
 Este analizador busca ciertas palabras dentro del texto
 para determinar si el sentimiento es positivo, negativo o neutro.
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

        // Palabras positivas
        if (texto.contains("feliz") ||
                texto.contains("bueno") ||
                texto.contains("excelente") ||
                texto.contains("genial") ||
                texto.contains("increible") ||
                texto.contains("maravilloso") ||
                texto.contains("perfecto")) {

            System.out.println("Sentimiento: POSITIVO");
        }

        // Palabras negativas
        else if (texto.contains("malo") ||
                texto.contains("terrible") ||
                texto.contains("horrible") ||
                texto.contains("triste") ||
                texto.contains("pesimo") ||
                texto.contains("odio")) {

            System.out.println("Sentimiento: NEGATIVO");
        }

        // Si no se encuentra ninguna palabra
        else {
            System.out.println("Sentimiento: NEUTRO");
        }

        System.out.println("-----------------------");
    }
}

