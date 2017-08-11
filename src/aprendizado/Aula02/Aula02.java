/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aprendizado.Aula02;

import javax.swing.JFrame;

public class Aula02 {

    public static void main(String[] args) {
        Janela janela = new Janela();

        janela.setSize(1200, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        janela.setVisible(true);
    }

}
