import java.time.LocalDate;

/**
 * Clase Coche que representa un vehículo de tipo coche.
 * Hereda de la clase abstracta Vehiculos.
 */
public class Coche extends Vehiculos {
    private int numAsientos;
    private int airbags;

    /**
     * Constructor para crear un objeto Coche.
     *
     * @param matricula       Número de matrícula del coche.
     * @param marca           Marca del coche.
     * @param kilometragem    Kilometraje del coche.
     * @param fechaFabricacion Fecha de fabricación.
     * @param propietarioDNI  DNI del propietario.
     * @param numAsientos     Número de asientos del coche.
     * @param airbags         Número de airbags del coche.
     */
    public Coche(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int numAsientos, int airbags) {
        super(matricula, marca, kilometragem, fechaFabricacion, propietarioDNI);
        this.numAsientos = numAsientos;
        this.airbags = airbags;
    }

    /**
     * Determina si el coche lleva sillita de bebé.
     * En este ejemplo, se asume que un coche con 5 o más asientos tiene sillita.
     *
     * @return true si lleva sillita; false en caso contrario.
     */
    public boolean llevaSillitaBebe() {
        return numAsientos >= 5;
    }

    // Getters y setters
    public int getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }

    public int getAirbags() {
        return airbags;
    }

    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula=" + getMatricula() +
                ", marca='" + getMarca() + '\'' +
                ", km=" + getKilometragem() +
                ", fechaFabricacion=" + getFechaFabricacion() +
                ", propietarioDNI=" + getPropietarioDNI() +
                ", numAsientos=" + numAsientos +
                ", airbags=" + airbags +
                '}';
    }
}
