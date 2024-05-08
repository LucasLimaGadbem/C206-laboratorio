package org.example;

public class Conta implements Comparable<Conta>{

    private float saldo;
    private String nome;

    public Conta(float saldo, String nome) {
        this.saldo = saldo;
        this.nome = nome;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getNome() {
        return nome;
    }

    /*
    @Override
    public int compareTo(Conta o) {
        return Float.compare(this.saldo,o.saldo);
    }
    */

    @Override
    public int compareTo(Conta o) {
        return nome.compareTo(o.nome);
    }

}
