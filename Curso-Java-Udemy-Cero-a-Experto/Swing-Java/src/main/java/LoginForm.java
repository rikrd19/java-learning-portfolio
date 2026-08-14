import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatDefaultsAddon;
import com.formdev.flatlaf.FlatIconColors;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame {
    private JPanel panelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;


    public LoginForm() {
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void inicializarForma() {
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);  // Centra la ventana en la pantalla
    }

    private void validar() {
        // Leer los valores ingresados por el usuario
        String usuario = this.usuarioTexto.getText();
        String password = new String(this.passwordTexto.getPassword());  //  password es un char[] en lugar de String por seguridad
        // procesar passwordChars...
        // Arrays.fill(passwordChars, '\0'); // limpiar cuando ya no se necesite

        if ("root".equals(usuario) && "admin".equals(password)) {
            mostrarMensaje("Datos correctos, bienvenido!");
        } else if ("root".equals(usuario)) {
            mostrarMensaje("Password incorrecto, corregirlo!");
        } else {
            mostrarMensaje("Usuario incorrecto, corregirlo!");
        }
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();  // cambiar a FlatLightLaf.setup() para un tema claro
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
