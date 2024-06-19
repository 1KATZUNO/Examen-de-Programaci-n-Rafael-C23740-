package ConexiónMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import ObjetoPersona.Visitante;

public class insertInto {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main() {
               
        // Declare the JDBC objects.
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;
        int exito = 0;
        Visitante v = new Visitante("", 0, "", 0);


        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+v.getNombre()+"', '"+v.getCedula()+"', '"+v.getLugarDeseado()+"');";
        String sqlMostrar = "SELECT * FROM datos;";

        try {
            // Establish the connection.
        	Class.forName("com.mysql.jdbc.Driver");
        	con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/users?verifyServerCertificate=false&useSSL=true", "root", "2207");
            con.setAutoCommit(true);
        	
        	stmt = con.createStatement();
            exito = stmt.executeUpdate(SQL);
            if (exito!=0)
            {            	
            	rs = stmt.executeQuery(sqlMostrar);
            	displayRow("datos", rs);
            }
            	
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
 
    private static void displayRow(String title, ResultSet rs) {
        try {
           System.out.println(title);
           while (rs.next()) {
              System.out.println(rs.getString("cedula") + " : " + rs.getString("nombre"));
              System.out.println();
           }
        } catch (Exception e) {
           e.printStackTrace();
        }
     }
}