import java.util.ArrayList;

public abstract class Oficina {
    private String ciudad;
    private ArrayList vehiculos;
    private int cp;
    private String direccionOficinas;
    private boolean posibilidadGestionarCob;
    private String empresaLimpieza;

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public ArrayList getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(ArrayList vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public String getDireccionOficinas() {
        return direccionOficinas;
    }

    public void setDireccionOficinas(String direccionOficinas) {
        this.direccionOficinas = direccionOficinas;
    }

    public boolean isPosibilidadGestionarCob() {
        return posibilidadGestionarCob;
    }

    public void setPosibilidadGestionarCob(boolean posibilidadGestionarCob) {
        this.posibilidadGestionarCob = posibilidadGestionarCob;
    }

    public String getEmpresaLimpieza() {
        return empresaLimpieza;
    }

    public void setEmpresaLimpieza(String empresaLimpieza) {
        this.empresaLimpieza = empresaLimpieza;
    }

    public Oficina() {
    }

    public Oficina(String ciudad, ArrayList vehiculos, int cp, String direccionOficinas, boolean posibilidadGestionarCob, String empresaLimpieza) {
        this.ciudad = ciudad;
        this.vehiculos = vehiculos;
        this.cp = cp;
        this.direccionOficinas = direccionOficinas;
        this.posibilidadGestionarCob = posibilidadGestionarCob;
        this.empresaLimpieza = empresaLimpieza;
    }
}
