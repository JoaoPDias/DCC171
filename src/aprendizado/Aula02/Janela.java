/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizado.Aula02;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ice
 */
public class Janela extends JFrame {

    public Janela() throws HeadlessException {
        super("Exemplo Janela");
        setLayout(new FlowLayout());
        JLabel etiqueta = new JLabel("Hello World");
        add(etiqueta);
         JLabel etiqueta2 = new JLabel("UFJF");
        add(etiqueta2);
        
    }
    
}
