package org.example;

public class Rapper {

    String nome;
    float nota;
    int idade;
    Microfone microfone;

    //construtor do rapper
    public Rapper(String nome, float nota, int idade, String mat) {
        this.nome = nome;
        this.nota = nota;
        this.idade = idade;
        this.microfone = new Microfone(mat); //composicao
    }

    //mostrando as informacoes do rapper
    public void mostraInfo(){
        System.out.println("Nome do rapper: "+this.nome);
        System.out.println("Nota do rapper: "+this.nota);
        System.out.println("Idade do rapper: "+this.idade);
        System.out.println("Material do microfone do rapper: "+this.microfone.material);
    }
}