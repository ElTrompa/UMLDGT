import java.util.ArrayList;

/**
 * Clase OficinaConcreta que extiende de la clase abstracta Oficina.
 * Además de la información de la oficina, gestiona una lista de propietarios.
 */
public class OficinaConcreta extends Oficina {
    private ArrayList<Propietario> propietarios;

    /**
     * Constructor que crea una OficinaConcreta con los datos indicados.
     * Se inicializa la lista de vehículos y la de propietarios.
     *
     * @param ciudad                 Ciudad de la oficina.
     * @param cp                     Código postal.
     * @param direccionOficinas      Dirección de la oficina.
     * @param posibilidadGestionarCob Indica si puede gestionar cobros.
     * @param empresaLimpieza        Empresa de limpieza asociada.
     */
    public OficinaConcreta(String ciudad, int cp, String direccionOficinas, boolean posibilidadGestionarCob, String empresaLimpieza) {
        super(ciudad, new ArrayList<Vehiculos>(), cp, direccionOficinas, posibilidadGestionarCob, empresaLimpieza);
        this.propietarios = new ArrayList<>();
    }

    /**
     * Devuelve la lista de vehículos registrados en la oficina.
     *
     * @return Lista de vehículos.
     */
    public ArrayList<Vehiculos> getVehiculos() {
        return super.getVehiculos();
    }

    /**
     * Devuelve la lista de propietarios de la oficina.
     *
     * @return Lista de propietarios.
     */
    public ArrayList<Propietario> getPropietarios() {
        return propietarios;
    }

    /**
     * Da de alta un nuevo propietario en la oficina si no existe ya.
     *
     * @param p Propietario a agregar.
     */
    public void darAltaPropietario(Propietario p) {
        if (buscarPropietarioPorDNI(p.getDni()) == null) {
            propietarios.add(p);
            System.out.println("Propietario agregado: " + p);
        } else {
            System.out.println("El propietario con DNI " + p.getDni() + " ya existe.");
        }
    }

    /**
     * Busca un propietario en la oficina a partir de su DNI.
     *
     * @param dni DNI del propietario.
     * @return Propietario encontrado o null si no se encuentra.
     */
    public Propietario buscarPropietarioPorDNI(int dni) {
        for (Propietario p : propietarios) {
            if (p.getDni() == dni) {
                return p;
            }
        }
        return null;
    }

    /**
     * Busca propietarios en la oficina por sus apellidos.
     *
     * @param apellidos Apellidos a buscar.
     * @return Lista de propietarios que coinciden.
     */
    public ArrayList<Propietario> buscarPropietarioPorApellidos(String apellidos) {
        ArrayList<Propietario> resultado = new ArrayList<>();
        for (Propietario p : propietarios) {
            if (p.getApellidos().equalsIgnoreCase(apellidos)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    /**
     * Da de alta un nuevo vehículo en la oficina si no existe ya.
     *
     * @param v Vehículo a agregar.
     */
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

    /**
     * Busca un vehículo en la oficina a partir de su matrícula.
     *
     * @param matricula Matrícula del vehículo.
     * @return Vehículo encontrado o null si no se encuentra.
     */
    public Vehiculos buscarVehiculoPorMatricula(int matricula) {
        for (Vehiculos v : getVehiculos()) {
            if (v.getMatricula() == matricula) {
                return v;
            }
        }
        return null;
    }
}
