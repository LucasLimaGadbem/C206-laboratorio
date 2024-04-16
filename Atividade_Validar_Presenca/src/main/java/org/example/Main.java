package org.example;

public class Main {
    public static void main(String[] args) {

        //criando o Anao
        Habitante h1 = new Anao(10,"Matheus",21,100,176,"Avalon");
        //criando a terra media e inserindo o anao
        TerraMedia tm = new TerraMedia(h1);
        //inserindo a arma e se é magica ou não
        h1.arma.setNomeArma("magica");
        h1.arma.setMagica(true);

        //criando o Elfo
        Habitante h2 = new Elfo(14,"Pedro",20,140,"Ouros");
        //adicionando o Elfo na terra media
        tm.addHabitante(h2);
        //inserindo a arma e se é mágica ou não
        h2.arma.setNomeArma("fisica");
        h2.arma.setMagica(false);

        //criando o Mago
        Habitante h3 = new Mago(25,"Yasmin",18,60,"Branca");
        //adicionando o Mago na terra media
        tm.addHabitante(h3);
        //inserindo a arma e se é mágica ou não
        h3.arma.setNomeArma("magica");
        h3.arma.setMagica(true);

        //mostrando a lista de habitantes
        tm.listarHabitantes();
    }
}