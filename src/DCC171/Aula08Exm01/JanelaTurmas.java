/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC171.Aula08Exm01;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author jpdia
 */
class JanelaTurmas extends JFrame {
    
    private final List<Turma> turmas;
    private final JList<Turma> lstTurmas = new JList<>();
    private final JList<Aluno> lstAlunos = new JList<>(new DefaultListModel<>());
    public JanelaTurmas(List<Turma> turmas) {
        super("Turmas");
        this.turmas = turmas;
        lstTurmas.setModel(new TurmaListModel(turmas));
        add(new JScrollPane(lstTurmas),BorderLayout.WEST);
        add(new JScrollPane(lstAlunos),BorderLayout.CENTER);
        
        lstTurmas.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                Turma selecionada = lstTurmas.getSelectedValue();
                if(selecionada!=null){
                    System.out.println(selecionada);
                    lstAlunos.setModel(new AlunosListModel((selecionada.getAlunos())));
                } else{
                    lstAlunos.setModel(new DefaultListModel<>());
                }
            }
        });
        
    }
    
    
    
}
