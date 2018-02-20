package com.company;

public class Gerente extends Funcionario {
    private int senha;
    private int numeroDeFuncionarioGerenciados;

    public int getSenha() {
        return senha;
    }

    public int getNumeroDeFuncionarioGerenciados() {
        return numeroDeFuncionarioGerenciados;
    }

    public double getBonificacao() {
        return super.getBonificacao() + 1000;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setNumeroDeFuncionarioGerenciados(int numeroDeFuncionarioGerenciados) {
        this.numeroDeFuncionarioGerenciados = numeroDeFuncionarioGerenciados;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            System.out.println("Acesso permitido.");
            return true;
        } else {
            System.out.println("Acesso negado!");
            return false;
        }

    }
}
