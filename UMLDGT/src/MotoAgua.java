import java.time.LocalDate;

public class MotoAgua extends Vehiculos {
    private int potencia;

    public MotoAgua(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int potencia) {
        super(matricula, marca, kilometragem, fechaFabricacion, propietarioDNI);  // Llamamos al constructor de Vehiculos
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "MotoAgua{" +
                "matricula=" + getMatricula() +
                ", marca='" + getMarca() + '\'' +
                ", km=" + getKilometragem() +
                ", fechaFabricacion=" + getFechaFabricacion() +
                ", propietarioDNI=" + getPropietarioDNI() +
                ", potencia=" + potencia +
                '}';
    }
}
