package DCC171.Aula07.Exm03;

import DCC171.Aula07.Exm02.*;

public class Pessoa {

    String nome;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " e idade: " + idade + " anos";
    }

}
