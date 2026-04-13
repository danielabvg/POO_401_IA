package com.mx.curso.Unidad2.ParadigmaOO;

class Forma {
    double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Forma {
    double base, altura;

    Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calcularArea() {
        return base * altura;
    }
}

public class MainFormas {
    public static void main(String[] args) {
        Forma[] formas = {
                new Circulo2(3),
                new Rectangulo(4, 5)
        };

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
