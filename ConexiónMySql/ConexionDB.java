package ConexiónMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConexionDB {
    // Declaramos la conexion a mysql
    public static Connection con;
    // Declaramos los datos de conexion a la bd
    private static final String driver = "com.mysql.cj.jdbc.Driver"; // Asegúrate de usar el nombre de clase correcto
    private static final String user = "root";
    private static final String pass = "2207";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/users?characterEncoding=utf8";

    // Funcion que va conectarse a mi bd de mysql
    public Connection conectar() {
        con = null;
        try {
            // Registrar el driver
            Class.forName(driver);

            // Establecer la conexión
            con = DriverManager.getConnection(url, user, pass);
            if (con != null) {
                JOptionPane.showMessageDialog(null, "Conexión exitosa");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.toString());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error al registrar el driver: " + e.toString());
        }
        return con;
    }

    // Funcion para obtener datos de la tabla dadada del esquema users
    public void obtenerDatos() {
        conectar();
        try {
            // Crear una declaración
            Statement stmt = con.createStatement();

            // Ejecutar una consulta
            String query = "SELECT * FROM users.dadada";
            ResultSet rs = stmt.executeQuery(query);

            // Procesar los resultados
            while (rs.next()) {
                // Supongamos que la tabla tiene una columna llamada 'id' y otra llamada 'nombre'
                int id = rs.getInt("id");
                String nombre = rs.getString("nombre");

                // Imprimir los datos
                System.out.println("ID: " + id + ", Nombre: " + nombre);
            }

            // Cerrar los recursos
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener los datos: " + e.toString());
        }
    }

    public static void main(String[] args) {
        ConexionDB conexion = new ConexionDB();
        conexion.obtenerDatos();
    }
}
