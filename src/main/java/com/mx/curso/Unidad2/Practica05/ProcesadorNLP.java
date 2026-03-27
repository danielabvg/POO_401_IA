package com.mx.curso.Unidad2.Practica05;

import java.util.*;

public abstract class ProcesadorNLP {

    protected String textoCrudo;

    public void cargarTexto(String texto) {
        this.textoCrudo = texto;
    }

    // Contrato
    public abstract void limpiarTexto();
    public abstract List<String> tokenizar();
    public abstract Object transformarParaModelo();
}
