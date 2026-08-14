import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class Forma extends JFrame {
    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JLabel replicadorLabel;

    public Forma() {
        inicializarForma();
//        campoTexto.addActionListener(e -> {
//            replicarTexto();
//        });
        campoTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
                replicarTexto();
            }
        });
    }

    private void replicarTexto() {
        this.replicadorLabel.setText(this.campoTexto.getText());
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
    }

    public static void main(String[] args) {
        //FlatLightLaf.setup();  // cambiar el look and feel a modo claro(Light)
        FlatDarculaLaf.setup();  // cambiar el look and feel a modo oscuro(Darcula)
        Forma forma = new Forma();
        forma.setVisible(true);
    }

}
