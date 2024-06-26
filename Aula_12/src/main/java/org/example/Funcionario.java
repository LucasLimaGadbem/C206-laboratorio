package org.example;

public class Funcionario {

    // Atributos do funcionário
    private String nomeFunc;
    private String cpfFunc;
    private int idadeFunc;

    public Funcionario(String nomeFunc, String cpfFunc, int idadeFunc) {
        this.nomeFunc = nomeFunc;
        this.cpfFunc = cpfFunc;
        this.idadeFunc = idadeFunc;
    }

    public Funcionario() {
    }

    // Getters and setters

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getCpfFunc() {
        return cpfFunc;
    }

    public void setCpfFunc(String cpfFunc) {
        this.cpfFunc = cpfFunc;
    }

    public int getIdadeFunc() {
        return idadeFunc;
    }

    public void setIdadeFunc(int idadeFunc) {
        this.idadeFunc = idadeFunc;
    }
}
