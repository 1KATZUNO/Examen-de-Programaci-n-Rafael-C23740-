package Paneles_Graficos;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Planear extends JFrame {
    private JTextField nombreField;
    private JTextField cedulaField;
    private JComboBox<String> provinciaBox;

    public Planear(){
        this.setLocationRelativeTo(null);
        this.setLayout(new GridLayout(6, 3));

        nombreField = new JTextField();
        cedulaField = new JTextField();
        String[] provincias = {"Guanacaste", "Limón", "Puntarenas", "Alajuela", "Heredia", "San José", "Cartago"};
        provinciaBox = new JComboBox<>(provincias);

        add(new JLabel("Nombre:"));
        add(nombreField);
        add(new JLabel("Cédula:"));
        add(cedulaField);
        add(new JLabel("Provincia:"));
        add(provinciaBox);

        JButton aceptarButton = new JButton("Aceptar");
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String cedula = cedulaField.getText();
                String provincia = (String) provinciaBox.getSelectedItem();

                JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nCédula: " + cedula + "\nProvincia: " + provincia);
            }
        });
        add(aceptarButton);

        pack();
        setSize(800, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Planear();
        });
    }
}
