package ObjetoPersona;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import ObjetoPersona.Visitante;

public class Visitante extends Persona {
    // Variables de instancia
    public String LugarDeseado;
    public int cantidadmiembros;
     // Declare the JDBC objects.
     Connection con = null;
     Statement stmt = null;
     ResultSet rs = null;
     int exito = 0;
     Visitante v = new Visitante("", 0, "", 0);

    // Constructor
    public Visitante(String nombre, int cedula, String lugarDeseado, int cantidadmiembros) {
        super(nombre, cedula);
        LugarDeseado = lugarDeseado;
        this.LugarDeseado = lugarDeseado;
        this.cantidadmiembros = cantidadmiembros;
    }

    // Getter para LugarDeseado
    public String getLugarDeseado() {
        return LugarDeseado;
    }

    // Setter para LugarDeseado
    public void setLugarDeseado(String lugarDeseado) {
        LugarDeseado = lugarDeseado;
    }

    // Getter para cantidadmiembros
    public int getCantidadmiembros() {
        return cantidadmiembros;
    }

    // Setter para cantidadmiembros
    public void setCantidadmiembros(int cantidadmiembros) {
        this.cantidadmiembros = cantidadmiembros;
    }

    // Método para mostrar lugares a visitar en la provincia de Guanacaste
    public void MGuanacaste(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
  
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Santa Rosa"+"\n"+
        "Parque Nacional Guanacaste"+"\n"+"Estación Experimental Forestal Horizontes"
        +"\n"+"Refugio de Vida Silvestre Bahía Junquillal.");
    }

    // Método para mostrar lugares a visitar en la provincia de Limón
    public void MLimón(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Cahuita"+"\n"+
        "Parque Nacional Tortuguero"+"\n"+"Parque Nacional Barbilla"+"\n"+"Parque Nacional Braulio Carrillo"
        +"\n"+"Playa Punta Uva");
    }

    // Método para mostrar lugares a visitar en la provincia de Puntarenas
    public void MPuntarenas(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Corcovado"+"\n"+
        "Parque Nacional Manuel Antonio"+"\n"+"Parque Nacional Isla San Lucas"+"\n"+"Parque Nacional Marino Ballena"
        +"\n"+"Parque Nacional Carara");
    }

    // Método para mostrar lugares a visitar en la provincia de Alajuela
    public void MAlajuela(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Volcán Arenal"+"\n"+
        "Parque Nacional Rincón de la Vieja"+"\n"+"Parque Nacional Volcán Tenorio"+"\n"+"Parque Nacional Juan Castro Blanco"
        +"\n"+"Parque Nacional Volcán Poás");
    }

    // Método para mostrar lugares a visitar en la provincia de Heredia
    public void MHeredia(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "El Arca Jardín Botánico"+"\n"+
        "Estación Biológica La Selva"+"\n"+"Pirella Ecological Garden"+"\n"+"Tirimbina Biological Reserve"
        +"\n"+"Bosque La Hoja");
    }

    // Método para mostrar lugares a visitar en la provincia de San José
    public void MSan_José(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Los Quetzales"+"\n"+
        "Parque La Sabana"+"\n"+"Parque Nacional Braulio Carrillo"+"\n"+"Monte Sky"
        +"\n"+"Laguna Don Manuel");
    }

    // Método para mostrar lugares a visitar en la provincia de Cartago
    public void MCartago(){
        String SQL = "INSERT INTO estudiantes (nombre, cedula, lugar) VALUES ('"+Nombre+"', '"+Cedula+"', '"+LugarDeseado+"');";
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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Volcán Irazú"+"\n"+
        "Parque Nacional Tapantí Macizo de la Muerte"+"\n"+"Parque Nacional Volcán Turrialba"+"\n"+"Guayabo National Monument"
        +"\n"+"Parque Recreativo Lankester");
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