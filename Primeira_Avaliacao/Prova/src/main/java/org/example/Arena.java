package org.example;

public class Arena {

    String nome;
    String lugar;
    Rapper[] rappers = new Rapper[10];

    //construtor da arena
    public Arena(String nome, String lugar) {
        this.nome = nome;
        this.lugar = lugar;
    }

    //adicionando rapper
    public void addRapper(Rapper rapper){
        //percorrendo rappers
        for (int i = 0; i < rappers.length; i++) {
            //verificando se esta vazio para adicionar em i
            if(rappers[i] == null){
                rappers[i] = rapper;
                System.out.println("Rapper adicionado");
                break;
            }

        }
    }

    //mostrando as informacoes
    public void mostraInfo(){
        int a = 0;
        //informacoes da arena
        System.out.println("Nome da arena: "+this.nome);
        System.out.println("Lugar da arena: "+this.lugar);
        //percorrendo rappers
        for (int i = 0; i < rappers.length; i++) {
            //verificando se tem algum rapper em i
            if(rappers[i] != null){
                System.out.println("Informacoes do rapper "+i);
                System.out.println("----------------------");
                //mostrando as informacoes do rapper
                rappers[i].mostraInfo();
                System.out.println("......................");
                a = a + 1;
            }
        }

        //caso nao tenha rapper
        if(a == 0){
            System.out.println("Nenhum rapper cadastrado");
        }

    }

    //mostrando quais rappers tem microfone dourado
    public void microfoneDou(){
        int x = 0;
        int y = 0;
        //percorrendo rappers
        for (int i = 0; i < rappers.length; i++) {
            //verificando se tem algum rapper em i
            if(rappers[i] != null){
                //analisando se o microfone é Dourado
                if(rappers[i].microfone.material.equals("Dourado")){
                    //mostrando quais rappers que tem o microfone Dourado
                    System.out.println("O rapper "+rappers[i].nome+" tem microfone dourado");
                    x = x + 1;
                }
                y = y + 1;
            }
        }

        //caso nao tenha rappers cadastrados
        if(y == 0){
            System.out.println("Nenhum rapper cadastrado");
        }
        else {
            //caso nenhum rapper tenha microfone dourado
            if (x == 0) {
                System.out.println("Nenhum Rapper com microfone Dourado");
            }
        }
    }

    //mostrando quais rappers tem a maior e menor nota
    public void ranking(){
        float maior = 0;
        String nomeMaior = "";
        float menor = 10;
        String nomeMenor = "";
        //percorrendo rappers
        for (int i = 0; i < rappers.length; i++) {
            //verificando se tem algum rapper em i
            if(rappers[i] != null) {
                //se a nota for maior
                if (rappers[i].nota > maior) {
                    maior = rappers[i].nota;
                    nomeMaior = rappers[i].nome;
                }
                //se a nota for menor
                if (rappers[i].nota < menor) {
                    menor = rappers[i].nota;
                    nomeMenor = rappers[i].nome;
                }
            }
        }

        //mostrando rapper com maior nota
        System.out.println("Nome do rapper com maior nota: "+nomeMaior);
        //mostrando rapper com menor nota
        System.out.println("Nome do rapper com menor nota: "+nomeMenor);

    }
}
