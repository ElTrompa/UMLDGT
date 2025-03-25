import java.util.Date;

public class Vehiculos extends Oficina{
    private String marca;
    private int matricula;
    private int kilometragem;
    private Date fechaFabricacion;
    private int propietarioDNI;

    public int getPropietarioDNI() {
        return propietarioDNI;
    }

    public Date getFechaFabricacion() {
        return fechaFabricacion;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }


}
