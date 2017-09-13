/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC171.Aula05;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula05 {

    public static void main(String[] args) {
        JanelaRadio janela = new JanelaRadio();
        janela.setSize(300, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}
