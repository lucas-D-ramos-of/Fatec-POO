
package org.ex3;

import main.java.org.ex3.Produto;

public class Ex3 {

    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.40f, "Escritorio");

        Saida s = new Saida(produto);

        System.out.println(s);
    }
}
