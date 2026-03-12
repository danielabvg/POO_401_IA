package com.mx.curso.Unidad1.LN;

public class ModeloGPT extends PLN {

    @Override
    public void procesarExpresion(String expresion) {
        System.out.println("ModeloGPT procesando expresión: " + expresion);
    }

    @Override
    public void acompletarTexto(String texto) {
        System.out.println("ModeloGPT completando texto: " + texto);
    }

    @Override
    public void procesarImagen(String imagen) {
        System.out.println("ModeloGPT analizando imagen: " + imagen);
    }

    @Override
    public void operaciones(String texto) {
        System.out.println("ModeloGPT realizando operaciones con: " + texto);
    }

    @Override
    public void generarRespuesta(String pregunta) {
        System.out.println("ModeloGPT generando respuesta para: " + pregunta);
    }

    @Override
    public void generarImagen(String descripcion) {
        System.out.println("ModeloGPT generando imagen de: " + descripcion);
    }

    @Override
    public void temperaturaModelo(double parametros) {
        System.out.println("ModeloGPT ajustando temperatura a: " + parametros);
    }
}
