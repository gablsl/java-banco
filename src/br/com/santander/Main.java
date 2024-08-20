package br.com.santander;

public class Main {
    public static void main(String[] args) {

        Banco santander = new Banco("Santander");
        Banco nubank = new Banco("Nubank");

        Cliente alan = new Cliente("Alan", santander);
        Cliente maethe = new Cliente("Maethe", nubank);

        ContaCorrente contaCorrente = new ContaCorrente(alan, 100.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(maethe, 300);

        contaPoupanca.transferir(contaCorrente, 50);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
    }
}