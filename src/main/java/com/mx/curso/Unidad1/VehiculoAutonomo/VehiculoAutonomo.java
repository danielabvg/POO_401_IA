package com.mx.curso.Unidad1.VehiculoAutonomo;

public abstract class VehiculoAutonomo {

    public abstract void detectarEntorno();

    public abstract void planearRuta(String destino);

    public abstract void acelerar(double velocidad);

    public abstract void frenar();

    public abstract void girar(String direccion);

    public abstract void estacionarse();

    public abstract void modoAutonomo(boolean activar);
}
