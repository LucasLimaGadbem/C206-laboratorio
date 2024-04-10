package org.example;

public abstract class Funcionario {

    private String nome;
    private int idade;
    private float salario;

    public Funcionario(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public void mostraInfo(){
        System.out.println("Nome "+this.nome);
        System.out.println("Idade "+this.idade);
        System.out.println("Salario "+this.salario);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public abstract void executaAcao();
}
