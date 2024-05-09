package Paneles_Graficos;

import javax.swing.*;

import Logica_De_Programación.Fauna;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Nuestra_Fauna extends JFrame {
    private JLabel etiquetaImagen;
    
    private JTextArea descripcionImagen;
    private Fauna fauna;
    private int currentImageIndex;
    private Pantalla_Principal pantallaPrincipal;

    public Nuestra_Fauna() {
        
        super("Nuestra Fauna");
        this.setLocation(200,100);    
        etiquetaImagen = new JLabel();
        etiquetaImagen.setPreferredSize(new Dimension(400, 300)); // Establece un tamaño máximo para la imagen
        this.pantallaPrincipal = pantallaPrincipal;
     
        descripcionImagen = new JTextArea(5, 20); // Agrega un JTextArea para mostrar la descripción de la imagen
        descripcionImagen.setEditable(false); // No permite editar el texto
        fauna = new Fauna();

        JButton botonIzquierda = new JButton("◄");
        JButton botonDerecha = new JButton("►");
        JButton botonRegresar = new JButton("Regresar");

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

       botonRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla_Principal c = new  Pantalla_Principal();
                c.setVisible(true);
                dispose(); // Close the current window
            
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(etiquetaImagen, BorderLayout.CENTER);
       
        panel.add(descripcionImagen, BorderLayout.SOUTH);
        panel.add(botonIzquierda, BorderLayout.WEST);
        panel.add(botonDerecha, BorderLayout.EAST);
        panel.add(botonRegresar, BorderLayout.NORTH); // Add the button to the top of the panel

        setContentPane(panel);
        setSize(800, 650);
        setMinimumSize(getPreferredSize());
        setVisible(true);

        currentImageIndex = 0;
        mostrarImagen();
    }

    private void siguienteImagen() {
        fauna.siguienteImagen();
        currentImageIndex++;
        if (currentImageIndex >= 16) {
            currentImageIndex = 0;
        }
        mostrarImagen();
    }

    private void anteriorImagen() {
        fauna.anteriorImagen();
        currentImageIndex--;
        if (currentImageIndex < 0) {
            currentImageIndex = 15;
        }
        mostrarImagen();
    }

    private void mostrarImagen() {
        ImageIcon imagen = fauna.getImagen();
        imagen.setImage(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT));
        etiquetaImagen.setIcon(imagen);
        descripcionImagen.setText(fauna.getDescripcion()+"\n"+fauna.getNombre());
    }

    public static void main(String[] args) {
       new Nuestra_Fauna();
    }
}

