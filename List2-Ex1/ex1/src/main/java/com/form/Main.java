package com.form;

public class Main {
    public static void main(String[] args) {

        Forma circulo = new Circle(10, "Azul");
        circulo.calcularArea();

        Forma retangulo = new Rectangle(5, 5, "Vermelho");
        retangulo.calcularArea();

        System.out.println("Circulo: \n"+circulo);
        System.out.println("Retangulo: \n"+retangulo);
    }
}