/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DCC171.Aula04;

import javax.swing.JFrame;

/**
 *
 * @author ice
 */
public class Aula04 {

    public static void main(String[] args) {
        JanelaBotoes janela = new JanelaBotoes();
        janela.setSize(1200, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

}
