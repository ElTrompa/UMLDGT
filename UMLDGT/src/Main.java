import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Propietario> propietarios = new ArrayList<>();
    private static ArrayList<Vehiculos> vehiculos = new ArrayList<>();
    private static ArrayList<Oficina> oficinas = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n🔹 Menú Principal 🔹");
            System.out.println("1️⃣ Registrar oficina");
            System.out.println("2️⃣ Registrar propietario");
            System.out.println("3️⃣ Registrar vehículo");
            System.out.println("4️⃣ Buscar propietario por DNI");
            System.out.println("5️⃣ Buscar vehículo por matrícula");
            System.out.println("6️⃣ Calcular edad de un vehículo");
            System.out.println("7️⃣ Verificar si un coche lleva sillita de bebé");
            System.out.println("0️⃣ Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar buffer

            switch (opcion) {
                case 1 -> registrarOficina();
                case 2 -> registrarPropietario();
                case 3 -> registrarVehiculo();
                case 4 -> buscarPropietario();
                case 5 -> buscarVehiculo();
                case 6 -> calcularEdadVehiculo();
                case 7 -> verificarSillita();
                case 0 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("❌ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    private static void registrarOficina() {
        System.out.print("Ingrese la ciudad de la oficina: ");
        String ciudad = scanner.nextLine();
        System.out.print("Ingrese el código postal: ");
        int cp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("¿Puede gestionar cobros? (true/false): ");
        boolean gestionarCobros = scanner.nextBoolean();
        scanner.nextLine();
        System.out.print("Ingrese la empresa de limpieza: ");
        String empresaLimpieza = scanner.nextLine();

        // Usamos la clase concreta en lugar de la abstracta
        OficinaConcreta oficina = new OficinaConcreta(ciudad, cp, direccion, gestionarCobros, empresaLimpieza);
        oficinas.add(oficina);
        System.out.println("✅ Oficina registrada con éxito.");
    }

    private static void registrarPropietario() {
        System.out.print("Ingrese DNI del propietario: ");
        int dni = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellidos: ");
        String apellidos = scanner.nextLine();
        System.out.print("Ingrese puntos del carnet: ");
        int puntos = scanner.nextInt();

        Propietario propietario = new Propietario(dni, nombre, apellidos, puntos);
        propietarios.add(propietario);
        System.out.println("✅ Propietario registrado correctamente.");
    }

    private static void registrarVehiculo() {
        System.out.println("Selecciona el tipo de vehículo:");
        System.out.println("1️⃣ Coche");
        System.out.println("2️⃣ Moto de carretera");
        System.out.println("3️⃣ Moto de agua");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la marca: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el kilometraje: ");
        int kilometraje = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el año de fabricación: ");
        int anio = scanner.nextInt();
        System.out.print("Ingrese el mes de fabricación: ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el día de fabricación: ");
        int dia = scanner.nextInt();
        scanner.nextLine();
        LocalDate fechaFabricacion = LocalDate.of(anio, mes, dia);

        System.out.print("Ingrese el DNI del propietario: ");
        int dniPropietario = scanner.nextInt();
        scanner.nextLine();

        Vehiculos vehiculo;
        switch (tipo) {
            case 1 -> {
                System.out.print("Ingrese el número de asientos: ");
                int asientos = scanner.nextInt();
                System.out.print("Ingrese el número de airbags: ");
                int airbags = scanner.nextInt();
                vehiculo = new Coche(matricula, marca, kilometraje, fechaFabricacion, dniPropietario, asientos, airbags);
            }
            case 2 -> {
                System.out.print("Ingrese la potencia: ");
                int potencia = scanner.nextInt();
                vehiculo = new MotoCarretera(matricula, marca, kilometraje, fechaFabricacion, dniPropietario, potencia);
            }
            case 3 -> {
                System.out.print("Ingrese la potencia: ");
                int potencia = scanner.nextInt();
                vehiculo = new MotoAgua(matricula, marca, kilometraje, fechaFabricacion, dniPropietario, potencia);
            }
            default -> {
                System.out.println("❌ Opción no válida.");
                return;
            }
        }
        vehiculos.add(vehiculo);
        System.out.println("✅ Vehículo registrado con éxito.");
    }

    private static void buscarPropietario() {
        System.out.print("Ingrese el DNI del propietario a buscar: ");
        int dni = scanner.nextInt();
        scanner.nextLine();
        for (Propietario p : propietarios) {
            if (p.getDni() == dni) {
                System.out.println("Propietario encontrado: " + p);
                return;
            }
        }
        System.out.println("❌ Propietario no encontrado.");
    }

    private static void buscarVehiculo() {
        System.out.print("Ingrese la matrícula del vehículo a buscar: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        for (Vehiculos v : vehiculos) {
            if (v.getMatricula() == matricula) {
                System.out.println("Vehículo encontrado: " + v);
                return;
            }
        }
        System.out.println("❌ Vehículo no encontrado.");
    }

    private static void calcularEdadVehiculo() {
        System.out.print("Ingrese la matrícula del vehículo: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        for (Vehiculos v : vehiculos) {
            if (v.getMatricula() == matricula) {
                System.out.println("La edad del vehículo es: " + v.getEdad() + " años.");
                return;
            }
        }
        System.out.println("❌ Vehículo no encontrado.");
    }

    private static void verificarSillita() {
        System.out.print("Ingrese la matrícula del coche: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();
        for (Vehiculos v : vehiculos) {
            if (v instanceof Coche && v.getMatricula() == matricula) {
                Coche coche = (Coche) v;
                System.out.println("¿El coche lleva sillita de bebé? " + coche.llevaSillitaBebe());
                return;
            }
        }
        System.out.println("❌ No se encontró un coche con esa matrícula.");
    }
}
