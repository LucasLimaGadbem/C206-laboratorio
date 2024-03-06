package org.example;

public class Main {
    public static void main(String[] args) {

        Funcionario func1 = new Funcionario("Gabriel", 21, 1100);
        Funcionario func2 = new Funcionario("Eduardo", 21, 800);

        /*
        Funcionario func1 = new Funcionario();
        func1.nome = "Eduardo";
        func1.idade = 20;
        func1.salario = 1100;

        // instancia é quando da um new AlgumaCoisa();

        Funcionario func2 = new Funcionario();
        func2.nome = "Gabriel";
        func2.idade = 21;
        func2.salario = 800;
         */

        System.out.println("Saindo com as caracteristicas dos funcionarios");
        System.out.println("Nome do funcionario: "+func1.nome);
        System.out.println("Idade: "+func1.idade);
        System.out.println("Salario: "+func1.salario);
        //System.out.println(func1);
        System.out.println();
        System.out.println("Nome do funcionario: "+func2.nome);
        System.out.println("Idade: "+func2.idade);
        System.out.println("Salario: "+func2.salario);
        //System.out.println(func2);

        System.out.println("O salario anual do "+ func1.nome+" é "+func1.calculaSalarioAnual());
        System.out.println("O salario anual do "+ func2.nome+" é "+func2.calculaSalarioAnual());

        System.out.println("Salario com decimo terceiro do: "+func1.nome+" é "+func1.calculaDecimoTerceiro());
        System.out.println("Salario com decimo terceiro do: "+func2.nome+" é "+func2.calculaDecimoTerceiro());
    }
}