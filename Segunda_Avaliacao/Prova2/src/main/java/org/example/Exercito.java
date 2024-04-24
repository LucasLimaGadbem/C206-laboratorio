package org.example;

public class Exercito {

    private String nome;
    Soldado[] soldados = new Soldado[6];

    //contrutor do exercito
    public Exercito(Soldado soldados, String nome) {
        //tem que ter pelo menos 1 soldado, colocando em 0
        this.soldados[0] = soldados;
        this.nome = nome;
    }

    //funcao adicionar soldados
    public void addSoldados(Soldado s){
        //varrer o vetor de soldados
        for (int i = 0; i < soldados.length; i++) {
            //ver se nao tem nada
            if(soldados[i] == null){
                //inserindo
                soldados[i] = s;
                break;
            }
        }
    }

    //mostrando as informacoes
    public void mostraInfo(){
        //informacoes do exercito
        System.out.println("Nome do exercito: "+this.nome);
        System.out.println("Quantidade de soldados:"+Soldado.qtdSoldado);
        //varrendo o vetor de soldados
        for (int i = 0; i < soldados.length; i++) {
            //vendo se tem algum
            if(soldados[i] != null){
                //vendo se é um Sargento
                if(soldados[i] instanceof Sargento){
                    Sargento sx = (Sargento) soldados[i];
                    //mostrando informacoes
                    sx.mostraInfo();
                }
                //vendo se é um Oficial
                else if(soldados[i] instanceof Oficial){
                    Oficial ox = (Oficial) soldados[i];
                    //mostrando informacoes
                    ox.mostraInfo();
                }
                //vendo se é um Medico_Militar
                else if (soldados[i] instanceof Medico_Militar) {
                    Medico_Militar mx = (Medico_Militar) soldados[i];
                    //mostrando informacoes
                    mx.mostraInfo();
                }
            }
        }
    }
}
