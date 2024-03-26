package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro[] carros = new Carro[10];
        Scanner sc = new Scanner(System.in);

        boolean flag=true;

        System.out.println("Nome da locadora: ");
        String nomeLocadora = sc.nextLine();
        System.out.println("CNPJ da locadora: ");
        String cnpjLocadora = sc.nextLine();
        System.out.println("Endereco da locadora: ");
        String enderecoLocadora = sc.nextLine();
        Locadora locadora = new Locadora(nomeLocadora,cnpjLocadora,enderecoLocadora);

        while(flag)
        {
            System.out.println("-------------------------------------------");
            System.out.println("Bem-vindo ao menu de informações da Locadora:");
            System.out.println("1 - Adicionar um carro");
            System.out.println("2 - Informacoes dos carros");
            System.out.println("3 - Alugar um carro");
            System.out.println("4 - Quantidade de carros");
            System.out.println("5- Sair do menu");

            int op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Entre com o modelo do carro:");
                    sc.nextLine();
                    String modelo = sc.nextLine();
                    System.out.println("Entre com a cor do carro:");
                    String cor = sc.nextLine();
                    //System.out.println("O carro ja esta alugado?");
                    //boolean fim = sc.nextBoolean();
                    boolean fim = true;
                    System.out.println("Velocidade maxima");
                    float vm = sc.nextFloat();

                    Motor m1 = new Motor(vm);
                    Carro c1 = new Carro(modelo,cor,fim,m1);
                    locadora.adicionarCarro(c1);
                    break;
                case 2:
                    locadora.mostraInfo();
                    break;
                case 3:
                    System.out.println("Qual carro deseja alugar? De 0 a 9");
                    int index = sc.nextInt();
                    locadora.alugarCarros(index);
                    break;
                case 4:
                    float p = locadora.contarCarrosParaAlugar();
                    if(p == 0){
                        System.out.println("Nenhum carro disponivel");
                    }
                    else{
                        System.out.println(p+" carros estao disponiveis");
                    }
                    break;
                case 5:
                    flag = false;
                    System.out.println("Você saiu do menu!");
                    System.out.println("----------------------------");
                    break;
                default:
                    System.out.println("Digite um valor válido!");
                    break;
            }
        }

        sc.close();
    }
}