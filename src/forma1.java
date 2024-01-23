import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class forma1 {
    private JLabel texto1;
    private JLabel text2;
    private JTextField textField1;
    private JLabel text3;
    private JPasswordField passwordField1;
    private JButton botonlogin;
    JPanel panel1;


    public forma1(){
        botonlogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Cerrar la ventana actual (Pantalla1)
                Main.frame.dispose();
                // Abrir la nueva ventana (Pantalla2)
                forma2 pantalla2 = new forma2();
                pantalla2.mostrarPantalla();
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String texto = textField1.getText();
                // Validar que solo contenga letras
                boolean soloLetras = true;
                for (int i = 0; i < texto.length(); i++) {
                    if (!Character.isLetter(texto.charAt(i))) {
                        soloLetras = false;
                        break;
                    }
                }
                // Mostrar un mensaje de error si no son solo letras
                if (!soloLetras) {
                    JOptionPane.showMessageDialog(null, "Solo se permiten letras.", "Error", JOptionPane.ERROR_MESSAGE);
                    textField1.setText(""); // Limpiar el TextField
                } else {

                }
            }
        });
    }
}

