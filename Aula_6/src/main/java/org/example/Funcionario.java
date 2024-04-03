package org.example;

public class Funcionario {

    //quando nao declara private ou public, ele cria automaticamente public
    //String nome = public String nome
    String nome;
    int id;
    private static int cont;

    public Funcionario(String nome) {
        this.nome = nome;
        cont++;
        this.id = cont;
    }

    public static int getCont() {
        return cont;
    }

    //nao faz sentido ter um set
    /*
    public static void setCont(int cont) {
        Funcionario.cont = cont;
    }*/
}
