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
        //criando array de alunos
        ArrayList<Aluno> alunos = new ArrayList<>();

        //criando variaveis para auxiliar
        boolean flag = true;
        int op;
        String nome;
        String curso;
        float media;
        int matricula;
        int com = 0;
        int sof = 0;
        int tel = 0;

        System.out.println("Bem vinda");

        //loop
        while(flag){
            //menu
            System.out.println("1 - adicionar aluno");
            System.out.println("2 - mostrar alunos");
            System.out.println("3 - mostrar alunos em ordem crescente de media");
            System.out.println("4 - quantidade de alunos");
            System.out.println("5 - sair");
            //entrada que o usuario quer utilizar
            op = sc.nextInt();
            //analizando qual é a opção desejada
            switch (op){
                case 1:

                    System.out.println("Adicionar aluno");
                    System.out.print("Nome: ");
                    sc.nextLine();
                    nome = sc.nextLine();
                    System.out.print("Matricula: ");
                    matricula = sc.nextInt();
                    System.out.print("Curso(Computacao, Software, Telecomunicacoes): ");
                    sc.nextLine();
                    curso = sc.nextLine();
                    System.out.print("Media: ");
                    media = sc.nextInt();

                    //tentando rodar
                    try{
                        //se atende aos requisitos ira escrever no arquivo
                        if(matricula > 0 && (curso.equals("Computacao") || curso.equals("Software") || curso.equals("Telecomunicacoes"))){
                            Aluno aluno = new Aluno(nome,matricula,curso,media);
                            a.escrever(aluno);
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
                    alunos = a.ler();
                    System.out.println();
                    //mostrando o nome, matricula, curso e media
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Media: " + alunos.get(i).getMédia());
                        System.out.println();
                    }
                    break;
                case 3:
                    //lendo o que esta no arquivo
                    alunos = a.ler();
                    //colocando em ordem crescente de acordo com a media
                    Collections.sort(alunos);
                    System.out.println();
                    //mostrando o nome, matricula, curso e media
                    for (int i = 0; i < alunos.size(); i++) {
                        System.out.println("Nome: " + alunos.get(i).getNome());
                        System.out.println("Matricula: " + alunos.get(i).getMatricula());
                        System.out.println("Curso: " + alunos.get(i).getCurso());
                        System.out.println("Media: " + alunos.get(i).getMédia());
                        System.out.println();
                    }
                    break;
                case 4:
                    //lendo o que esta no arquivo
                    alunos = a.ler();
                    //contando quantos alunos tem de cada curso
                    for (int i = 0; i < alunos.size(); i++) {
                        if(alunos.get(i).getCurso().equals("Computacao")){
                            com++;
                        }
                        else if(alunos.get(i).getCurso().equals("Software")){
                            sof++;
                        }
                        else if(alunos.get(i).getCurso().equals("Telecomunicacoes")){
                            tel++;
                        }
                    }
                    //mostrando quantos alunos tem de cada curso
                    System.out.println("Quantidade de alunos de: ");
                    System.out.println("Computacao: "+com);
                    System.out.println("Software: "+sof);
                    System.out.println("Telecomunicacoes: "+tel);
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