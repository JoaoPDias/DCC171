
package DCC171.Aula08Exm01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;


public class Aula08 {
    public static void main(String[] args) {
        JanelaTurmas janela = new JanelaTurmas(getSampleData());
        janela.setSize(400,300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }
   

    private static List<Turma> getSampleData() {
        Aluno a1 = new Aluno("1234","Hugo");
        Aluno a2 = new Aluno("12345","Fernanda");
        Aluno a3 = new Aluno("123456","Christiano");
        
        Turma t1 = new Turma("DCC020");
        Turma t2 = new Turma("DCC021");
        
        t1.getAlunos().add(a1);
        t1.getAlunos().add(a3);
        t2.getAlunos().add(a1);
        t2.getAlunos().add(a2);
        t2.getAlunos().add(a3);
        List<Turma> turmas = new ArrayList<>();
        turmas.add(t1);
        turmas.add(t2);
        return turmas;
    }
}
