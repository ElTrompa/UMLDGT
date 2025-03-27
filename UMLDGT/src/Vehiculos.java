import java.time.LocalDate;
import java.time.Period;

public class Vehiculos extends Oficina {
    protected String marca;
    protected int matricula;
    protected int kilometragem;
    protected LocalDate fechaFabricacion;
    protected int propietarioDNI;

    public int getEdad() {
        return Period.between(fechaFabricacion, LocalDate.now()).getYears();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public int getPropietarioDNI() {
        return propietarioDNI;
    }

    public void setPropietarioDNI(int propietarioDNI) {
        this.propietarioDNI = propietarioDNI;
    }

    @Override
    public String toString() {
        return "Vehiculos{" +
                "matricula=" + matricula +
                ", marca='" + marca + '\'' +
                ", kilometragem=" + kilometragem +
                ", fechaFabricacion=" + fechaFabricacion +
                ", propietarioDNI=" + propietarioDNI +
                '}';
    }
}