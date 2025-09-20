
package main.java.org.ex3;

public class Saida {

    private Produto produto;

    public Saida(Produto produto){
        this.produto = produto;
    }

    @Override
    public String toString(){

        return String.format("{ produtoNome: \"%s\", preco: %.2f, tipo: \"%s\" }", produto.getName(), produto.getPreco(), produto.getTipo());

    }
}
