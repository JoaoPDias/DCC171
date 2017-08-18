package DCC171.Aula04;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class JanelaBotoes extends JFrame {

    private final JButton botao;
    private final JButton botaoEnfeite;

    public JanelaBotoes() throws HeadlessException {
        super("Botões");
        botao = new JButton("Clique aqui");
        botaoEnfeite = new JButton("");
        setLayout(new FlowLayout());
        botaoEnfeite.setIcon(new ImageIcon("resources/emoji.jpg"));
        botaoEnfeite.setRolloverIcon(new ImageIcon("resources/emoji2.jpg"));
        add(botao);
        add(botaoEnfeite);
        BotaoClicado placar = new BotaoClicado();
        botao.addActionListener(placar);
        botaoEnfeite.addActionListener(placar);
    }

    private class BotaoClicado implements ActionListener {

        private int simples;
        private int enfeitado;

        public BotaoClicado() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == botao) {
                ++simples;
                JOptionPane.showMessageDialog(null, "Botão Simples clicado\nSimples:"
                        + simples + " Enfeitado: "
                        + enfeitado, "Click!", JOptionPane.INFORMATION_MESSAGE);
                
            } else if (e.getSource() == botaoEnfeite) {
                ++enfeitado;
                JOptionPane.showMessageDialog(null, String.format("Botão enfeitado clicado! \nSimples: %d Enfeitado:%d", simples, enfeitado), "Click!", JOptionPane.INFORMATION_MESSAGE);

            }

        }

    }

}
