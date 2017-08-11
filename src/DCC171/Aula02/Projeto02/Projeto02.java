
package DCC171.Aula02.Projeto02;

import javax.swing.JFrame;

public class Projeto02 {
    public static void main(String[] args) {
        JanelaTexto janela = new JanelaTexto();
         janela.setSize(1200, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        janela.setVisible(true);
    }
    
}
