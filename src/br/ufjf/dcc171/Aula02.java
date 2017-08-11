/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufjf.dcc171;

import javax.swing.JFrame;

public class Aula02 {

    public static void main(String[] args) {
        Janela janela = new Janela();

        janela.setSize(320, 200);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        janela.setVisible(true);
    }

}
