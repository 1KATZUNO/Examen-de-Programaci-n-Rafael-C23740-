package ObjetoPersona;

import javax.swing.JOptionPane;

import ConexiónMySql.DatabaseManager;

import java.sql.ResultSet;

public class Visitante extends Persona {
    // Variables de instancia
    private String LugarDeseado;
    private int cantidadmiembros;
    private DatabaseManager dbManager;

    // Constructor
    public Visitante(String nombre, int cedula, String lugarDeseado, int cantidadmiembros) {
        super(nombre, cedula);
        this.LugarDeseado = lugarDeseado;
        this.cantidadmiembros = cantidadmiembros;
        this.dbManager = new DatabaseManager();
    }

    // Getters y setters
    public String getLugarDeseado() {
        return LugarDeseado;
    }

    public void setLugarDeseado(String lugarDeseado) {
        LugarDeseado = lugarDeseado;
    }

    public int getCantidadmiembros() {
        return cantidadmiembros;
    }

    public void setCantidadmiembros(int cantidadmiembros) {
        this.cantidadmiembros = cantidadmiembros;
    }

    // Método para mostrar lugares a visitar en diferentes provincias
    private void mostrarLugares(String mensaje, String[] lugares) {
        try {
            dbManager.connect();
            String SQL = "INSERT INTO datos (nombre, cedula, lugar) VALUES (?, ?, ?);";
            int exito = dbManager.executeUpdate(SQL, new Object[]{getNombre(), getCedula(), getLugarDeseado()});
            if (exito != 0) {
                ResultSet rs = dbManager.executeQuery("SELECT * FROM datos;");
                displayRow("datos", rs);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            dbManager.close();
        }

        StringBuilder lugaresString = new StringBuilder();
        for (String lugar : lugares) {
            lugaresString.append(lugar).append("\n");
        }

        JOptionPane.showMessageDialog(null, Nombre + "\n" + mensaje + "\n" + " " + "\n" + lugaresString.toString());
    }

    // Métodos específicos para cada provincia
    public void MGuanacaste() {
        String[] lugares = {"Parque nacional Santa Rosa", "Parque Nacional Guanacaste", "Estación Experimental Forestal Horizontes", "Refugio de Vida Silvestre Bahía Junquillal"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
    }

    public void MLimón() {
        String[] lugares = {"Parque nacional Cahuita", "Parque Nacional Tortuguero", "Parque Nacional Barbilla", "Parque Nacional Braulio Carrillo", "Playa Punta Uva"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
    }

    public void MPuntarenas() {
        String[] lugares = {"Parque nacional Corcovado", "Parque Nacional Manuel Antonio", "Parque Nacional Isla San Lucas", "Parque Nacional Marino Ballena", "Parque Nacional Carara"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
    }

    public void MAlajuela() {
        String[] lugares = {"Parque Nacional Volcán Arenal", "Parque Nacional Rincón de la Vieja", "Parque Nacional Volcán Tenorio", "Parque Nacional Juan Castro Blanco", "Parque Nacional Volcán Poás"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
    }

    public void MHeredia() {
        String[] lugares = {"El Arca Jardín Botánico", "Estación Biológica La Selva", "Pirella Ecological Garden", "Tirimbina Biological Reserve", "Bosque La Hoja"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
    }

    public void MSan_José() {
        String[] lugares = {"Parque Nacional Los Quetzales", "Parque La Sabana", "Parque Nacional Braulio Carrillo", "Monte Sky", "Laguna Don Manuel"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
    }

    public void MCartago() {
        String[] lugares = {"Parque Nacional Volcán Irazú", "Parque Nacional Tapantí Macizo de la Muerte", "Parque Nacional Volcán Turrialba", "Guayabo National Monument", "Parque Recreativo Lankester"};
        mostrarLugares("Lugares a visitar en tu provincia: " + LugarDeseado, lugares);
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

