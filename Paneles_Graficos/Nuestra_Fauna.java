package Paneles_Graficos;

import javax.swing.*;
import java.awt.*;

public class Nuestra_Fauna extends JFrame {

    public Nuestra_Fauna() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JButton leftButton = new JButton("Left");
        JButton rightButton = new JButton("Right");

        panel.add(leftButton, BorderLayout.WEST);
        panel.add(rightButton, BorderLayout.EAST);

        this.add(panel);
    }

    public static void main(String[] args) {
        Nuestra_Fauna frame = new Nuestra_Fauna();
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}