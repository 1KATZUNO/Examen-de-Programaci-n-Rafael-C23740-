package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexionDB {
    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String pass="2207";
    private static final String url="jdbc:mysql://localhost:3306/login?";
    // Funcion que va conectarse a mi bd de mysql  characterEncoding=utf8
    public Connection conectar(){
      con = null;
      try{
          con = (Connection) DriverManager.getConnection(url, user, pass);
          if(con!=null){
          }
      }
      catch(SQLException e)
      {
          JOptionPane.showMessageDialog(null,"Error" + e.toString());
      }
      return con;
    }
}
