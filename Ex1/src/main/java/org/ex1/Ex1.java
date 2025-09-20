package org.ex1;

public class Ex1 {

    public static void main(String[] args) {

        Passageiro p1 = new Passageiro("Lucas", false);
        Passageiro p2 = new Passageiro("Murilo", true);
        Passageiro p3 = new Passageiro("Guilherme", true);
        Passageiro p4 = new Passageiro("Thiago", true);
        Passageiro p5 = new Passageiro("Marcos", false);

        Onibus o = new Onibus(10);
        o.AdicionarPassageiro(p1);
        o.AdicionarPassageiro(p2);
        o.AdicionarPassageiro(p3);
        o.AdicionarPassageiro(p4);
        o.AdicionarPassageiro(p5);

        o.listarPassageiros();
        o.listarEstudantes();
        System.out.println("Total passagens: "+ o.calcularTotalPassagens());
        
    }
}
