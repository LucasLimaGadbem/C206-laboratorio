package org.example;

public class Elfo extends Habitante implements Cura{

    private String tribo;

    //contrutor de elfo
    public Elfo(String nome, int idade, float energia, String tribo) {
        super(nome, idade, energia);
        this.tribo = tribo;
    }

    //o elfo vai viajar
    public void viajar(){
        System.out.println("O elfo está viajando");
    }

    //sobrescrevendo atacar
    @Override
    public void atacar() {
        super.atacar();
        //personalizando para elfo
        System.out.println("O elfo atacou");
    }

    //sobrescrevendo mostraInfo
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        //personalizando para elfo
        System.out.println("Tribo: "+this.tribo);
    }

    //sobrescrevendo curar
    @Override
    public void curar() {
        //colocando 15% a mais de energia
        this.energia = this.energia + (this.energia*0.15F);
        //personalizando para elfo
        System.out.println("O elfo foi curado");
    }
}
