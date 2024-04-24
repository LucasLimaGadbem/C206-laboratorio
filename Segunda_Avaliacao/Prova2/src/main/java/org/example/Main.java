package org.example;

public class Main {
    public static void main(String[] args) {

        //criando soldado
        Sargento s1 = new Sargento("Ana",01234567,"Artilharia", 500);
        //criando oficial
        Oficial o1 = new Oficial("Clara", 12345678, "General");
        //criando medico militar
        Medico_Militar m1 = new Medico_Militar("Alfredo",23456789, 8, 921);

        //criando item
        ItemEspecial i1 = new ItemEspecial("Arma");
        //linkando i1 a s1
        s1.itemEspecial = i1;

        //criando item
        ItemEspecial i2 = new ItemEspecial("Canhao");
        //linkando i2 a o1
        o1.itemEspecial = i2;

        //criando item
        ItemEspecial i3 = new ItemEspecial("Bandagem");
        //linkando i3 a m1
        m1.itemEspecial = i3;

        //criando exercito e inserindo s1
        Exercito exercito = new Exercito(s1,"Brasileiro");
        //adicionando o1 a exercito
        exercito.addSoldados(o1);
        //adicionando m1 a exercito
        exercito.addSoldados(m1);

        //mostrando informacoes do exercito e dos soldados
        exercito.mostraInfo();

        //todos usando os itens
        s1.usandoItem();
        o1.usandoItem();
        m1.usandoItem();
        //sargento e oficial defendendo
        s1.defender();
        o1.defender();
        //medico militar curando
        m1.curar();
    }
}