/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC171.Aula07.Exm02;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author jpdia
 */
public class JanelaListaPessoa extends JFrame {

    private final JLabel lblNome = new JLabel("Nome:");
    private final JTextField txtNome = new JTextField(10);
    private final JLabel lblIdade = new JLabel("Idade:");
    private final JTextField txtIdade = new JTextField(10);
    private final JButton btnExcluir = new JButton("Excluir");
    private final JList lstNumeros = new JList(new DefaultListModel());
    private final DefaultListModel modelo = (DefaultListModel) lstNumeros.getModel();

    public JanelaListaPessoa() throws HeadlessException {
        super("Listas");
        setLayout(new BorderLayout(5, 5));
        JPanel pnlEntrada = new JPanel(new BorderLayout(5, 5));
        pnlEntrada.add(lblNome, BorderLayout.WEST);
        pnlEntrada.add(txtNome, BorderLayout.CENTER);
        JPanel pnlEntrada2 = new JPanel(new BorderLayout(5, 5));
        pnlEntrada2.add(lblIdade, BorderLayout.WEST);
        pnlEntrada2.add(txtIdade, BorderLayout.CENTER);
        JPanel pnlEntrada3 = new JPanel(new FlowLayout());
        pnlEntrada3.add(pnlEntrada);
        pnlEntrada3.add(pnlEntrada2);
        add(pnlEntrada3, BorderLayout.NORTH);
        add(btnExcluir, BorderLayout.SOUTH);
        add(new JScrollPane(lstNumeros), BorderLayout.CENTER);

        for (int i = 0; i < 30; i++) {
           Pessoa p = new Pessoa();
           p.setNome("Pessoa " + i);
           p.setIdade(5*i);
           modelo.addElement(p);

        }
        txtIdade.addActionListener((ActionEvent e) -> {
            Integer idade = Integer.parseInt(txtIdade.getText());
            String nome = txtNome.getText();
            Pessoa p = new Pessoa();
            p.setNome(nome);
            p.setIdade(idade);
            modelo.addElement(p);
            txtNome.setText("");
            txtIdade.setText("");
            txtNome.requestFocus();
        });

        btnExcluir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                List selecionados = lstNumeros.getSelectedValuesList();
                for (Object selecionado : selecionados) {
                    modelo.removeElement(selecionado);
                }
            }
        });

    }

}
