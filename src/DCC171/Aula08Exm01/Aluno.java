package DCC171.Aula08Exm01;

public class Aluno {

    private String matricula;
    private String nome;

    public Aluno() {
        this(null, null);
    }

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return matricula+" - "+ nome;
    }
    
    
}
