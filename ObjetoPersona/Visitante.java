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
      JOptionPane.showMessageDialog(null,"Lugares a visitar en: "+LugarDeseado+"\n"+" "+"\n"+ "Parque nacional Santa Rosa"+"\n"+
      "Parque Nacional Guanacaste"+"\n"+"Parque Nacional Guanacaste"+"\n"+"Estación Experimental Forestal Horizontes"
      +"\n"+"Refugio de Vida Silvestre Bahía Junquillal.");
  
    }
}