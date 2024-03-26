package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ninja[] ninjas = new Ninja[10];
        Aldeia a1 = new Aldeia();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        boolean fla = true;

        a1.nome = "Aldeia do ar";
        a1.regiao = "Ceu";

        while(flag) {

            System.out.println("-------------------");
            System.out.println("1 - adicionar ninja");
            System.out.println("2 - mostrar ninjas");
            System.out.println("3 - mostrar ninjas ranking S");
            System.out.println("4 - mostrar titulos dos ninjas");
            System.out.println("5 - sair");

            int op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nome do ninja");
                    String nomeNinja = sc.nextLine();
                    System.out.println("Idade do ninja");
                    int idadeNinja = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Titulos do ninja: Gennin, Chunnin e ANBU");
                    String titNinja = sc.nextLine();
                    while(fla){
                    if(titNinja.equals("Gennin") || titNinja.equals("Chunnin") || titNinja.equals("ANBU")){
                        fla = false;
                    }
                    else{
                        System.out.println("Titulo invalido");
                        titNinja = sc.nextLine();
                    }
                    }
                    fla = true;
                    System.out.println("Ranking do ninja: S-A-B-C-D");
                    String rankNinja = sc.nextLine();
                    while(fla) {
                        if(rankNinja.equals("S") || rankNinja.equals("A") ||rankNinja.equals("B") ||rankNinja.equals("C") ||rankNinja.equals("D")) {
                            fla = false;
                        }
                        else{
                            System.out.println("Rank invalido");
                            rankNinja = sc.nextLine();
                        }
                    }

                    Ninja n1 = new Ninja(nomeNinja,idadeNinja,titNinja,rankNinja);
                    a1.adicionarNinja(n1);
                    break;
                case 2:
                    a1.mostraInfo();
                    break;
                case 3:
                    a1.rankingS();
                    break;
                case 4:
                    a1.qtdTitulos();
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Digite um valor válido");
                    break;
            }
        }
        sc.close();
    }
}