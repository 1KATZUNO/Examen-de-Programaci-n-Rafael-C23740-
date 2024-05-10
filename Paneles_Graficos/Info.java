package Paneles_Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Info extends JFrame {
    /**
     * Constructor para inicializar el JFrame de Info
     */
    public Info() {
        super("Información"); // Establecer el título del JFrame a "Información"
        setLayout(new BorderLayout()); // Establecer el diseño del JFrame a BorderLayout
        setLocation(250,75); // Establecer la ubicación del JFrame a (250, 75)
        
        // Crear una etiqueta JLabel para mostrar una imagen
        JLabel label = new JLabel(new ImageIcon("Fotos3/Importancias Ambientales.jpg"));
        label.setIcon(new ImageIcon(new ImageIcon("Fotos3/Importancias Ambientales.jpg").getImage().getScaledInstance(800, 600, java.awt.Image.SCALE_SMOOTH)));
        add(label, BorderLayout.CENTER); // Agregar la etiqueta al centro del JFrame
        
        // Crear un botón JButton para regresar a la pantalla principal
        JButton button = new JButton("Regresar");
        button.setFont(new Font("Arial", Font.PLAIN, 12)); // Establecer la fuente del botón a Arial, normal, tamaño 12
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva instancia de Pantalla_Principal y hacerla visible
                Pantalla_Principal c = new Pantalla_Principal();
                c.setVisible(true);
                dispose(); // Cerrar el JFrame actual
            }
        });
        add(button, BorderLayout.SOUTH); // Agregar el botón al sur del JFrame
        
        pack(); // Empaquetar el JFrame a su tamaño preferido
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Establecer la operación de cierre predeterminada a dispose
        setVisible(true); // Hacer el JFrame visible
    }

    /**
     * Método principal para lanzar la aplicación
     */
    public static void main(String[] args) {
        new Info(); // Crear una nueva instancia del JFrame de Info
    }
}
