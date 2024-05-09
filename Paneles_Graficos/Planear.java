package Paneles_Graficos;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


import ObjetoPersona.Visitante;

import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Planear extends JFrame {
    
    
    private JTextField txtnombre;
    private JTextField txtcedula;
    private JComboBox<String> provinciaBox;
    private Visitante visitante;

    public Planear(){
        this.setLocation(300,200);
        this.setLayout(new GridLayout(5, 3));

        txtnombre = new JTextField(5); // Set the number of columns to 10
        txtcedula = new JTextField(5); // Set the number of columns to 10
        String[] provincias = {"Guanacaste", "Limón", "Puntarenas", "Alajuela", "Heredia", "San José", "Cartago"};
        provinciaBox = new JComboBox<>(provincias);

        add(new JLabel("Nombre:"));
        add(txtnombre);
        add(new JLabel("Cédula:"));
        add(txtcedula);
        add(new JLabel("Provincia:"));
        add(provinciaBox);

        visitante = new Visitante("",0,"",0); // Initialize the visitante object

        JButton aceptarButton = new JButton("Aceptar");
        aceptarButton.setPreferredSize(new Dimension(50, 15)); // Set the preferred size to 100px wide and 30px high
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                 String nombre=txtnombre.getText();
                 visitante.setNombre(nombre);
                 String lugar = (String) provinciaBox.getSelectedItem();
                 visitante.setLugarDeseado(lugar);
                   
                if(txtnombre.getText().isEmpty()||txtcedula.getText().isEmpty()){

                    JOptionPane.showMessageDialog(null, "Rellene todos los campos");
                }
                
                else{
               
                    if((String) provinciaBox.getSelectedItem().toString()=="Guanacaste"){

                         visitante.MGuanacaste();
                         Pantalla_Principal c = new Pantalla_Principal();
                         c.setVisible(true);
                                    dispose();
                    }
                    if((String) provinciaBox.getSelectedItem().toString()=="Limón"){
                        visitante.MLimón();
                        Pantalla_Principal c = new Pantalla_Principal();
                        c.setVisible(true);
                                   dispose();
                        
                    }
                    if((String) provinciaBox.getSelectedItem().toString()=="Puntarenas"){
                        visitante.MPuntarenas();
                        Pantalla_Principal c = new Pantalla_Principal();
                        c.setVisible(true);
                                   dispose();
                        
                    }
                    if((String) provinciaBox.getSelectedItem().toString()=="Alajuela"){
                        visitante.MAlajuela();
                        Pantalla_Principal c = new Pantalla_Principal();
                        c.setVisible(true);
                                   dispose();
                        
                    }
                    if((String) provinciaBox.getSelectedItem().toString()=="Heredia"){
                        visitante.MHeredia();
                        Pantalla_Principal c = new Pantalla_Principal();
                        c.setVisible(true);
                                   dispose();
                        
                    }
                    if((String) provinciaBox.getSelectedItem().toString()=="San José"){
                        visitante.MSan_José();
                        Pantalla_Principal c = new Pantalla_Principal();
                        c.setVisible(true);
                                   dispose();
                        
                    }
                    if((String) provinciaBox.getSelectedItem().toString()=="Cartago"){
                        visitante.MCartago();
                        Pantalla_Principal c = new Pantalla_Principal();
                        c.setVisible(true);
                                   dispose();
                        
                    }
                    
                }

               // JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nCédula: " + cedula + "\nProvincia: " + provincia);
            }
        });
        add(aceptarButton);

        pack();
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        new Planear();

    }
}

/*String nombre = nombreField.getText();
            String cedula = cedulaField.getText();
            String provincia = (String) provinciaBox.getSelectedItem(); */