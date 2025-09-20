package org.ex1;
import java.util.ArrayList;
import java.util.List;


public class Onibus {

    private double passagem;
    private List<Passageiro> passageiro = new ArrayList<>();

    public Onibus(double passagaem){

        this.passagem = passagaem;
    }

    public void AdicionarPassageiro(Passageiro p){
        passageiro.add(p);
    }

    public double valorPago(boolean e){

        if (e){
            return passagem/2;
        }
        return passagem;
    }

    public void listarPassageiros(){

        for (Passageiro p : passageiro){

            System.out.println("Nome: "+ p.getNome() + " Valor pago: "+ valorPago(p.getEstudante()));
        }

    }

    public void listarEstudantes(){
        
        for (Passageiro p : passageiro){
            if (p.getEstudante()){
                System.out.println("Nome: "+ p.getNome() + " Valor pago: "+ valorPago(p.getEstudante()));
            }
            
        }
    }

    public double calcularTotalPassagens(){

        double total = 0;

        for (Passageiro p : passageiro){
            if (p.getEstudante()){
                total += passagem/2;

            } else {
                total += passagem;
            }
            
        }

        return total;
        
    }
}
