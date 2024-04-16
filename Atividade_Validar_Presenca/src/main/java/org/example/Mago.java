package org.example;

public class Mago extends Habitante implements Cura,Feitico{

    private String cor;

    //construtor para mago
    public Mago(String nome, int idade, float energia, String cor) {
        super(nome, idade, energia);
        this.cor = cor;
    }

    //sobrescrever atacar
    @Override
    public void atacar() {
        super.atacar();
        //personalizando para mago
        System.out.println("O magico atacou");
    }

    //sobrescrever mostraInfo
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        //personalizando para mago
        System.out.println("Cor: "+this.cor);
    }

    //sobrescrevendo curar
    @Override
    public void curar() {
        //somando 15% de energia
        this.energia = this.energia + (this.energia*0.15F);
        //personalizando para mago
        System.out.println("O mago foi curado");
    }

    //sobrescrevendo lancaFeitico
    @Override
    public void lancaFeitico() {
        //tirando 10% de energia
        this.energia = this.energia - (this.energia*0.1F);
        //personalizando para mago
        System.out.println("O mago lançou um feitiço");
    }
}
