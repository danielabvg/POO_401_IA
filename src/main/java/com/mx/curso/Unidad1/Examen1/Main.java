package com.mx.curso.Unidad1.Examen1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Polimorfismo: lista de tipo padre
        ArrayList<AgenteConversacional> bots = new ArrayList<>();

        bots.add(new ChatbotVentas("BotVentas1"));
        bots.add(new ChatbotSoporte("BotSoporte1"));

        // Un solo ciclo → diferentes comportamientos
        for (AgenteConversacional bot : bots) {
            bot.responder();
        }
    }
}
