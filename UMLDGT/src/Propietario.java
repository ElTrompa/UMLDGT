public class Propietario {
    private int dni;
    private String nombre;
    private String apellidos;
    private int puntos;

    public Propietario(int dni, String nombre, String apellidos, int puntos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.puntos = puntos;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getPuntos() {
        return puntos;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}