package Paneles_Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla_Principal extends JFrame {

    private JPanel panelPrincipal;
    private JButton botonVerLugares;
    private JButton botonPlanearActividades;
    private JButton botonAyuda;
    private JButton botonNuestraFauna;

    public Pantalla_Principal() {
        super("Nuestro Costa Rica");

        // Inicializar componentes
        panelPrincipal = new JPanel();
        botonVerLugares = new JButton("VER LUGARES");
        botonPlanearActividades = new JButton("PLANEA ACTIVIDADES");
      
        botonAyuda = new JButton("AYUDA");
        botonNuestraFauna = new JButton("NUESTRA FAUNA"); // Renamed and updated text

        // Configurar panel principal
        panelPrincipal.setLayout(new GridLayout(2, 2, 20, 20)); // 2 rows, 2 columns, 20 pixels of horizontal and vertical gap

        // Agregar botones
        panelPrincipal.add(botonVerLugares);
        panelPrincipal.add(botonPlanearActividades);
        panelPrincipal.add(botonAyuda);
        panelPrincipal.add(botonNuestraFauna);

        // Agregar ActionListener to botonNuestraFauna
        botonNuestraFauna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new instance of the Nuestra_Fauna class
                Nuestra_Fauna nuevaVentana = new Nuestra_Fauna();
                nuevaVentana.setVisible(true);
                dispose();
            }
        });

        // Configurar tamaños de botones
        int buttonWidth = 75;
        int buttonHeight = 35;

        botonVerLugares.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonPlanearActividades.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonAyuda.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonNuestraFauna.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        // Agregar panel principal al frame
        getContentPane().add(panelPrincipal);

        // Configurar frame
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pantalla_Principal();
    }
}