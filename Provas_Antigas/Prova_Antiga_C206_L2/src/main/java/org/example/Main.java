package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Serie[] series = new Serie[10];
        Scanner sc = new Scanner(System.in);

        Plataforma plataforma = new Plataforma("Netflix");
        boolean fl = true;
        //boolean no = true;
        //boolean finish = true;
        int op;

        while(fl){
            System.out.println("----------------");
            System.out.println("Bem vindo ao menu de informacoes da plataforma:");
            System.out.println("1 - adicionar serie");
            System.out.println("2 - mostrar info plataforma");
            System.out.println("3 - maior serie finalizada");
            System.out.println("4 - media e porcentagem");
            System.out.println("5 - sair");
            op = sc.nextInt();
            switch (op){
                case 1:
                    System.out.println("Nome da serie");
                    sc.nextLine();
                    String nomeSerie = sc.nextLine();
                    System.out.println("Nota da serie");
                    double notaSerie = sc.nextInt();
                    sc.nextLine();
                    /*no = true;
                    while (no){
                        notaSerie = sc.nextInt();
                        if(notaSerie < 0 || notaSerie > 10){
                            System.out.println("Nota invalida, de 0 a 10");
                        }
                        else{
                            no = false;
                        }
                    }*/
                    System.out.println("Numero de temporadas");
                    int tempSerie = sc.nextInt();
                    System.out.println("Foi finalizada?");
                    boolean fim = sc.nextBoolean();
                    /*String finalSerie;
                    no = true;
                    sc.nextLine();
                    while(no){
                        finalSerie = sc.nextLine();
                        if(finalSerie.equals("sim") || finalSerie.equals("nao")){
                            no = false;
                            if(finalSerie.equals("sim")){
                                finish = true;
                            }
                            else{
                                finish = false;
                            }
                        }
                        else{
                            System.out.println("Invalido, true ou false");
                        }
                    }*/
                    System.out.println("Nome do diretor");
                    sc.nextLine();
                    String nomeDiretor = sc.nextLine();

                    Serie serie1 = new Serie(nomeSerie,notaSerie,tempSerie,fim,nomeDiretor);
                    plataforma.addSerie(serie1);
                    break;
                case 2:
                    plataforma.mostraInfo();
                    break;
                case 3:
                    /*
                    String ma = "ntc";
                    String f = "nenhuma";
                    String p;
                    p = plataforma.serieMaisLongaFinalizada();
                    if(f.equals(p)){
                        System.out.println("Nenhuma serie finalizada no sistema");
                    }
                    else if(ma.equals(p)){
                        System.out.println("Nao ha series cadastradas");
                    }
                    else {
                        System.out.println("A seria mais longa é a: " + p);
                    }*/
                    System.out.println(plataforma.serieMaisLongaFinalizada());
                    break;
                case 4:
                    plataforma.mediaPorcentagem();
                    break;
                case 5:
                    fl = false;
                    System.out.println("Voce saiu do menu");
                    System.out.println("------------------");
                    break;
            }
        }

        sc.close();
    }
}