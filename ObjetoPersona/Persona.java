package ObjetoPersona;

public class Persona {
    private String Nombre;
    private int Cedula;
    public Persona(String nombre, int cedula) {
        this.Nombre = nombre;
        this.Cedula = cedula;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int cedula) {
        Cedula = cedula;
    }

}
