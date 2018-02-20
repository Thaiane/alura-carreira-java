package com.company;

public class Main {

    public static void main(String[] args) {

        Funcionario marcelo = new Funcionario();
        Gerente tomaz = new Gerente();

        marcelo.setNome("Marcelo");
        tomaz.setNome("Tomaz");

        tomaz.setSenha(123);

        System.out.println(tomaz.getNome());

        Gerente gerente = new Gerente();
        gerente.setSalario(5000.0);
        System.out.println(gerente.getBonificacao());
    }
}
