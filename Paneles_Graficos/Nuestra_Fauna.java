package Paneles_Graficos;

import javax.swing.*;

import Logica_De_Programación.Fauna;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase representa el marco principal para mostrar imágenes y información sobre varias especies de fauna.
 */
public class Nuestra_Fauna extends JFrame {
    private JLabel etiquetaImagen;
    
    private JTextArea descripcionImagen;
    private Fauna fauna;
    private int currentImageIndex;
    private Pantalla_Principal pantallaPrincipal;

    /**
     * Constructor para la clase Nuestra_Fauna.
     */
    public Nuestra_Fauna() {

        super("Nuestra Fauna");
        this.setLocation(200,100);    
        etiquetaImagen = new JLabel();
        etiquetaImagen.setPreferredSize(new Dimension(400, 300)); // Establece un tamaño máximo para la imagen
        this.pantallaPrincipal = pantallaPrincipal;
     
        descripcionImagen = new JTextArea(8, 20); // Agrega un JTextArea para mostrar la descripción de la imagen
        descripcionImagen.setEditable(false); // No permite editar el texto
        fauna = new Fauna();

        JButton botonIzquierda = new JButton("◄");
        JButton botonDerecha = new JButton("►");
        JButton botonRegresar = new JButton("Regresar");

        /**
         * Agrega un ActionListener al botón izquierdo para mostrar la imagen anterior.
         */
        botonIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anteriorImagen();
            }
        });

        /**
         * Agrega un ActionListener al botón derecho para mostrar la imagen siguiente.
         */
        botonDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteImagen();
            }
        });

        /**
         * Agrega un ActionListener al botón de regresar para volver a la pantalla principal.
         */
        botonRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla_Principal c = new  Pantalla_Principal();
                c.setVisible(true);
                dispose(); // Cierra la ventana actual
            
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(etiquetaImagen, BorderLayout.CENTER);
       
        panel.add(descripcionImagen, BorderLayout.SOUTH);
        panel.add(botonIzquierda, BorderLayout.WEST);
        panel.add(botonDerecha, BorderLayout.EAST);
        panel.add(botonRegresar, BorderLayout.NORTH); // Agrega el botón a la parte superior del panel

        setContentPane(panel);
        setSize(800, 650);
        setMinimumSize(getPreferredSize());
        setVisible(true);

        currentImageIndex = 0;
        mostrarImagen();
    }

    /**
     * Muestra la imagen anterior en la colección de fauna.
     */
    private void anteriorImagen() {
        fauna.anteriorImagen();
        currentImageIndex--;
        if (currentImageIndex < 0) {
            currentImageIndex = 15;
        }
        mostrarImagen();
    }

    /**
     * Muestra la imagen siguiente en la colección de fauna.
     */
    private void siguienteImagen() {
        fauna.siguienteImagen();
        currentImageIndex++;
        if (currentImageIndex >= 16) {
            currentImageIndex = 0;
        }
        mostrarImagen();
    }

    /**
     * Muestra la imagen actual y su descripción.
     */
    private void mostrarImagen() {
        ImageIcon imagen = fauna.getImagen();
        imagen.setImage(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT));
        etiquetaImagen.setIcon(imagen);
        descripcionImagen.setText(fauna.getNombre()+"\n"+fauna.getEstado()+"\n"+fauna.getDescripcion());
    }

    /**
     * Método principal para lanzar la aplicación.
     */
    public static void main(String[] args) {
       new Nuestra_Fauna();
    }
}

