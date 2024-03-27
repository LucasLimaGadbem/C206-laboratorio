package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //criando o scanner
        Scanner sc = new Scanner(System.in);

        //entrando com as informacoes da arena
        System.out.println("Entre com o nome da arena: ");
        String nomeArena = sc.nextLine();
        System.out.println("Entre com o lugar da arena: ");
        String lugarArena = sc.nextLine();
        Arena arena = new Arena(nomeArena, lugarArena);

        boolean flag = true;
        int opcao;

        //loop
        while(flag){

            //menu de informacoes
            System.out.println("---------------");
            System.out.println("Bem vindo a Arena: ");
            System.out.println("1 - adicionar Rapper");
            System.out.println("2 - Mostrar informacoes (Arena e Rappers)");
            System.out.println("3 - Mostrar rappers com microfone dourado");
            System.out.println("4 - Primeiro e ultimo da batalha");
            System.out.println("5 - sair");

            //qual opcao deseja utilizar
            opcao = sc.nextInt();
            switch (opcao){
                //adicionar rapper
                case 1:
                    System.out.println("Nome do Rapper: ");
                    sc.nextLine();
                    String nomeRapper = sc.nextLine();
                    System.out.println("Nota do Rapper, de 1 a 10: ");
                    boolean flagNota = true;
                    float notaRapper = 0;
                    //limitando a nota de 0 a 10
                    while(flagNota){
                        notaRapper = sc.nextFloat();
                        if(0<=notaRapper && notaRapper<=10){
                            flagNota = false;
                        }
                        else{
                            System.out.println("Nota de 1 a 10");
                        }
                    }
                    System.out.println("Idade do Rapper: ");
                    int idadeRapper = sc.nextInt();
                    System.out.println("Material do microfone do Rapper: ");
                    boolean flagMaterial = true;
                    String microfone = "";
                    sc.nextLine();
                    //limitando o material do microfone a Dourado, madeira e plastico
                    while(flagMaterial){
                        microfone = sc.nextLine();
                        if(microfone.equals("Dourado") || microfone.equals("madeira") || microfone.equals("plastico")){
                            flagMaterial = false;
                        }
                        else{
                            System.out.println("Digite um material valido");
                        }
                    }
                    //criando o rapper
                    Rapper rapper1 = new Rapper(nomeRapper,notaRapper,idadeRapper,microfone);
                    //adicionando o rapper a arena
                    arena.addRapper(rapper1);
                    break;
                case 2:
                    //mostrando as informacoes
                    arena.mostraInfo();
                    break;
                case 3:
                    //mostrando quais rappers tem microfone dourado
                    arena.microfoneDou();
                    break;
                case 4:
                    //maior e menor nota da arena
                    arena.ranking();
                    break;
                case 5:
                    //saindo do codigo
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um numero valido");
                    break;
            }
        }
        //fechando o scanner
        sc.close();
    }
}