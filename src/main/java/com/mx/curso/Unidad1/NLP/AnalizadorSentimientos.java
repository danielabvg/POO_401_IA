package com.mx.curso.Unidad1.NLP;

/**
 * Implementación concreta del MotorIA
 */
public class AnalizadorSentimientos extends MotorIA {

    public AnalizadorSentimientos() {
        super("Sentiment-BERT-Lite", 0.89);
    }

    @Override
    public void analizar(String texto) {

        System.out.println("\n--- Ejecutando Modelo: " + getNombre() + " ---");
        System.out.println("Precisión: " + getPrecision());

        // Simulación del proceso interno (oculto al usuario)
        System.out.println("[INFO] Tokenizando texto...");
        System.out.println("[INFO] Extrayendo embeddings semánticos...");

        if (texto.toLowerCase().contains("feliz") ||
                texto.toLowerCase().contains("bueno")) {

            System.out.println("Resulatado: Sentimiento Positivo (Score: " + Math.random() + ")");
        } else {
            System.out.println("Resultado: Sentimiento Negativo o Neutro.");
        }

        System.out.println("--------------------------------------");
    }
}
