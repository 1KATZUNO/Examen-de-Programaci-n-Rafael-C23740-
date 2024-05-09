package ObjetoPersona;

public class Visitante extends Persona {
    private String LugarDeseado;
private  int cantidadmiembros;

public Visitante(String nombre, int cedula, String lugarDeseado, int cantidadmiembros) {
    super(nombre, cedula);
    LugarDeseado = lugarDeseado;
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

    
}