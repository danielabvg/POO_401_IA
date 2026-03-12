package com.mx.curso.Unidad1.LN;

public class ModeloJava extends PLN {

    @Override
    public void procesarExpresion(String expresion) {
        System.out.println("ModeloJava procesando expresión: " + expresion);
    }

    @Override
    public void acompletarTexto(String texto) {
        System.out.println("ModeloJava completando texto: " + texto);
    }

    @Override
    public void procesarImagen(String imagen) {
        System.out.println("ModeloJava procesando imagen: " + imagen);
    }

    @Override
    public void operaciones(String texto) {
        System.out.println("ModeloJava ejecutando operaciones con: " + texto);
    }

    @Override
    public void generarRespuesta(String pregunta) {
        System.out.println("ModeloJava generando respuesta para: " + pregunta);
    }

    @Override
    public void generarImagen(String descripcion) {
        System.out.println("ModeloJava generando imagen de: " + descripcion);
    }

    @Override
    public void temperaturaModelo(double parametros) {
        System.out.println("ModeloJava ajustando temperatura a: " + parametros);
    }
}
