package org.example;

public class Locadora {

    String nome;
    String CNPJ;
    String endereco;
    int carrosParaAlugar = 0;
    Carro[] carros = new Carro[10];

    public Locadora(String nome, String CNPJ, String endereco) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
    }

    public void mostraInfo(){
        int x = 0;
        System.out.println("Nome da locadora: "+this.nome);
        System.out.println("CNPJ da locadora: "+this.CNPJ);
        System.out.println("Endereco da locadora: "+this.endereco);
        for (int i = 0; i < carros.length; i++)
        {
            if(carros[i]!=null)
            {
                System.out.println("Informações do carro "+i);
                System.out.println("----------------------");
                carros[i].mostraInfo();
                System.out.println("....................");
                x = x + 1;
            }
        }

        if(x == 0){
            System.out.println("Nenhum carro cadastrado");
        }
    }

    public void adicionarCarro(Carro carro){
        for (int i = 0; i < carros.length; i++)
        {
            if(carros[i]==null)
            {
                carros[i] = carro;
                System.out.println("Carro adicionado!");
                break;
            }
        }
    }

    public void alugarCarros(int index){
        if(carros[index]!= null)
        {
            if(carros[index].alugado){
                carros[index].alugado = false;
                System.out.println("Carro "+carros[index].modelo+" alugado");
            }
            else{
                System.out.println("Este carro nao esta disponivel");
            }
        }
        else{
            System.out.println("Nao ha carro nesta posicao");
        }
    }

    public float contarCarrosParaAlugar(){
        int total = 0;
        float porcentagem = 0;
        for (int i = 0; i < carros.length; i++)
        {
            if(carros[i] != null) {
                total = total + 1;
                if (carros[i].alugado) {
                    carrosParaAlugar = carrosParaAlugar + 1;
                }
            }
        }

        if(total == 0){
            carrosParaAlugar = 0;
            return carrosParaAlugar;
        }
        else{
            porcentagem = (carrosParaAlugar/total)*100;
            return porcentagem;
        }
    }

}
