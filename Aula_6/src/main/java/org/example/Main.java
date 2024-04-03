package org.example;

public class Main {
    public static void main(String[] args) {

        //Teste é uma classe
        //t1, t2 e t3 são objetos

        /*
        Teste t1 = new Teste();
        Teste t2 = new Teste();
        Teste t3 = new Teste();

        int contador = Teste.contador;
        System.out.println(contador);

        Teste t4 = new Teste();
        Teste t5 = new Teste();*/

        Funcionario f1 = new Funcionario("Jorge");
        Funcionario f2 = new Funcionario("Lylian");
        Funcionario f3 = new Funcionario("Lanna");

        System.out.println("Nome do funcionario "+f1.nome+" id: "+f1.id);
        System.out.println("Nome do funcionario "+f2.nome+" id: "+f2.id);
        System.out.println("Nome do funcionario "+f3.nome+" id: "+f3.id);

        //se nao tiver private no cont em funcionario, isso funciona
        //System.out.println(Funcionario.cont);
        //Funcionario.cont = 2000;
        //System.out.println(Funcionario.cont);

        System.out.println(Funcionario.getCont());

        //nao faz sentido ter set porque se nao isso funciona
        //Funcionario.setCont(0);
    }
}