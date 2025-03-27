import java.util.ArrayList;

public class OficinaConcreta extends Oficina {
    private ArrayList<Propietario> propietarios;

    public OficinaConcreta(String ciudad, int cp, String direccionOficinas, boolean posibilidadGestionarCob, String empresaLimpieza) {
        super(ciudad, new ArrayList<Vehiculos>(), cp, direccionOficinas, posibilidadGestionarCob, empresaLimpieza);
        this.propietarios = new ArrayList<>();
    }

    public ArrayList<Vehiculos> getVehiculos() {
        // Se asume que la lista de vehiculos se ha inicializado en el constructor de Oficina
        return super.getVehiculos();
    }

    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    // Dar de alta un nuevo propietario
    public void darAltaPropietario(Propietario p) {
        if (buscarPropietarioPorDNI(p.getDni()) == null) {
            propietarios.add(p);
            System.out.println("Propietario agregado: " + p);
        } else {
            System.out.println("El propietario con DNI " + p.getDni() + " ya existe.");
        }
    }

    // Buscar propietario por DNI
    public Propietario buscarPropietarioPorDNI(int dni) {
        for (Propietario p : propietarios) {
            if (p.getDni() == dni) {
                return p;
            }
        }
        return null;
    }

    // Buscar propietarios por apellidos
    public ArrayList<Propietario> buscarPropietarioPorApellidos(String apellidos) {
        ArrayList<Propietario> resultado = new ArrayList<>();
        for (Propietario p : propietarios) {
            if (p.getApellidos().equalsIgnoreCase(apellidos)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Dar de alta un nuevo vehículo
    public void darAltaVehiculo(Vehiculos v) {
        ArrayList<Vehiculos> lista = getVehiculos();
        boolean existe = false;
        for (Vehiculos veh : lista) {
            if (veh.getMatricula() == v.getMatricula()) {
                existe = true;
                break;
            }
        }
        if (!existe) {
            lista.add(v);
            System.out.println("Vehículo agregado: " + v);
        } else {
            System.out.println("El vehículo con matrícula " + v.getMatricula() + " ya existe.");
        }
    }

    // Buscar vehículo por matrícula
    public Vehiculos buscarVehiculoPorMatricula(int matricula) {
        for (Vehiculos v : getVehiculos()) {
            if (v.getMatricula() == matricula) {
                return v;
            }
        }
        return null;
    }
}

