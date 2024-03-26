package org.example;

public class Jogo {

    String nome;
    String genero;
    double preco;
    boolean dlc;
    Plataforma plataforma;

    public Jogo(String nome, String genero, double preco, boolean dlc, String nomePlat, String criador) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
        this.dlc = dlc;
        this.plataforma = new Plataforma(nomePlat, criador);
    }

    public void mostraInfo(){
        System.out.println("Nome do jogo: "+nome);
        System.out.println("Genero do jogo: "+genero);
        System.out.println("Preco do jogo: "+preco);
        if(dlc) {
            System.out.println("O jogo tem DLC");
        }
        else{
            System.out.println("O jogo nao tem DLC");
        }
    }
}
