import java.time.LocalDate;

public class Coche extends Vehiculos {
    private int numAsientos;
    private int airbags;

    public Coche(int matricula, String marca, int kilometragem, LocalDate fechaFabricacion, int propietarioDNI, int numAsientos, int airbags) {
        super(); // Se llama al constructor por defecto de Vehiculos (y de Oficina)
        this.matricula = matricula;
        this.marca = marca;
        this.kilometragem = kilometragem;
        this.fechaFabricacion = fechaFabricacion;
        this.propietarioDNI = propietarioDNI;
        this.numAsientos = numAsientos;
        this.airbags = airbags;
    }

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
                "matricula=" + matricula +
                ", marca='" + marca + '\'' +
                ", kilometragem=" + kilometragem +
                ", fechaFabricacion=" + fechaFabricacion +
                ", propietarioDNI=" + propietarioDNI +
                ", numAsientos=" + numAsientos +
                ", airbags=" + airbags +
                '}';
    }
}
