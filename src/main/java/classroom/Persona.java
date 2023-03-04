package classroom;

public class Persona {

    static long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        cedula = 3;
    }

    public Persona(long cedula, String nombre) {
        this.personas.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.personas.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.personas.cedula = cedula;
        totalPersonas++;
    }

    public Persona(String nombre) {
        this.nombre =nombre;
        totalPersonas++;
    }
    
    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
