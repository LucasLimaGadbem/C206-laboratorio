package org.example;

public abstract class Habitante {

    public static int contador;
    protected int id;
    protected String nome;
    protected int idade;
    protected float energia;
    Arma arma = new Arma();

    //construtor de Habitante
    public Habitante( String nome, int idade, float energia) {
        this.nome = nome;
        this.idade = idade;
        this.energia = energia;
        //igualando o id do habitante ao contador
        this.id = contador;
        //aumentando 1 no contador
        contador++;
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
        System.out.println("Id: "+this.id);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Energia: "+this.energia);
        System.out.println("Arma: "+this.arma.getNomeArma());
        if(this.arma.getMagica()){
            System.out.println("A arma é mágica");
        }
        else{
            System.out.println("A arma não é mágica");
        }
    }
}
