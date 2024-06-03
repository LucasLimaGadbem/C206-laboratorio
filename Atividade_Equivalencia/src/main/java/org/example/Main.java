package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //para entrada de dados
        Scanner sc = new Scanner(System.in);

        //para acessar o arquivo
        Arquivo a = new Arquivo();

        //criando um ArrayList de clientes
        ArrayList<Cliente> clientes = new ArrayList<>();

        boolean flag = true;
        int opcao;

        while(flag){
            System.out.println("------------------");
            System.out.println("1 - Cadastrar clientes");
            System.out.println("2 - Listar os clientes");
            System.out.println("3 - Ordenar os clientes em ordem alfabetica");
            System.out.println("4 - Ordenar os clientes de Z-A");
            System.out.println("5 - sair");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao){
                case 1:
                    System.out.println("Dados do cliente");
                    System.out.println("Nome: ");
                    String nomecliente = sc.nextLine();
                    System.out.println("CPF: ");
                    String cpfcliente = sc.nextLine();
                    System.out.println("Endereco:");
                    String enderecocliente = sc.nextLine();
                    System.out.println("Idade:");
                    int idadecliente = sc.nextInt();

                    Cliente cliente = new Cliente(nomecliente,cpfcliente,enderecocliente,idadecliente);
                    a.escrever(cliente);
                    break;
                case 2:
                    clientes = a.ler();
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("CPF: " + clientes.get(i).getCpf());
                        System.out.println("Endereco: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;
                case 3:
                    clientes = a.ler();
                    Collections.sort(clientes);
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("CPF: " + clientes.get(i).getCpf());
                        System.out.println("Endereco: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;
                case 4:
                    clientes = a.ler();
                    Collections.sort(clientes);
                    Collections.reverse(clientes);
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println("Nome: " + clientes.get(i).getNome());
                        System.out.println("CPF: " + clientes.get(i).getCpf());
                        System.out.println("Endereco: " + clientes.get(i).getEndereco());
                        System.out.println("Idade: " + clientes.get(i).getIdade());
                    }
                    break;
                case 5:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalido");
            }
        }
        sc.close();
    }
}