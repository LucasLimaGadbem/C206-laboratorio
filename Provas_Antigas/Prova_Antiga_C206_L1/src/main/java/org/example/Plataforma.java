package org.example;

public class Plataforma {

    String nome;
    String criador;
    Jogo[] jogos = new Jogo[10];
    int quant = 0;

    Plataforma(String nome, String criador){
        this.nome = nome;
        this.criador = criador;
    }
    public void mostraInfo(){
        System.out.println("A plataforma é a: "+nome);
        for (int i = 0; i < jogos.length; i++){
            if(jogos[i] != null){
                jogos[i].mostraInfo();
                quant = quant + 1;
            }
        }

        if(quant == 0){
            System.out.println("Nao tem jogo cadastrado");
        }
    }

    public void adicionaJogo(Jogo jogo){
        for (int i = 0; i < jogos.length; i++) {
            if (jogos[i] == null) {
                jogos[i] = jogo;
                break;
            }
        }
    }

    public void mostraMaisCaroBarato(){
        double tamanhoMaior = 0;
        double tamanhoMenor = 1000;
        String nomeMaisCaro = "";
        String nomeMaisBarato = "";
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] != null){
                if(tamanhoMaior < jogos[i].preco){
                    tamanhoMaior = jogos[i].preco;
                    nomeMaisCaro = jogos[i].nome;
                }
                else if(tamanhoMenor > jogos[i].preco){
                    tamanhoMenor = jogos[i].preco;
                    nomeMaisBarato = jogos[i].nome;
                }
            }
        }
        System.out.println("Jogo mais caro: "+nomeMaisCaro);
        System.out.println("Jogo mais barato: "+nomeMaisBarato);
    }

    public void calculaDLC(){
        int qtdDLC = 0;
        for (int i = 0; i < jogos.length; i++) {
            if(jogos[i] != null){
                if(jogos[i].dlc){
                    qtdDLC = qtdDLC + 1;
                }
            }
        }
        if(qtdDLC != 0){
            System.out.println("Quantidades de jogos que tem DLC: "+qtdDLC);
        }
        else if(qtdDLC == 0){
            System.out.println("Nenhum jogo tem DLC");
        }
    }

}
