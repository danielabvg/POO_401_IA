package com.mx.curso.Unidad1.Examen1;

public class ChatbotSoporte extends AgenteConversacional {

    public ChatbotSoporte(String nombre) {
        super(nombre, "Soporte");
    }

    @Override
    public void responder() {
        System.out.println(getNombre() + ": Te ayudo a resolver problemas técnicos.");
    }
}
