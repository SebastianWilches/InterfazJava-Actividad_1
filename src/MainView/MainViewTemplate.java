package MainView;

import java.awt.Color;
import javax.swing.*;
/*
@author Jhoan Sebastian Wilches Jimenez
*/

public class MainViewTemplate extends JFrame {
    private JButton boton1;
    private JTextArea area1;
    private JLabel label1;

    public MainViewTemplate() {
        this.setSize(800, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setTitle("TEST");
        // this.setUndecorated(true);
        this.cambiarTamaño();
        this.cambiarFondo();
        this.setVisible(true); // Ultimo llamado
    }

    public void cambiarTamaño() {
        this.setSize(200, 300);
        this.setLocationRelativeTo(null);
    }

    public void cambiarFondo() {
        this.getContentPane().setBackground(Color.BLACK);
    }
}
