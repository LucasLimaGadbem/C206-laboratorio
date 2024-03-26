package org.example;

public class Carro {

    String modelo;
    String cor;
    boolean alugado;
    Motor motor;

    public Carro(String modelo, String cor, boolean alugado, Motor motor) {
        this.modelo = modelo;
        this.cor = cor;
        this.alugado = alugado;
        this.motor = motor;
    }

    public void mostraInfo(){
        System.out.println("Nome do modelo: " + this.modelo);
        System.out.println("Cor do carro: " + this.cor);
        System.out.println("Esta alugado: " + this.alugado);
        motor.mostraInfo();
    }

}
