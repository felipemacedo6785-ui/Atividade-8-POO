package app;

import base.Pessoa;

public class Aluno extends Pessoa {

    private String curso;
    private int matricula;

    public Aluno(String nome, int idade, String cpf, String curso, int matricula) {
        super(nome, idade, cpf); // chama o construtor da superclasse
        this.curso = curso;
        this.matricula = matricula;
    }

    public void apresentar() {
        System.out.println(
            "Meu nome é " + nome +
            ", tenho " + idade + " anos, CPF " + getCpf() +
            ", curso " + curso +
            " e matrícula " + matricula
        );
    }
}
