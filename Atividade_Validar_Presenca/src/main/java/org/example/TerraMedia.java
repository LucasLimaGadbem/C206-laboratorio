package org.example;

public class TerraMedia {

    private Habitante[] herois = new Habitante[4];

    //quando criar a terra media tem que inserir um heroi
    public TerraMedia(Habitante herois) {
        this.herois[0] = herois;
    }

    //adicionar os habitantes
    public void addHabitante(Habitante habitante){
        //varrendo o vetor
        for (int i = 0; i < herois.length; i++) {
            //vendo se esta vazio
            if(herois[i] == null){
                herois[i] = habitante;
                break;
            }
        }
    }

    //mostrar os habitantes da terra media
    public void listarHabitantes(){
        //varrendo o vetor
        for (int i = 0; i < herois.length; i++) {
            //vendo se tem algo na posição
            if(herois[i] != null){
                //vendo se é um Anao
                if(herois[i] instanceof Anao){
                    Anao ax = (Anao) herois[i];
                    ax.minerar();
                    ax.atacar();
                    ax.mostraInfo();
                }
                //vendo se é um Elfo
                else if (herois[i] instanceof Elfo) {
                    Elfo ex = (Elfo) herois[i];
                    ex.curar();
                    ex.viajar();
                    ex.atacar();
                    ex.mostraInfo();
                }
                //vendo se é um Mago
                else if (herois[i] instanceof Mago) {
                    Mago mx = (Mago) herois[i];
                    mx.curar();
                    mx.lancaFeitico();
                    mx.atacar();
                    mx.mostraInfo();
                }
            }
        }
        //mostrando o numero de habitantes
        System.out.println("Numero de habitantes: "+Habitante.contador);
    }
}
