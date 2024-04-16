package org.example;

public class Anao extends Habitante implements Mineracao{

    private float altura;
    private String reino;

    //construtor do Anao
    public Anao(int id, String nome, int idade, float energia, float altura, String reino) {
        super(id, nome, idade, energia);
        this.altura = altura;
        this.reino = reino;
    }

    //sobrescrevendo atacar
    @Override
    public void atacar() {
        super.atacar();
        //personalizando para anao
        System.out.println("O anão atacou");
    }

    //sobrescrevendo mostraInfo
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        //personalizando para anao
        System.out.println("Altura: "+this.altura);
        System.out.println("Reino: "+this.reino);
    }

    //sobrescrevendo minerar
    @Override
    public void minerar() {
        //personalizando para minerar
        System.out.println("O anão está minerando");
    }
}
