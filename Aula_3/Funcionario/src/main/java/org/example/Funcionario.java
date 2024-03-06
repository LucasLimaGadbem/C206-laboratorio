package org.example;

public class Funcionario {

    String nome;
    int idade;
    double salario;

    public Funcionario() {
        System.out.println("Funcionario criado");
    }
    //sao diferentes por conta dos parametros
    public Funcionario(String nome, int idade, double salario) {
        System.out.println("Funcionario criado");
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //criar construtor, botao direito, generate, constructor, selected none, ok
    /*public Funcionario(){
        System.out.println("--Funcionario criado--");
    }*/

    public double calculaSalarioAnual(){
        double salaanual = salario * 12;

        return salaanual;
    }

    /*
    pode criar com o mesmo nome mas tem que diferenciar com os parametros
    ex: se um tiver String como parametro o outro tem que ser outro tipo ou
    String  e mais alguma coisa
     */

    /*public double calculaSalarioAnual(String mes, int idade){
        double salaanual = salario * 12;

        return salaanual;
    }*/

    public double calculaDecimoTerceiro(){
        double salaanual = salario * 13;

        return salaanual;
    }
}
