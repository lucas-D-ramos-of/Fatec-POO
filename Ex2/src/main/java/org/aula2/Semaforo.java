package main.java.org.aula2;

import main.java.org.aula2.Estado;

public class Semaforo {

    private Estado estado;

    public Semaforo(Estado estado){
        this.estado = estado;
    }
    
    public void mudarProximo(){

        switch(estado){

            case Estado.AMARELO -> { estado = Estado.VERMELHO; }
            case Estado.VERDE -> { estado = Estado.AMARELO; }
            case Estado.VERMELHO -> { estado = Estado.VERDE; }

        }

        indicar();
    }

    public void mostrarEstado(){

        System.out.println("Estado: "+ estado);

    } 

    public void indicar(){
        switch(estado){

            case Estado.VERDE -> { System.out.println("Pode passar"); }
            case Estado.AMARELO -> { System.out.println("Reduzir velocidade"); }
            case Estado.VERMELHO -> { System.out.println("Parar"); }

        }
    }
}
