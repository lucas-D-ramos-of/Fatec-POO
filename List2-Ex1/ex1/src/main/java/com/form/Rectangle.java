package com.form;

public class Rectangle extends Forma{

    private double largura, altura;

    public Rectangle(double altura, double largura, String cor){
        this.largura = largura;
        this.altura = altura;

        super.cor = cor;
    }

    @Override
    public double calcularArea(){
        super.area = (altura * largura);
        return area;
    }
}
