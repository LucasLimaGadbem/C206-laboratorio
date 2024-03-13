package org.example;

public class Produto {

    //atributos do produto
    String nome;
    int nota;
    Fabricante fabricante;
    int quantidade;

    //construtor produto
    public Produto(String nome, int nota, String nomefabri, int cnpj, int quantidade) {
        this.nome = nome;
        this.nota = nota;
        this.fabricante = new Fabricante(nomefabri,cnpj);
        this.quantidade = quantidade;
    }

    public void mostraInfo(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("Nota do produto: " + this.nota);
        System.out.println("Quantidade do produto: " + this.quantidade);
        System.out.println("Nome do fabricante: " + this.fabricante.nome);
        System.out.println("CNPJ do fabricante: " + this.fabricante.cnpj);
    }
}
