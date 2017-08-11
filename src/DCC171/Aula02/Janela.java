/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC171.Aula02;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Janela extends JFrame {

    private final JLabel etiqueta;
    private final JLabel etiqueta2;

    public Janela() throws HeadlessException {
        super("Exemplo Janela");
        setLayout(new FlowLayout());
        Icon iconeUFJF = new ImageIcon("resources/ufjf.jpg");
        etiqueta = new JLabel("Universidade Federal de Juiz de Fora");
        etiqueta.setIcon(iconeUFJF);
        etiqueta.setHorizontalTextPosition(SwingConstants.CENTER);
        etiqueta.setVerticalTextPosition(SwingConstants.BOTTOM);
        add(etiqueta);
        etiqueta2 = new JLabel("Bem Vindo!!!");
        add(etiqueta2);
        
        

    }

}
