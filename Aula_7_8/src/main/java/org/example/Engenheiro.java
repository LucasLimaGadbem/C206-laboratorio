package org.example;

public class Engenheiro extends Funcionario implements GerenciaProjeto{

    private String ramo;

    public Engenheiro(String nome, int idade, float salario, String ramo) {
        super(nome, idade, salario);
        this.ramo = ramo;
    }

    public void setRamo(String ramo) {
        this.ramo = ramo;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Ramo do engenheiro "+this.ramo);
    }

    @Override
    public void executaAcao() {
        System.out.println("Esta codando");
    }

    @Override
    public void Gerencia() {
        System.out.println("Gerenciando projeto engenharia");
    }
}
