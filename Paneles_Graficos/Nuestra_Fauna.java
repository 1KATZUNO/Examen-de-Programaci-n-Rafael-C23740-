// Paquete Paneles_Graficos
package Paneles_Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nuestra_Fauna extends JFrame {
    private JLabel etiquetaImagen;
    private Logica_De_Programación.Fauna fauna;
    

    public Nuestra_Fauna() {
        super("Nuestra Fauna");
        this.setLocation(200,150);    
        etiquetaImagen = new JLabel();
        fauna = new Logica_De_Programación.Fauna();
        fauna.cargarImagenes("Fotos/fotos_animales");

        JButton botonIzquierda = new JButton("◄");
        JButton botonDerecha = new JButton("►");

        botonIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anteriorImagen();
            }
        });

        botonDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteImagen();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(etiquetaImagen, BorderLayout.CENTER);
        panel.add(botonIzquierda, BorderLayout.WEST);
        panel.add(botonDerecha, BorderLayout.EAST);

        setContentPane(panel);
        setSize(800, 600);
        setMinimumSize(getPreferredSize());
        setVisible(true);
    }

    private void siguienteImagen() {
        fauna.siguienteImagen();
        mostrarImagen();
    }

    private void anteriorImagen() {
        fauna.anteriorImagen();
        mostrarImagen();
    }

    private void mostrarImagen() {
        etiquetaImagen.setIcon(fauna.getImagen());
        etiquetaImagen.setMinimumSize(etiquetaImagen.getPreferredSize());
    }

    public static void main(String[] args) {
        new Nuestra_Fauna();
    
    }
}
