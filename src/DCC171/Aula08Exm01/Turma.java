
package DCC171.Aula08Exm01;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String codigo;
    private List<Aluno> alunos;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public Turma(){
        this(null);
    }

    public Turma(String codigo) {
        this.alunos = new ArrayList<>();
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo+" ("+alunos.size()+" alunos)";
    }
    
    
}
