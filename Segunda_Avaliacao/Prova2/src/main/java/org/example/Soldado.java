package org.example;

public abstract class Soldado{

    public static int qtdSoldado = 0;
    private String nome;
    private long cpf;
    ItemEspecial itemEspecial;

    //getter de nome
    public String getNome() {
        return nome;
    }

    //construtor de Soldados
    public Soldado(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
        //contando quantidade de soldados
        qtdSoldado++;
    }

    //mostrando informacoes
    public void mostraInfo(){
        System.out.println("Nome: "+this.nome);
        System.out.println("CPF: "+this.cpf);
        System.out.println("Quantidade de soldado: "+qtdSoldado);
        if(itemEspecial == null){
            System.out.println("Nao tem item especial");
        }
        else {
            System.out.println("ItemEspecial: " + itemEspecial.tipo);
        }
    }

    //usando item
    public void usandoItem(){
        //vendo se tem item
        if(itemEspecial == null) {
            System.out.println(this.nome + " não tem item especial para usar");
        }else{
            System.out.println(this.nome+" utilizando item especial");
        }
    }
}
