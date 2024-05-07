package Paneles_Graficos;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Nuestra_Fauna extends JFrame {
    private JLabel etiquetaImagen;
    private List<ImageIcon> imagenes;
    private int indiceImagen;

    public Nuestra_Fauna() {
        super("Nuestra Fauna"); // Set the window title
        setLocationRelativeTo(null); // Centrar el programa en la pantalla
        etiquetaImagen = new JLabel();
        imagenes = new ArrayList<>();
        indiceImagen = 0;

        cargarImagenes();

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
        setSize(800, 600); // Set a specific window size
        setMinimumSize(getPreferredSize()); // Ensure minimum size
        setVisible(true);
    }

    private void cargarImagenes() {
        File carpeta = new File("Fotos/fotos_animales");
        File[] archivos = carpeta.listFiles();

        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().endsWith(".jpg")) {
                try {
                    // Cargar la imagen
                    BufferedImage imagenOriginal = ImageIO.read(archivo);

                    // Escalar la imagen a un tamaño específico
                    int ancho = 500;
                    int alto = 500;
                    BufferedImage imagenEscalada = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
                    Graphics2D g = imagenEscalada.createGraphics();
                    g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
                    g.drawImage(imagenOriginal, 0, 0, ancho, alto, null);
                    g.dispose();

                    // Agregar la imagen escalada a la lista
                    imagenes.add(new ImageIcon(imagenEscalada));

                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error loading image: " + archivo.getName(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void siguienteImagen() {
        indiceImagen++;
        if (indiceImagen >= imagenes.size()) {
            indiceImagen = 0;
        }
        mostrarImagen();
    }

    private void anteriorImagen() {
        indiceImagen--;
        if (indiceImagen < 0) {
            indiceImagen = imagenes.size() - 1;
        }
        mostrarImagen();
    }

    private void mostrarImagen() {
        etiquetaImagen.setIcon(imagenes.get(indiceImagen));
        etiquetaImagen.setMinimumSize(etiquetaImagen.getPreferredSize());
    }

    public static void main(String[] args) {
        new Nuestra_Fauna();
    }
}
