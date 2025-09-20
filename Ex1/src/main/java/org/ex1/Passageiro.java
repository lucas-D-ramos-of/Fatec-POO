package org.ex1;

public class Passageiro {

    private String nome;
    private boolean estudante;

    Passageiro(String nome, boolean esdutante){

        this.nome = nome;
        this.estudante = esdutante;
    }

    public boolean getEstudante(){
        return estudante;
    }

    public String getNome(){
        return nome;
    }

}
