import java.time.LocalDate;

public class MotoAgua extends Vehiculos {
    private int potencia;

    public MotoAgua(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int potencia) {
        super();
        this.matricula = matricula;
        this.marca = marca;
        this.kilometragem = kilometragem;
        this.fechaFabricacion = fechaFabricacion;
        this.propietarioDNI = propietarioDNI;
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "MotoAgua{" +
                "matricula=" + matricula +
                ", marca='" + marca + '\'' +
                ", kilometragem=" + kilometragem +
                ", fechaFabricacion=" + fechaFabricacion +
                ", propietarioDNI=" + propietarioDNI +
                ", potencia=" + potencia +
                '}';
    }
}
