package org.example;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        //variaveis primitivas
        int idade = 10;
        float peso = 3.4F;
        double altura = 1.75;

        //variavel por referencia/classe
        String nome = "Lucas";
         */

        /*
        //casting, transformando um numero double para float
        double numerodouble = 1.65;
        float numfloat = (float) numerodouble;
         */

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Entre com seu peso: ");
        double peso = entrada.nextDouble();
        entrada.nextLine(); // comentar algo depois de um numero
        System.out.println("Entre com o nome da sua mae: ");
        String nomemae = entrada.nextLine();
    }
}