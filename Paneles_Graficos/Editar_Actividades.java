package Paneles_Graficos;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Editar_Actividades extends javax.swing.JFrame {

    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtActualizar;
    private javax.swing.JButton btnRegresar;
    public static String busca = " ";
    public static String nombre = "0";
    public static String cedula = "0";
    public static String lugar = "0";
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;

    public Editar_Actividades() {
        initComponents();
        this.setLocationRelativeTo(null);
        conectarDB();
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtActualizar = new javax.swing.JTextArea();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/actualizar-base-de-datos.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/mostrar-contrasena.png"))); // NOI18N

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        txtActualizar.setColumns(20);
        txtActualizar.setRows(5);
        jScrollPane1.setViewportView(txtActualizar);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(btnEliminar)
                .addGap(106, 106, 106)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMostrar)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminar)
                    .addComponent(btnActualizar)
                    .addComponent(btnMostrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {                                            
       Pantalla_Principal p = new Pantalla_Principal();
       p.setVisible(true);
       dispose();
    }  

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        busca = JOptionPane.showInputDialog(null, "Digite la cédula a eliminar: ");
        if (busca != null && !busca.isEmpty()) {
            eliminar();
        } else {
            JOptionPane.showMessageDialog(null, "Cédula no puede estar vacía.");
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        busca = JOptionPane.showInputDialog(null, "Digite la cédula a editar: ");
        if (busca != null && !busca.isEmpty()) {
            cedula = JOptionPane.showInputDialog(null, "Digite la nueva cédula: ");
            nombre = JOptionPane.showInputDialog(null, "Digite el nuevo nombre: ");
            lugar = JOptionPane.showInputDialog(null, "Digite el nuevo lugar: ");
            if (cedula != null && nombre != null && lugar != null && 
                !cedula.isEmpty() && !nombre.isEmpty() && !lugar.isEmpty()) {
                editar();
            } else {
                JOptionPane.showMessageDialog(null, "Todos los campos deben ser llenados.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Cédula no puede estar vacía.");
        }
    }

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        mostrarDatos(); // Llama al método para mostrar datos
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editar_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Actividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editar_Actividades().setVisible(true);
            }
        });
    }

    private void conectarDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users?verifyServerCertificate=false&useSSL=true", "root", "2207");
            con.setAutoCommit(true);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void eliminar() {
        try {
            String sqlEliminar = "DELETE FROM datos WHERE cedula='" + busca + "';";
            stmt = con.createStatement();
            int exito = stmt.executeUpdate(sqlEliminar);
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Dato eliminado exitosamente");
                mostrarDatos(); // Actualiza la visualización después de eliminar
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la cédula a eliminar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar el dato: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void editar() {
        try {
            String SQL = "UPDATE datos set cedula='" + cedula + "', nombre='" + nombre + "', lugar='" + lugar + "' WHERE cedula='" + busca + "'";
            stmt = con.createStatement();
            int exito = stmt.executeUpdate(SQL);
            if (exito > 0) {
                JOptionPane.showMessageDialog(null, "Dato editado exitosamente");
                mostrarDatos(); // Actualiza la visualización después de editar
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la cédula a editar.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al editar el dato: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void mostrarDatos() {
        try {
            String SQL = "SELECT * FROM datos";
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQL);
            StringBuilder sb = new StringBuilder();
            while (rs.next()) {
                sb.append("Cédula: ").append(rs.getString("cedula")).append(", Nombre: ").append(rs.getString("nombre"))
                        .append(", Lugar: ").append(rs.getString("lugar")).append("\n");
            }
            txtActualizar.setText(sb.toString()); // Muestra los datos en el JTextArea
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar los datos: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

