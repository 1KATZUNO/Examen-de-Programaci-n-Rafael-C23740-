package Paneles_Graficos;

import javax.swing.*;

import Logica_De_Programación.Lugares;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VerLugares extends JFrame {
    // Label para mostrar la imagen
    private JLabel etiquetaImagen;

    // Text area para mostrar la descripción de la imagen
    private JTextArea descripcionImagen;

    // Objeto para almacenar la lista de lugares
    private Lugares lugares;

    // Índice para mantener el seguimiento de la imagen actual que se muestra
    private int currentImageIndex;

    // Referencia a la pantalla principal
    private Pantalla_Principal pantallaPrincipal;

    /**
     * Constructor para inicializar los componentes y mostrar el marco
     */
    public VerLugares() {

        super("Ver Lugares");
        this.setLocation(200,100);    

        // Inicializar el label para mostrar la imagen
        etiquetaImagen = new JLabel();
        etiquetaImagen.setPreferredSize(new Dimension(400, 300)); // Establecer el tamaño máximo para la imagen

        // Inicializar el text area para mostrar la descripción de la imagen
        descripcionImagen = new JTextArea(5, 20);
        descripcionImagen.setEditable(false); // Hacer el text area no editable

        // Inicializar el objeto para almacenar la lista de lugares
        lugares = new Lugares();

        // Inicializar los botones para navegar a través de las imágenes
        JButton botonIzquierda = new JButton("◄");
        JButton botonDerecha = new JButton("►");
        JButton botonRegresar = new JButton("Regresar");

        // Agregar el listener de acción al botón izquierdo
        botonIzquierda.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anteriorImagen();
            }
        });

        // Agregar el listener de acción al botón derecho
        botonDerecha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                siguienteImagen();
            }
        });

        // Agregar el listener de acción al botón de regreso
        botonRegresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pantalla_Principal c = new  Pantalla_Principal();
                c.setVisible(true);
                dispose(); // Cerrar la ventana actual
            }
        });

        // Inicializar el panel para contener los componentes
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Agregar el label para mostrar la imagen al centro del panel
        panel.add(etiquetaImagen, BorderLayout.CENTER);

        // Agregar el text area para mostrar la descripción de la imagen al sur del panel
        panel.add(descripcionImagen, BorderLayout.SOUTH);

        // Agregar el botón izquierdo al oeste del panel
        panel.add(botonIzquierda, BorderLayout.WEST);

        // Agregar el botón derecho al este del panel
        panel.add(botonDerecha, BorderLayout.EAST);

        // Agregar el botón de regreso al norte del panel
        panel.add(botonRegresar, BorderLayout.NORTH);

        // Establecer el panel como el contenido del marco
        setContentPane(panel);

        // Establecer el tamaño del marco
        setSize(800, 650);

        // Establecer el tamaño mínimo del marco
        setMinimumSize(getPreferredSize());

        // Hacer el marco visible
        setVisible(true);

        // Inicializar el índice de la imagen actual
        currentImageIndex = 0;

        // Llamar al método para mostrar la primera imagen
        mostrarImagen();
    }

    /**
     * Método para mostrar la imagen anterior
     */
    private void anteriorImagen() {
        lugares.anteriorImagen();
        currentImageIndex--;
        if (currentImageIndex < 0) {
            currentImageIndex = 7;
        }
        mostrarImagen();
    }

    /**
     * Método para mostrar la imagen siguiente
     */
    private void siguienteImagen() {
        lugares.siguienteImagen();
        currentImageIndex++;
        if (currentImageIndex >= 8) {
            currentImageIndex = 0;
        }
        mostrarImagen();
    }

    /**
     * Método para mostrar la imagen y su descripción
     */
    private void mostrarImagen() {
        // Obtener la imagen de la lista de lugares
        ImageIcon imagen = lugares.getImagen();

        // Escalar la imagen para ajustarla al label
        imagen.setImage(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT));

        // Establecer la imagen como el icono del label
        etiquetaImagen.setIcon(imagen);

        // Establecer la descripción de la imagen en el text area
        descripcionImagen.setText(lugares.getNombre()+"\n"+lugares.getDescripcion());
    }

    /**
     * Método principal para ejecutar la aplicación
     */
    public static void main(String[] args) {
       new VerLugares();
    }
}
