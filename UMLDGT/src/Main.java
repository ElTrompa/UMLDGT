import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear la oficina concreta
        OficinaConcreta oficina = new OficinaConcreta("Madrid", 28001, "Calle Mayor 1", true, "LimpioCorp");

        // Crear propietarios
        Propietario p1 = new Propietario(12345678, "Juan", "Perez", 12);
        Propietario p2 = new Propietario(87654321, "Ana", "Garcia", 8);
        oficina.darAltaPropietario(p1);
        oficina.darAltaPropietario(p2);

        // Crear vehículos
        // Nota: Se utiliza un entero para la matrícula.
        Coche coche1 = new Coche(1111, "Toyota", 50000, LocalDate.of(2015, 5, 20), 12345678, 5, 6);
        MotoAgua motoAgua1 = new MotoAgua(2222, "Yamaha", 20000, LocalDate.of(2018, 3, 15), 87654321, 150);
        MotoCarretera motoCarretera = new MotoCarretera(3333, "Honda", 15000, LocalDate.of(2017, 4, 10), 12345678, 130);

        oficina.darAltaVehiculo(coche1);
        oficina.darAltaVehiculo(motoAgua1);
        oficina.darAltaVehiculo(motoCarretera);

        // Búsqueda de propietario por DNI
        Propietario buscado = oficina.buscarPropietarioPorDNI(12345678);
        System.out.println("Propietario buscado: " + buscado);

        // Búsqueda de vehículo por matrícula
        Vehiculos vehiculoBuscado = oficina.buscarVehiculoPorMatricula(2222);
        System.out.println("Vehículo buscado: " + vehiculoBuscado);

        // Mostrar la edad del coche
        System.out.println("Edad del coche: " + coche1.getEdad() + " años");
    }
}
