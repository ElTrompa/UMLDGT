import java.time.LocalDate;

/**
 * Clase MotoAgua que representa una moto de agua.
 * Hereda de la clase abstracta Vehiculos.
 */
public class MotoAgua extends Vehiculos {
    private int potencia;

    /**
     * Constructor para crear una MotoAgua.
     *
     * @param matricula       Número de matrícula.
     * @param marca           Marca de la moto.
     * @param kilometragem    Kilometraje.
     * @param fechaFabricacion Fecha de fabricación.
     * @param propietarioDNI  DNI del propietario.
     * @param potencia        Potencia de la moto.
     */
    public MotoAgua(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int potencia) {
        super(matricula, marca, kilometragem, fechaFabricacion, propietarioDNI);
        this.potencia = potencia;
    }

    // Getters y setters
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
