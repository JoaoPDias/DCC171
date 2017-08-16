package DCC171.Aula03;

import javax.swing.JFrame;

public class Aula03 {

    public static void main(String[] args) {
        SomaTela janela = new SomaTela();
        janela.setSize(1200, 800);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);

        janela.setVisible(true);
    }

}
