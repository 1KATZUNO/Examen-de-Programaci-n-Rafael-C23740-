package Paneles_Graficos;

import javax.swing.*;

import Logica_De_Programación.ImagenLugar;
import Logica_De_Programación.Lugares;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerLugares extends JFrame {
    private JLabel etiquetaImagen;
    
    private JTextArea descripcionImagen;
    private Lugares lugares;
    private int currentImageIndex;
    private Pantalla_Principal pantallaPrincipal;

    public VerLugares() {
        
        super("Ver Lugares");
        this.setLocation(200,100);    
        etiquetaImagen = new JLabel();
        etiquetaImagen.setPreferredSize(new Dimension(400, 300)); // Establece un tamaño máximo para la imagen
        this.pantallaPrincipal = pantallaPrincipal;
     
        descripcionImagen = new JTextArea(5, 20); // Agrega un JTextArea para mostrar la descripción de la imagen
        descripcionImagen.setEditable(false); // No permite editar el texto
        lugares = new Lugares();

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
        lugares.siguienteImagen();
        currentImageIndex++;
        if (currentImageIndex >= 8) {
            currentImageIndex = 0;
        }
        mostrarImagen();
    }

    private void anteriorImagen() {
        lugares.anteriorImagen();
        currentImageIndex--;
        if (currentImageIndex < 0) {
            currentImageIndex = 7;
        }
        mostrarImagen();
    }

    private void mostrarImagen() {
        ImageIcon imagen = lugares.getImagen();
        imagen.setImage(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT));
        etiquetaImagen.setIcon(imagen);
        descripcionImagen.setText(lugares.getDescripcion()+"\n"+lugares.getNombre());
    }

    public static void main(String[] args) {
       new VerLugares();
    }
}
