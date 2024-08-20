package br.com.santander;

public class Cliente {
    private String nome;
    protected Banco banco;

    public Cliente(String nome, Banco banco) {
        this.nome = nome;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBanco() {
        return banco;
    }
}
