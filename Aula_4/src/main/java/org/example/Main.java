package org.example;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("fusca","vermelho",2000 /*80*/);

        Motor m1 = new Motor(80);

        System.out.println("nome do carro " + c1.nome);
        System.out.println("cor do carro " + c1.cor);
        System.out.println("ano do carro " + c1.ano);
        //System.out.println(c1.motor.cv);

        c1.motor = m1;

        System.out.println("motor m1 " + c1.motor.cv);
    }
}