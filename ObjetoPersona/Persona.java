package ObjetoPersona;

// Esta clase representa una persona con un nombre y un número de cédula
public class Persona {
    // El nombre de la persona
    protected String Nombre;
    // El número de cédula de la persona
    protected int Cedula;

    // Este constructor inicializa el nombre y el número de cédula de la persona
    public Persona(String nombre, int cedula) {
        this.Nombre = nombre;
        this.Cedula = cedula;
    }

    // Este método devuelve el nombre de la persona
    public String getNombre() {
        return Nombre;
    }

    // Este método establece el nombre de la persona
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    // Este método devuelve el número de cédula de la persona
    public int getCedula() {
        return Cedula;
    }

    // Este método establece el número de cédula de la persona
    public void setCedula(int cedula) {
        Cedula = cedula;
    }
}
