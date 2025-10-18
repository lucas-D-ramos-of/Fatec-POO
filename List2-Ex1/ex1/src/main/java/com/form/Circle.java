
package com.form;

public class Circle extends Forma{

    private double radius;

    public Circle(double radius, String cor){
        this.radius = radius;
        super.cor = cor;

    }

    @Override
    public double calcularArea(){
        
        super.area = (3.14 * Math.pow(radius, 2));
        return area;
    }
}
