package Paneles_Graficos;

import java.sql.*;
import javax.swing.JOptionPane;

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
    public static String busca = " ";

    public Editar_Actividades() {
        initComponents();
        this.setLocationRelativeTo(null);
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
                    .addGap(16, 16, 16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addContainerGap(15, Short.MAX_VALUE))
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {
        busca = JOptionPane.showInputDialog(null, "Digite la cédula a eliminar: ");
        if (busca != null && !busca.isEmpty()) {
            eliminar();
        } else {
            JOptionPane.showMessageDialog(null, "Cédula no puede estar vacía.");
        }
    }

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {
        // Implementación para actualizar la actividad
    }

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {
        // Implementación para mostrar las actividades
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

    private void eliminar() {

        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // Establece la conexión.
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users?verifyServerCertificate=false&useSSL=true", "root", "2207");

            // Sentencia SQL para eliminar.
            String sqlEliminar = "DELETE FROM datos WHERE cedula='" + busca + "';";
            String sqlMostrar = "SELECT * FROM datos;";

            stmt = con.createStatement();
            int exito = stmt.executeUpdate(sqlEliminar);
            System.out.println("Valor: " + exito);

            if (exito > 0) {
                rs = stmt.executeQuery(sqlMostrar);
                displayRow("datos", rs);
                JOptionPane.showMessageDialog(null,"Dato eliminado exitosamente");
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la cédula a eliminar.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void editar() {
        // Implementación para editar la actividad
         // Declare the JDBC objects.


       Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        int exito = 0;

        String SQL = "UPDATE estudiantes set nombre1='CAMBIAR NOMBRE' WHERE carnet='1234'";
        String sqlMostrar = "SELECT * FROM estudiantes;";

        try {
            // Establish the connection.
          	Class.forName("com.mysql.jdbc.Driver");
          	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/matricula?verifyServerCertificate=false&useSSL=true", "root", "12345");
            con.setAutoCommit(true);
        	
        	stmt = con.createStatement();
            exito = stmt.executeUpdate(SQL);
            if (exito!=0)
            {            	
            	System.out.print("Registro actualizado con  xito...");
            	rs = stmt.executeQuery(sqlMostrar);
            	displayRow("ESTUDIANTES", rs);
            }
            else
            	System.out.print("No existe cliente con la c dula indicada");
        }
        catch (Exception e) {
            e.printStackTrace();
         }
         
         finally {
            if (rs != null) try { rs.close(); } catch(Exception e) {}
            if (stmt != null) try { stmt.close(); } catch(Exception e) {}
            if (con != null) try { con.close(); } catch(Exception e) {}
         }
    }

    private void mostrar() {
        // Implementación para mostrar las actividades
    }

    private static void displayRow(String title, ResultSet rs) {
        try {
            System.out.println(title);
            while (rs.next()) {
                System.out.println("Cédula --> " + rs.getString("cedula") + " Nombre --> " + rs.getString("nombre"));
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
