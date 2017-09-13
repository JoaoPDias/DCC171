package DCC171.Aula09Exm01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Aula09Exm01 extends JFrame {

    private final JPanel principal = new JPanel();
    private final JLabel lbl01 = new JLabel("Etiqueta 01");
    private final JLabel lbl02 = new JLabel("Etiqueta 02");
    private final JLabel lbl03 = new JLabel("Etiqueta 03");
    private final JLabel lbl04 = new JLabel("Etiqueta 04");
    private final JTextField txt01 = new JTextField("Texto 01");
    private final JTextField txt02 = new JTextField("Texto 02");
    private final JTextField txt03 = new JTextField("Texto 03");
    private final JTextField txt04 = new JTextField("Texto 04");

    public Aula09Exm01() throws HeadlessException {
        super("Exemplos de Layout");
        //configuraFlowLayout();
        //configuraBorderLayout();
        //configuraLayoutAbsoluto();
        configuraGridLayout();
        add(principal);

    }

    public static void main(String[] args) {
        Aula09Exm01 janela = new Aula09Exm01();
        janela.setSize(400, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
    }

    private void configuraFlowLayout() {
        principal.setLayout(new FlowLayout());
        principal.add(lbl01);
        principal.add(txt01);
        principal.add(lbl02);
        principal.add(txt02);
        principal.add(lbl03);
        principal.add(txt03);
        principal.add(lbl04);
        principal.add(txt04);
    }
    
    private void configuraGridLayout() {
        principal.setLayout(new GridLayout(4,2));
        principal.add(lbl01);
        principal.add(txt01);
        principal.add(lbl02);
        principal.add(txt02);
        principal.add(lbl03);
        principal.add(txt03);
        principal.add(lbl04);
        principal.add(txt04);
    }
    private void configuraBorderLayout() {
        principal.setLayout(new BorderLayout());
        principal.add(lbl01, BorderLayout.NORTH);
        principal.add(txt01, BorderLayout.WEST);
        //principal.add(lbl02,BorderLayout.CENTER);
        principal.add(txt02, BorderLayout.CENTER);
        principal.add(lbl03, BorderLayout.SOUTH);
    }

    private void configuraLayoutAbsoluto() {
        principal.setLayout(null);
        lbl01.setSize(100, 30);
        lbl02.setSize(100, 30);
        lbl03.setSize(100, 30);
        lbl04.setSize(100, 30);
        
        txt01.setSize(200, 30);
        txt02.setSize(txt01.getSize());
        txt03.setSize(txt01.getSize());
        txt04.setSize(txt01.getSize());
        
        lbl01.setLocation(10, 10);
        txt01.setLocation(120, 10);
        
        lbl02.setLocation(10, 50);
        txt02.setLocation(120, 50);
        
        lbl03.setLocation(10, 90);
        txt03.setLocation(120, 90);
        
        lbl04.setLocation(10, 130);
        txt04.setLocation(120, 130);
        
        principal.add(lbl01);
        principal.add(txt01);
        
        principal.add(lbl02);
        principal.add(txt02);
        
        principal.add(lbl03);
        principal.add(txt03);
       
        principal.add(lbl04);
        principal.add(txt04);
       

    }
}
