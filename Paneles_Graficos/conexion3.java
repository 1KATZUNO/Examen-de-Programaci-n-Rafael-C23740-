package Paneles_Graficos;

import java.sql.*;

public class conexion3 {
   
   public static void main(String[] args) {
      
      // Declare the JDBC objects.
      Connection con = null;
      Statement stmt = null;
      ResultSet rs = null;
      
      try {
         
         // Establish the connection.
    	  Class.forName("com.mysql.jdbc.Driver");
    	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login?verifyServerCertificate=false&useSSL=true", "root", "2207");
          con.setAutoCommit(true);
         
         // Create and execute an SQL statement that returns a
         // set of data and then display it.
         String SQL = "SELECT * FROM usuarios";
         stmt = con.createStatement();
         rs = stmt.executeQuery(SQL); //rs contiene los registros traidos de la BD.
         displayRow("usuarios", rs);
      }
      
      // Handle any errors that may have occurred.
      catch (Exception e) {
         e.printStackTrace();
      }
      
      finally {
         if (rs != null) try { rs.close(); } catch(Exception e) {}
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}
         if (con != null) try { con.close(); } catch(Exception e) {}
      }
   }
   
   private static void displayRow(String title, ResultSet rs) {
      try {
         System.out.println(title);
         while (rs.next()) { //recorre rs y muestra cada registro traido de la BD.
            System.out.println(rs.getString("nombre") + " : " + rs.getString("clave") );
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}