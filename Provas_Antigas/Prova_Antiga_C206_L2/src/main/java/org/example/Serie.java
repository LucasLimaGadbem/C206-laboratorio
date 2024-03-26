package org.example;

public class Serie {

    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(String nome, double nota, int temporadas, boolean finalizada, String diretor){
        this.nome = nome;
        this.nota = nota;
        this.temporadas = temporadas;
        this.finalizada = finalizada;
        this.diretor = new Diretor(diretor);
    }

    public void mostraInfo(){
        System.out.println("////////////////////////////");
        System.out.println("Nome da serie: "+this.nome);
        System.out.println("Nota da serie: "+this.nota);
        System.out.println("Numero de temporadas: "+this.temporadas);
        if(finalizada){
            System.out.println("Terminou a serie");
        }
        else{
            System.out.println("A serie ainda nao acabou");
        }
        System.out.println("Nome do diretor: "+diretor.nome);

    }
}
