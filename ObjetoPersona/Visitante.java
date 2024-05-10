package ObjetoPersona;

import javax.swing.JOptionPane;

public class Visitante extends Persona {
    // Variables de instancia
    private String LugarDeseado;
    private int cantidadmiembros;

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
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Santa Rosa"+"\n"+
        "Parque Nacional Guanacaste"+"\n"+"Estación Experimental Forestal Horizontes"
        +"\n"+"Refugio de Vida Silvestre Bahía Junquillal.");
    }

    // Método para mostrar lugares a visitar en la provincia de Limón
    public void MLimón(){
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Cahuita"+"\n"+
        "Parque Nacional Tortuguero"+"\n"+"Parque Nacional Barbilla"+"\n"+"Parque Nacional Braulio Carrillo"
        +"\n"+"Playa Punta Uva");
    }

    // Método para mostrar lugares a visitar en la provincia de Puntarenas
    public void MPuntarenas(){
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Corcovado"+"\n"+
        "Parque Nacional Manuel Antonio"+"\n"+"Parque Nacional Isla San Lucas"+"\n"+"Parque Nacional Marino Ballena"
        +"\n"+"Parque Nacional Carara");
    }

    // Método para mostrar lugares a visitar en la provincia de Alajuela
    public void MAlajuela(){
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Volcán Arenal"+"\n"+
        "Parque Nacional Rincón de la Vieja"+"\n"+"Parque Nacional Volcán Tenorio"+"\n"+"Parque Nacional Juan Castro Blanco"
        +"\n"+"Parque Nacional Volcán Poás");
    }

    // Método para mostrar lugares a visitar en la provincia de Heredia
    public void MHeredia(){
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "El Arca Jardín Botánico"+"\n"+
        "Estación Biológica La Selva"+"\n"+"Pirella Ecological Garden"+"\n"+"Tirimbina Biological Reserve"
        +"\n"+"Bosque La Hoja");
    }

    // Método para mostrar lugares a visitar en la provincia de San José
    public void MSan_José(){
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Los Quetzales"+"\n"+
        "Parque La Sabana"+"\n"+"Parque Nacional Braulio Carrillo"+"\n"+"Monte Sky"
        +"\n"+"Laguna Don Manuel");
    }

    // Método para mostrar lugares a visitar en la provincia de Cartago
    public void MCartago(){
        JOptionPane.showMessageDialog(null,Nombre+"\n"+"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Volcán Irazú"+"\n"+
        "Parque Nacional Tapantí Macizo de la Muerte"+"\n"+"Parque Nacional Volcán Turrialba"+"\n"+"Guayabo National Monument"
        +"\n"+"Parque Recreativo Lankester");
    }
}