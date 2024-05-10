package Paneles_Graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla_Principal extends JFrame {

    // Declarar e inicializar componentes
    private JPanel panelPrincipal;
    private JButton botonVerLugares;
    private JButton botonPlanearActividades;
    private JButton botonInfo;
    private JButton botonNuestraFauna;

    public Pantalla_Principal() {
        super("Nuestro Costa Rica");

        // Inicializar componentes
        panelPrincipal = new JPanel();
        botonVerLugares = new JButton("VER LUGARES");
        botonPlanearActividades = new JButton("PLANEA ACTIVIDADES");
        botonInfo = new JButton("INFORMACIÖN");
        botonNuestraFauna = new JButton("NUESTRA FAUNA"); // Renombrado y actualizado el texto

        // Establecer layout para el panel principal
        panelPrincipal.setLayout(new GridLayout(2, 2, 20, 20)); // 2 filas, 2 columnas, 20 píxeles de espacio horizontal y vertical

        // Agregar botones al panel principal
        panelPrincipal.add(botonVerLugares);
        panelPrincipal.add(botonPlanearActividades);
        panelPrincipal.add(botonInfo);
        panelPrincipal.add(botonNuestraFauna);

        // Agregar ActionListener a botonNuestraFauna
        botonNuestraFauna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva instancia de la clase Nuestra_Fauna y mostrarla
                Nuestra_Fauna nuevaVentana = new Nuestra_Fauna();
                nuevaVentana.setVisible(true);
                dispose();
            }
        });

        // Agregar ActionListener a botonVerLugares
        botonVerLugares.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva instancia de la clase VerLugares y mostrarla
                VerLugares nueva = new VerLugares();
                nueva.setVisible(true);
                dispose();
            }
        });

        // Agregar ActionListener a botonPlanearActividades
        botonPlanearActividades.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva instancia de la clase Planear y mostrarla
                Planear n = new Planear();
                n.setVisible(true);
                dispose();
            }
        });

        // Agregar ActionListener a botonInfo
        botonInfo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una nueva instancia de la clase Info y mostrarla
                Info ne= new Info();
                ne.setVisible(true);
                dispose();
            }
        });

        // Establecer tamaño preferido para los botones
        int buttonWidth = 75;
        int buttonHeight = 35;

        botonVerLugares.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonPlanearActividades.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonInfo.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonNuestraFauna.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        // Agregar panel principal al frame
        getContentPane().add(panelPrincipal);

        // Establecer propiedades del frame
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pantalla_Principal();
    }
}