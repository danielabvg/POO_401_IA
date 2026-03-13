package com.mx.curso.Unidad1.AgenteIA;

import java.util.ArrayList;
import java.util.List;

public class MainAgentes {

    public static void main(String[] args) {

        List<AgenteIA> agentes = new ArrayList<>();

        agentes.add(new Explorador());
        agentes.add(new Recolector());
        agentes.add(new Defensor());

        for (AgenteIA agente : agentes) {

            agente.tomarDecision();

        }
    }
}
