package DCC171.Aula03;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SomaTela extends JFrame {

    private final JLabel etiqueta1;
    private final JLabel etiqueta2;
    private final JTextField parcela1;
    private final JTextField parcela2;
    private final JTextField texto;
    private final JLabel etiqueta3;
    private Double n1, n2;
    private final JLabel etiqueta4;
    private final JLabel etiqueta5;

    public SomaTela() throws HeadlessException {
        super("Soma");
        etiqueta1 = new JLabel("Parcela 1: \n");
        etiqueta2 = new JLabel("");
        etiqueta4 = new JLabel("Palavra: \n");
        etiqueta5 = new JLabel("");
        etiqueta3 = new JLabel("Parcela 2: \n");
        parcela1 = new JTextField(8);
        parcela2 = new JTextField(8);
        texto = new JTextField(8);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        add(etiqueta1);
        add(parcela1);
        add(etiqueta3);
        add(parcela2);
        add(etiqueta2);
        add(etiqueta4);
        add(etiqueta5);
        add(texto);
        parcela1.requestFocus();
        parcela1.addActionListener(new Numero1Enter());
        parcela2.addActionListener(new Soma());
        texto.addActionListener(new Inversor());

    }

    private class Inversor implements ActionListener {

        public Inversor() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            StringBuilder inverso = new StringBuilder(texto.getText());
            inverso.reverse();
            etiqueta5.setText(inverso.toString());
            
        }
    }

    private class Numero1Enter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n1 = Double.parseDouble(parcela1.getText());
                parcela2.requestFocus();

            } catch (NumberFormatException ex) {
                etiqueta2.setText("Digite um valor válido para a 1ª parcela");
                parcela1.requestFocus();
            }
        }
    }

    private class Soma implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                n2 = Double.parseDouble(parcela2.getText());
                etiqueta2.setText("O total da soma é:" + (n1 + n2));
            } catch (NumberFormatException ex) {
                etiqueta2.setText("Digite um valor válido para a 2ª parcela");
                parcela2.requestFocus();
            }
        }
    }

}
