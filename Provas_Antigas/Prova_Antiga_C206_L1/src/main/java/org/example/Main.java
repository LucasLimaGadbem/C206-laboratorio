package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Jogo[] jogos = new Jogo[10];
        Plataforma plataforma = new Plataforma("Steam", "Lucas");
        boolean flag = true;
        int op = 0;
        boolean dlcs = true;
        Scanner sc = new Scanner(System.in);
        boolean stdlc = true;

        while (flag) {

            System.out.println("------------------");
            System.out.println("1 - Mostrar informacoes");
            System.out.println("2 - Adicionar jogo");
            System.out.println("3 - Mostrar jogo mais caro e o mais barato");
            System.out.println("4 - Quantos jogos tem DLC");
            System.out.println("5 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    plataforma.mostraInfo();
                    break;
                case 2:
                    System.out.println("Insira o nome do jogo");
                    String nomeJogo = sc.nextLine();
                    System.out.println("Insira o nome do genero");
                    String generoJogo = sc.nextLine();
                    System.out.println("Insira o preco do jogo");
                    double precoJogo = sc.nextDouble();
                    System.out.println("Tem DLC?");
                    stdlc = true;
                    String teste;
                    sc.nextLine();
                    while (stdlc) {
                        teste = sc.nextLine();
                        if (teste.equals("sim") || teste.equals("nao")) {
                            stdlc = false;
                            if(teste.equals("sim")){
                                dlcs = true;
                            }
                            else{
                                dlcs = false;
                            }
                        }
                        else{
                            System.out.println("Invalido, sim ou nao");
                        }
                    }
                    System.out.println("Nome da plataforma: ");
                    String nomePlataforma = sc.nextLine();
                    System.out.println("Criador: ");
                    String criador = sc.nextLine();
                    Jogo jogo1 = new Jogo(nomeJogo,generoJogo,precoJogo,dlcs,nomePlataforma, criador);
                    plataforma.adicionaJogo(jogo1);
                        break;
                        case 3:
                            plataforma.mostraMaisCaroBarato();
                            break;
                        case 4:
                            plataforma.calculaDLC();
                            break;
                        case 5:
                            flag = false;
                            break;

                    }
            }

            sc.close();
        }
    }