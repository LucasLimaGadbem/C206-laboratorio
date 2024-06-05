package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InfoInvalidaException {

        //criando varivel para acessar o arquivo
        Arquivo a = new Arquivo();
        //criando a variavel para entradas de dados
        Scanner sc = new Scanner(System.in);
        //criando array de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        //criando variaveis para auxiliar
        boolean flag = true;
        int op;
        String nome, tipo;
        double preco;
        int com = 0;
        int hig = 0;
        int dec = 0;

        System.out.println("Bem vinda");

        //loop
        while(flag){
            //menu
            System.out.println("1 - adicionar produto");
            System.out.println("2 - mostrar produtos");
            System.out.println("3 - mostrar produtos em ordem decrescente de preco");
            System.out.println("4 - quantidade de produtos");
            System.out.println("5 - sair");
            //entrada que o usuario quer utilizar
            op = sc.nextInt();
            sc.nextLine();
            //analizando qual é a opção desejada
            switch (op){
                case 1:
                    System.out.println("Adicionar produto");
                    System.out.print("Nome: ");
                    nome = sc.nextLine();
                    System.out.print("Preco: ");
                    preco = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Tipo(Comida, Higiene, Decoração): ");
                    tipo = sc.nextLine();

                    //tentando rodar
                    try{
                        //se atende aos requisitos ira escrever no arquivo
                        if(preco > 0 && (tipo.equals("Comida") || tipo.equals("Higiene") || tipo.equals("Decoração"))){
                            Produto produto = new Produto(nome, preco, tipo);
                            a.escrever(produto);
                        }
                        //se não irá lançar uma exceção
                        else{
                            throw new InfoInvalidaException();
                        }
                    }
                    //se não rodar o try, irá avisar o usuário que algum dado foi colocado errado
                    catch (InfoInvalidaException e){
                        System.out.println("Erro!!!!");
                    }
                    break;
                case 2:
                    //lendo o que esta no arquivo
                    produtos = a.ler();
                    System.out.println();
                    //mostrando o nome, preco e tipo
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Preco: " + produtos.get(i).getPreco());
                        System.out.println("Tipo: " + produtos.get(i).getTipo());
                        System.out.println();
                    }
                    break;
                case 3:
                    //lendo o que esta no arquivo
                    produtos = a.ler();
                    //colocando em ordem decrescente de acordo com o preço
                    Collections.sort(produtos);
                    System.out.println();
                    //mostrando o nome, preco e tipo
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("Nome: " + produtos.get(i).getNome());
                        System.out.println("Preco: " + produtos.get(i).getPreco());
                        System.out.println("Tipo: " + produtos.get(i).getTipo());
                        System.out.println();
                    }
                    break;
                case 4:
                    //lendo o que esta no arquivo
                    produtos = a.ler();
                    //contando quantos produtos tem de cada tipo
                    for (int i = 0; i < produtos.size(); i++) {
                        if(produtos.get(i).getTipo().equals("Comida")){
                            com++;
                        }
                        else if(produtos.get(i).getTipo().equals("Higiene")){
                            hig++;
                        }
                        else if(produtos.get(i).getTipo().equals("Decoração")){
                            dec++;
                        }
                    }
                    //mostrando quantos produtos tem de cada tipo
                    System.out.println("Quantidade de produtos de: ");
                    System.out.println("Comida: "+com);
                    System.out.println("Higiene: "+hig);
                    System.out.println("Decoração: "+dec);
                    break;
                case 5:
                    //mudando a flag caso o usuario queira sair
                    flag = false;
                    break;
                default:
                    //caso inseriu algum numero invalido
                    System.out.println("Numero invalido");
            }
        }
        sc.close();
    }
}