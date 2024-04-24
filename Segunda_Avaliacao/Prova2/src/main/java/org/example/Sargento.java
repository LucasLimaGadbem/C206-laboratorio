package org.example;

public class Sargento extends Soldado implements Defesa{

    private String especializacao;
    private int experienciaCombate;

    //construtor de Sargento
    public Sargento(String nome, long cpf, String especializacao, int experienciaCombate) {
        super(nome, cpf);
        this.especializacao = especializacao;
        this.experienciaCombate = experienciaCombate;
    }

    //mostrando informacoes
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Especialização: "+this.especializacao);
        //se nao tiver item
        if(itemEspecial == null){
            System.out.println("Experiencia Combate: "+this.experienciaCombate);
        }
        //se tiver item
        else {
            this.experienciaCombate = this.experienciaCombate + 300;
            System.out.println("Experiencia Combate: "+this.experienciaCombate);
        }
    }

    //como nao muda, apenas trazendo usandoItem como estava no UML
    @Override
    public void usandoItem() {
        super.usandoItem();
    }

    //defendendo
    @Override
    public void defender() {
        if(experienciaCombate > 650){
            System.out.println(getNome()+" conseguiu se defender");
        }
        else{
            System.out.println(getNome()+" não se defendeu");
        }
    }
}
