package br.com.santander;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente, double saldo) {
        super(cliente, saldo);
    }

    public void imprimirExtrato() {
        System.out.println("=== EXTRATO CONTA POUPANÇA ===");
        super.imprimirInformacoesDaConta();
    }
}
