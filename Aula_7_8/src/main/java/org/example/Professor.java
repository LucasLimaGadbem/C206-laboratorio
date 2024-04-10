package org.example;

public class Professor extends Funcionario{

    private String materia;

    public Professor(String nome, int idade, float salario, String materia) {
        super(nome, idade, salario);
        this.materia = materia;
    }

    public void corrigirProva(){
        System.out.println("Corrigindo prova");
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Materia do professor "+this.materia);
    }

    @Override
    public void executaAcao() {
        System.out.println("Da aula");
    }
}
