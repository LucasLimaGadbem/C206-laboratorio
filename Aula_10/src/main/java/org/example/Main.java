package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        /*
        ArrayList lista = new ArrayList();

        Conta c1 = new Conta(200, "Ana");

        lista.add(c1);
        lista.add(20);
        lista.add(true);
        lista.add("Nome");

        //usar o for com o i mais para adicionar
        //usar o for each mais para ler

        //remove o que esta na primeira posicao
        lista.remove(1);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }


        ArrayList <Integer> inteiros = new ArrayList<>();

        inteiros.add(120);
        inteiros.add(30);
        inteiros.add(1);
        inteiros.add(12);
        inteiros.add(20);

        System.out.println("O array como foi colocado");
        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
        }

        Collections.sort(inteiros);

        System.out.println("O array crescente");
        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
        }

        Collections.reverse(inteiros);

        System.out.println("O array decrescente");
        for (int i = 0; i < inteiros.size(); i++) {
            System.out.println(inteiros.get(i));
        }*/

        //Array list de contas

        ArrayList <Conta> contas = new ArrayList<>();

        Conta c1 = new Conta(300, "Clara");
        Conta c2 = new Conta(200, "Ana");
        Conta c3 = new Conta(500, "Skelen");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getSaldo());
            System.out.println(contas.get(i).getNome());
        }

        Collections.sort(contas);
        
        /*
        System.out.println("Ordenado por saldo crescente");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getSaldo());
            System.out.println(contas.get(i).getNome());
        }

        Collections.reverse(contas);

        System.out.println("Ordenado por saldo decrescente");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getSaldo());
            System.out.println(contas.get(i).getNome());
        }*/

        System.out.println("Ordenado por ordem alfabetica");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getSaldo());
            System.out.println(contas.get(i).getNome());
        }

        Collections.reverse(contas);

        System.out.println("Ordenado por ordem alfabetica inversa");
        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getSaldo());
            System.out.println(contas.get(i).getNome());
        }

    }
}