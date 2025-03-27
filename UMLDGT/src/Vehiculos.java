import java.time.LocalDate;

public abstract class Vehiculos {
    private int matricula;
    private String marca;
    private int kilometragem;
    private LocalDate fechaFabricacion;
    private int propietarioDNI;

    // Constructor que acepta los parámetros necesarios
    public Vehiculos(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI) {
        this.matricula = matricula;
        this.marca = marca;
        this.kilometragem = kilometragem;
        this.fechaFabricacion = fechaFabricacion;
        this.propietarioDNI = propietarioDNI;
    }

    // Getters y setters
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public LocalDate getFechaFabricacion() {
        return fechaFabricacion;
    }

    public void setFechaFabricacion(LocalDate fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
    }

    public int getPropietarioDNI() {
        return propietarioDNI;
    }

    public void setPropietarioDNI(int propietarioDNI) {
        this.propietarioDNI = propietarioDNI;
    }

    public int getEdad() {
        return java.time.Period.between(fechaFabricacion, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula=" + matricula +
                ", marca='" + marca + '\'' +
                ", km=" + kilometragem +
                ", fechaFabricacion=" + fechaFabricacion +
                ", propietarioDNI=" + propietarioDNI +
                '}';
    }
}
