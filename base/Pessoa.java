package base;

public class Pessoa {

    public String nome;
    protected int idade;
    private String cpf;

    // construtor vazio
    public Pessoa() {
    }

    // construtor com todos os atributos
    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // método pra acessar o private (porque filho não toca direto 👀)
    public String getCpf() {
        return cpf;
    }
}
