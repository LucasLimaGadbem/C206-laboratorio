package org.example;

public class Plataforma {

    String nome;
    Serie[] series = new Serie[10];

    public Plataforma(String nome){
        this.nome = nome;
    }

    public void mostraInfo(){
        System.out.println("------------------------");
        System.out.println("Noma da plataforma "+this.nome);
        for(int i = 0; i < series.length; i++){
            if(series[i] != null){
                series[i].mostraInfo();
            }
        }
    }

    public void addSerie(Serie serie){
        for(int i = 0; i < series.length; i++){
            if(series[i] == null){
                series[i] = serie;
                break;
            }
        }
    }

    /*public String serieMaisLongaFinalizada(){
        int tamanho = 0;
        String maior = "ntc";
        int fim = 0;
        for(int i = 0; i < series.length; i++){
            if (series[i] != null) {
                if(series[i].finalizada){
                    if(tamanho < series[i].temporadas){
                        tamanho = series[i].temporadas;
                        maior = series[i].nome;
                        fim = fim + 1;
                    }
                }
            }
        }

        if(fim == 0){
            maior = "nenhuma";
        }

        return maior;
    }*/

    public String serieMaisLongaFinalizada(){
        int maisLonga = 0;
        int aux = 0;
        int fim = 0;
        for(int i = 0; i < series.length; i++){
            if (series[i] != null) {
                if(series[i].finalizada){
                    if(maisLonga < series[i].temporadas){
                        maisLonga = series[i].temporadas;
                        aux = i;
                        fim = fim + 1;
                    }
                }
            }
        }

        if(fim == 0){
            return "Nenhuma serie finalizada";
        }
        else {
            return series[aux].nome;
        }
    }

    public void mediaPorcentagem(){
        int total = 0;
        int trestemp = 0;
        double soma = 0;
        double media = 0;
        double porcentagem = 0;
        int fim = 0;

        for(int i = 0; i < series.length; i++){
            if(series[i] != null){
                total = total + 1;
                if(series[i].temporadas >= 3){
                    trestemp = trestemp + 1;
                    soma = soma + series[i].nota;
                    fim = fim + 1;
                }
            }
        }

        if(fim == 0){
            System.out.println("Nenhuma serie cadastrada");
        }
        else {
            porcentagem = (float) (trestemp /total) * 100;
            media = soma / trestemp;

            System.out.println("Porcentagem de series com 3 temporadas: " +porcentagem +"%");
            System.out.println("A media das notas: " + media);
        }
    }
}
