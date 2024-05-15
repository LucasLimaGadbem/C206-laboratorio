package org.example;

public class Conta {

    private float saldo;

    public Conta(float saldo) {
        this.saldo = saldo;
    }

    public void sacar (float saque) {

        try{
            if (saque>this.saldo){
                throw new SaldoIndisponivelException();
            }
            else{
                saldo = saldo - saque;
                System.out.println("Saque realizado");
            }
        }catch (SaldoIndisponivelException e){
            System.out.println("Saldo indisponivel");
        }

    }
}
