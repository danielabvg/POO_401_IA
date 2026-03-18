package com.mx.curso.Unidad1.Examen1;

public class ChatbotVentas extends AgenteConversacional {

    public ChatbotVentas(String nombre) {
        super(nombre, "Ventas");
    }

    @Override
    public void responder() {
        System.out.println(getNombre() + ": Te ayudo con información de productos y compras.");
    }
}
