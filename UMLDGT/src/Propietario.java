public class Propietario {
    private String nombre;
    private String apellidos;
    private int dni;
    private int numPuntos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getNumPuntos() {
        return numPuntos;
    }

    public void setNumPuntos(int numPuntos) {
        this.numPuntos = numPuntos;
    }

    public String toString() {
        return "Propietario{" +
                "dni='" + dni + ' ' +
                ", nombre='" + nombre + ' ' +
                ", apellidos='" + apellidos + ' ' +
                ", puntos=" + numPuntos +
                '}';
    }
}
