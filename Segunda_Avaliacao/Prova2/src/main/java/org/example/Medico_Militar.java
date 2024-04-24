package org.example;

public class Medico_Militar extends Soldado implements Curar{

    private int anosExperiencia;
    private int capacidadeEmergencia;
    private int aux;

    //construtor de Medico_Militar
    public Medico_Militar(String nome, long cpf, int anosExperiencia, int capacidadeEmergencia) {
        super(nome, cpf);
        this.anosExperiencia = anosExperiencia;
        this.capacidadeEmergencia = capacidadeEmergencia;
        this.aux = capacidadeEmergencia;
    }

    //mostrando informacoes
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Anos de experiencia: "+this.anosExperiencia);
        if(itemEspecial == null) {
            System.out.println("Capacidade emergencia: " + this.capacidadeEmergencia);
        }
        else{
            if(this.capacidadeEmergencia == this.aux) {
                this.capacidadeEmergencia = this.capacidadeEmergencia + 100;
                System.out.println("Capacidade emergencia: " + this.capacidadeEmergencia);
            }
            else{
                System.out.println("Capacidade emergencia: " + this.capacidadeEmergencia);
            }

        }
    }

    //como nao muda, apenas trazendo usandoItem como estava no UML
    @Override
    public void usandoItem() {
        super.usandoItem();
    }

    //curando
    @Override
    public void curar() {
        if(itemEspecial == null) {
            if(this.capacidadeEmergencia > 920){
                System.out.println(getNome()+" conseguiu curar");
            }
            else{
                System.out.println(getNome()+" nao conseguiu curar");
            }
        }
        else{
            if(this.capacidadeEmergencia == this.aux) {
                this.capacidadeEmergencia = this.capacidadeEmergencia + 100;
                if(this.capacidadeEmergencia > 920){
                    System.out.println(getNome()+" conseguiu curar");
                }
                else{
                    System.out.println(getNome()+" nao conseguiu curar");
                }
            }
            else if(this.capacidadeEmergencia > 920){
                System.out.println(getNome()+" conseguiu curar");
            }
            else{
                System.out.println(getNome()+" nao conseguiu curar");
            }

        }
    }
}
