package main.java.org.ex3;

public class Produto {

    private String name, tipo;
    private float preco;

    public Produto(String name, float preco, String tipo) {
        this.name = name;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPreco() {
        return preco;
    }

    
}
