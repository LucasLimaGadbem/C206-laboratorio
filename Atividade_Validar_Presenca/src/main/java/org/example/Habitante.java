package org.example;

public abstract class Habitante {

    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma = new Arma();

    //construtor de Habitante
    public Habitante(int id, String nome, int idade, float energia) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
    }

    //o habitante esta atacando
    public void atacar(){
        //vendo se a arma é mágica
        if(arma.getMagica()){
            //tirando energia
            this.energia = this.energia - 20;
        }
        //se não for mágica
        else{
            //tirando energia
            this.energia = this.energia - 10;
        }
    }

    //mostrando informacoes dos Habitantes
    public void mostraInfo(){
        //utilizando o contador para contar o numero de habitantes
        this.contador++;
        System.out.println("Id: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
        System.out.println("Arma: "+this.arma.getNomeArma());
    }
}
