/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC171.Aula07;

import java.awt.BorderLayout;
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
public class JanelaLista extends JFrame {

    private final JLabel lblNumero = new JLabel("Número");
    private final JTextField txtNumero = new JTextField("0", 20);
    private final JButton btnExcluir = new JButton("Excluir");
    private final JList lstNumeros = new JList(new DefaultListModel());
    private final DefaultListModel modelo = (DefaultListModel) lstNumeros.getModel();

    public JanelaLista() throws HeadlessException {
        super("Listas");
        setLayout(new BorderLayout(5, 5));
        JPanel pnlEntrada = new JPanel(new BorderLayout(5, 5));
        pnlEntrada.add(lblNumero, BorderLayout.WEST);
        pnlEntrada.add(txtNumero, BorderLayout.CENTER);
        add(pnlEntrada, BorderLayout.NORTH);
        add(btnExcluir, BorderLayout.SOUTH);
        add(btnExcluir, BorderLayout.SOUTH);
        add(new JScrollPane(lstNumeros), BorderLayout.CENTER);

        for (int i = 0; i < 30; i++) {
            modelo.addElement(10 * i);

        }
        txtNumero.addActionListener((ActionEvent e) -> {
            modelo.addElement(Integer.parseInt(txtNumero.getText()));
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
