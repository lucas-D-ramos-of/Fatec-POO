package com.form;

public abstract class Forma {

    protected  String cor;
    protected  double area;

    public double calcularArea(){
        return area;
    };

    @Override
    public String toString(){
        return String.format("Cor: %s, Area: %.2f", cor, area);
    }
}
