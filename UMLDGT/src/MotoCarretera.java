import java.time.LocalDate;

public class MotoCarretera extends Vehiculos {
    private int potencia;

    public MotoCarretera(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int potencia) {
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
        return "MotoCarretera{" +
                "matricula=" + getMatricula() +
                ", marca='" + getMarca() + '\'' +
                ", km=" + getKilometragem() +
                ", fechaFabricacion=" + getFechaFabricacion() +
                ", propietarioDNI=" + getPropietarioDNI() +
                ", potencia=" + potencia +
                '}';
    }
}
