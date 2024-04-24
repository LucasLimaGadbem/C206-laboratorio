package org.example;

public class Oficial extends Soldado implements Defesa{

    private String patente;

    //construtor de Oficial
    public Oficial(String nome, long cpf, String patente) {
        super(nome, cpf);
        this.patente = patente;
    }

    //mostrando informacoes
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Patente: "+this.patente);
    }

    //como nao muda, apenas trazendo usandoItem como estava no UML
    @Override
    public void usandoItem() {
        super.usandoItem();
    }

    //defendendo
    @Override
    public void defender() {
        if(itemEspecial == null){
            System.out.println(getNome()+" não se defendeu");
        }
        else{
            System.out.println(getNome()+" conseguiu se defender");
        }
    }
}
