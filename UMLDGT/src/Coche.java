import java.time.LocalDate;  // Importar LocalDate

public class Coche extends Vehiculos {
    private int numAsientos;
    private int airbags;

    public Coche(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int numAsientos, int airbags) {
        super(matricula, marca, kilometragem, fechaFabricacion, propietarioDNI);
        this.numAsientos = numAsientos;
        this.airbags = airbags;
    }

    public boolean llevaSillitaBebe() {
        return numAsientos >= 5;  // Suponemos que los coches con 5 o más asientos tienen sillita de bebé.
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
