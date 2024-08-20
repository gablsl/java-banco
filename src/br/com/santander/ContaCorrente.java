package br.com.santander;

public class ContaCorrente extends Conta {
    public ContaCorrente(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA CORRENTE ===");
        super.imprimirInformacoesDaConta();
    }
}