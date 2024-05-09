package ObjetoPersona;

import javax.swing.JOptionPane;

public class Visitante extends Persona {
    private String LugarDeseado;
private  int cantidadmiembros;

public Visitante(String nombre, int cedula, String lugarDeseado, int cantidadmiembros) {
    super(nombre, cedula);
    LugarDeseado = lugarDeseado;
    this.LugarDeseado=lugarDeseado;
    this.cantidadmiembros = cantidadmiembros;
  
}

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

    public void MGuanacaste(){
      JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Santa Rosa"+"\n"+
      "Parque Nacional Guanacaste"+"\n"+"Estación Experimental Forestal Horizontes"
      +"\n"+"Refugio de Vida Silvestre Bahía Junquillal.");
  
    }
    public void MLimón(){
        JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Cahuita"+"\n"+
        "Parque Nacional Tortuguero"+"\n"+"Parque Nacional Barbilla"+"\n"+"Parque Nacional Braulio Carrillo"
        +"\n"+"Playa Punta Uva");
    
      }
      public void MPuntarenas(){
        JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Corcovado"+"\n"+
        "Parque Nacional Manuel Antonio"+"\n"+"Parque Nacional Isla San Lucas"+"\n"+"Parque Nacional Marino Ballena"
        +"\n"+"Parque Nacional Carara");
    
      }
      public void MAlajuela(){
        JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Volcán Arenal"+"\n"+
        "Parque Nacional Rincón de la Vieja"+"\n"+"Parque Nacional Volcán Tenorio"+"\n"+"Parque Nacional Juan Castro Blanco"
        +"\n"+"Parque Nacional Volcán Poás");
    
      }
      public void MHeredia(){
        JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "El Arca Jardín Botánico"+"\n"+
        "Estación Biológica La Selva"+"\n"+"Pirella Ecological Garden"+"\n"+"Tirimbina Biological Reserve"
        +"\n"+"Bosque La Hoja");
    
      }
      public void MSan_José(){
        JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Los Quetzales"+"\n"+
        "Parque La Sabana"+"\n"+"Parque Nacional Braulio Carrillo"+"\n"+"Monte Sky"
        +"\n"+"Laguna Don Manuel");
    
      }
      public void MCartago(){
        JOptionPane.showMessageDialog(null,"Lugares a visitar en tu provincia : "+LugarDeseado+"\n"+" "+"\n"+ "Parque Nacional Volcán Irazú"+"\n"+
        "Parque Nacional Tapantí Macizo de la Muerte"+"\n"+"Parque Nacional Volcán Turrialba"+"\n"+"Guayabo National Monument"
        +"\n"+"Jardín Botánico Lankester");
    
      }
      
    
}