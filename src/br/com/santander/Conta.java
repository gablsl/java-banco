package br.com.santander;

public class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente, double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void sacar(double valor) {
        if (saldo > 0 && saldo > valor) saldo -= valor;
        System.out.println("Saldo insuficiente ou valor inválido.");
    }

    public void depositar(double valor) {
        if ( valor > 0 ) saldo += valor;
        System.out.println("Valor de depósito inválido.");
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor > 0 && saldo >= valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } else {
            System.out.println("Transferência inválida. Verifique o valor e o saldo.");
        }
    }

    protected void imprimirInformacoesDaConta() {
        System.out.printf("Titular: %s%n", this.getCliente().getNome());
        System.out.printf("Banco: %s%n", this.getCliente().getBanco().getNome());
        System.out.printf("Agência: %d%n", this.getAgencia());
        System.out.printf("Número: %d%n", this.getNumero());
        System.out.printf("Saldo: %.2f%n", this.getSaldo());
        System.out.println();
    }
}
