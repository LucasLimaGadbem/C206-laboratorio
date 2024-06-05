package org.example;

public class Produto implements Comparable<Produto>{

    //variaveis que o produto tem que ter
    private String nome;
    private double preco;
    private String tipo;

    //construtor com parametros para criacao do produto
    public Produto(String nome, double preco, String tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    //construtor sem parametros para utilizar na leitura do arquivo
    public Produto() {
    }

    //getters and setters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //sobreescrevendo o compareTo para ordenar em ordem decrescente
    @Override
    public int compareTo(Produto o) {
        return Double.compare(o.preco,this.preco);
    }
}
