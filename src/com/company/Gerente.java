package com.company;

public class Gerente extends Funcionario {
    int senha;
    int numeroDeFuncionarioGerenciados;

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
