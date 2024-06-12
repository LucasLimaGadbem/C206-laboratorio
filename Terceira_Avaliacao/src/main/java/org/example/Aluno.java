package org.example;

public class Aluno implements Comparable<Aluno>{

    //variaveis que o aluno tem que ter
    private String Nome;
    private int Matricula;
    private String Curso;
    private float Média;

    //construtor com parametros para criacao do aluno
    public Aluno(String nome, int matricula, String curso, float média) {
        Nome = nome;
        Matricula = matricula;
        Curso = curso;
        Média = média;
    }

    //construtor sem parametros para utilizar na leitura do arquivo
    public Aluno() {
    }

    //getters and setters
    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getMatricula() {
        return Matricula;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String curso) {
        Curso = curso;
    }

    public float getMédia() {
        return Média;
    }

    public void setMédia(float média) {
        Média = média;
    }

    //sobreescrevendo o compareTo para ordenar em ordem crescente
    @Override
    public int compareTo(Aluno aluno) {
        return Float.compare(this.Média,aluno.Média);
    }
}
