package DCC171.Aula05;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

class JanelaRadio extends JFrame {
    
    private final JRadioButton rbPlano;
    private final JRadioButton rbNegrito;
    private final JRadioButton rbItalico;
    private final JRadioButton rbNegritoItalico;
    private final JTextField mensagem = new JTextField("Universidade Federal de Juiz de Fora");

    public JanelaRadio() throws HeadlessException {
        super("RadioButton");
        setLayout(new FlowLayout());
        add(mensagem);
        rbPlano = new JRadioButton("Plano",true);
        rbNegrito = new JRadioButton("Negrito",false);
        rbItalico = new JRadioButton("Itálico",false);
        rbNegritoItalico = new JRadioButton("Negrito-Itálico",false);
        add(rbPlano);
        add(rbNegrito);
        add(rbItalico);
        add(rbNegritoItalico);
        ButtonGroup bgEstilo = new ButtonGroup();
        bgEstilo.add(rbPlano);
        bgEstilo.add(rbNegrito);
        bgEstilo.add(rbItalico);
        bgEstilo.add(rbNegritoItalico);
        
        Font fPlana = new Font(Font.SERIF,Font.PLAIN,14);
        Font fNegrito = new Font(Font.SERIF,Font.BOLD,14);
        Font fItalico = new Font(Font.SERIF,Font.ITALIC,14);
        Font fNegritoItalico = new Font(Font.SERIF,Font.BOLD+Font.ITALIC,14);
        rbPlano.addItemListener(new EstiloRadio(fPlana));
        
        
    }

    /*private class BotaoClicado implements ActionListener {

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
*/

    private class EstiloRadio implements ItemListener {
       private final Font fonte;
        public EstiloRadio(Font fonte) {
            this.fonte = fonte;
        }

        @Override
        public void itemStateChanged(ItemEvent e) {
            mensagem.setFont(fonte);
        }
        
        
    }
}
