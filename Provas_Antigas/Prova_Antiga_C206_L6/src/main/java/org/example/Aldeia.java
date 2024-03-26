package org.example;

public class Aldeia {

    String nome;
    int qtdMoradores;
    String regiao;
    Ninja[] nins = new Ninja[10];

    public void adicionarNinja(Ninja ninja){
        for(int i = 0; i < nins.length; i++){
            if(nins[i] == null){
                nins[i] = ninja;
                qtdMoradores = qtdMoradores + 1;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome da aldeia: "+this.nome);
        System.out.println("Regiao da aldeia: "+this.regiao);
        System.out.println("Qunatidades de moradores: "+this.qtdMoradores);
        for(int i = 0; i < nins.length; i++){
            if(nins[i] != null){
                nins[i].mostraInfo();
            }
        }
    }

    public void rankingS(){
        int y = 0;
        for(int i = 0; i < nins.length; i++){
            if(nins[i] != null) {
                if (nins[i].ranking.equals("S")) {
                    y = y + 1;
                    System.out.println("O ninja " + nins[i].nome + " é ranking S");
                }
            }
        }
        if (y == 0){
            System.out.println("Nenhum ninja ranking S");
        }
    }

    public void qtdTitulos(){
        int qg = 0;
        int qc = 0;
        int qa = 0;
        for(int i = 0; i < nins.length; i++){
            if(nins[i] != null) {
                if(nins[i].titulo.equals("Gennin")){
                   qg = qg + 1; 
                } else if(nins[i].titulo.equals("Chunnin")) {
                    qc = qc + 1;
                }
                else{
                   qa = qa + 1;
                }
            }
        }
        System.out.println(qg+" ninjas do titulo Gennin");
        System.out.println(qc+" ninjas do titulo Chunnin");
        System.out.println(qa+" ninjas do titulo ANBU");
    }
}
