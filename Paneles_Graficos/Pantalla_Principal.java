package Paneles_Graficos;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pantalla_Principal extends JFrame {

    private JPanel panelPrincipal;
    private JButton botonVerLugares;
    private JButton botonPlanearActividades;
    private JLabel etiquetaNuestraFauna;
    private JButton botonAyuda;
    private JButton botonNuestraFauna;

    public Pantalla_Principal() {
        super("Nuestro Costa Rica");

        // Inicializar componentes
        panelPrincipal = new JPanel();
        botonVerLugares = new JButton("VER LUGARES");
        botonPlanearActividades = new JButton("PLANEA ACTIVIDADES");
        etiquetaNuestraFauna = new JLabel(); // Removed text
        botonAyuda = new JButton("AYUDA");
        botonNuestraFauna = new JButton("NUESTRA FAUNA"); // Renamed and updated text

        // Configurar panel principal
        panelPrincipal.setLayout(new BorderLayout(20, 20)); // 20 pixels of horizontal and vertical gap

        // Crear panel para botones arriba
        JPanel panelBotonesArriba = new JPanel();
        panelBotonesArriba.setLayout(new GridLayout(1, 2, 20, 20)); // 1 row, 2 columns, 20 pixels of horizontal and vertical gap

        // Agregar botones arriba
        panelBotonesArriba.add(botonVerLugares);
        panelBotonesArriba.add(botonPlanearActividades);

        // Crear panel para botones abajo
        JPanel panelBotonesAbajo = new JPanel();
        panelBotonesAbajo.setLayout(new GridLayout(1, 2, 20, 20)); // 1 row, 2 columns, 20 pixels of horizontal and vertical gap

        // Agregar botones abajo
        panelBotonesAbajo.add(botonAyuda);
        panelBotonesAbajo.add(botonNuestraFauna);

        // Agregar ActionListener to botonNuestraFauna
        botonNuestraFauna.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create a new instance of the Nuestra_Fauna class
                Nuestra_Fauna nuevaVentana = new Nuestra_Fauna();
                // Make the new instance visible
                nuevaVentana.setVisible(true);
                // Close the current window
                Pantalla_Principal.this.dispose();
            }
        });

        // Agregar paneles de botones al panel principal
        panelPrincipal.add(panelBotonesArriba, BorderLayout.NORTH);
        panelPrincipal.add(panelBotonesAbajo, BorderLayout.CENTER);

        // Agregar etiqueta (no visible)
        panelPrincipal.add(etiquetaNuestraFauna, BorderLayout.SOUTH);

        // Configurar tamaños de botones
        int buttonWidth = 75;
        int buttonHeight = 30;

        botonVerLugares.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonPlanearActividades.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonAyuda.setPreferredSize(new Dimension(buttonWidth, buttonHeight));
        botonNuestraFauna.setPreferredSize(new Dimension(buttonWidth, buttonHeight));

        // Agregar panel principal al frame
        getContentPane().add(panelPrincipal);

        // Configurar frame
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Pantalla_Principal();
    }
}