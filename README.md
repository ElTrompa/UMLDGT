# 🚗🚦 Sistema de Gestión de Tráfico

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![OOP](https://img.shields.io/badge/OOP-Encapsulation,Inheritance,Polymorphism-blue?style=for-the-badge)

Este proyecto es un sistema de gestión de tráfico que permite administrar oficinas, vehículos y propietarios.

## 📌 Descripción
El sistema permite:
- 📍 Registrar y gestionar oficinas.
- 🚗 Almacenar información de vehículos (coches y motos).
- 🏍️ Diferenciar entre motos de carretera y motos de agua.
- 👨‍💼 Gestionar propietarios de vehículos.
- 🔎 Buscar propietarios por DNI y apellido.
- 🔍 Buscar vehículos por matrícula.
- 📅 Calcular la edad de los vehículos.
- 👶 Determinar si un coche lleva sillita de bebé.

---

## 🏛️ **Diagrama UML**

```mermaid
tclassDiagram
    class Oficina {
        - String ciudad
        - int cp
        - String direccionOficinas
        - boolean posibilidadGestionarCob
        - String empresaLimpieza
        - ArrayList<Vehiculos> vehiculos
    }

    class Vehiculos {
        - String marca
        - int matricula
        - int kilometragem
        - LocalDate fechaFabricacion
        - int propietarioDNI
        + int getEdad()
    }

    class Coche {
        - int numAsientos
        - boolean airbags
        + boolean llevaSillita()
    }

    class MotoCarretera {
        - int potencia
    }

    class MotoAgua {
        - int potencia
    }

    class Propietario {
        - int dni
        - String nombre
        - String apellidos
        - int puntos
    }

    Oficina "1" -- "*" Vehiculos
    Vehiculos <|-- Coche
    Vehiculos <|-- MotoCarretera
    Vehiculos <|-- MotoAgua
    Vehiculos "1" -- "1" Propietario
```

---

## 📝 **Código Fuente**

### 📌 `Oficina.java`
```java
import java.util.ArrayList;

public abstract class Oficina {
    private String ciudad;
    private ArrayList<Vehiculos> vehiculos;
    private int cp;
    private String direccionOficinas;
    private boolean posibilidadGestionarCob;
    private String empresaLimpieza;
    
    // Getters y Setters
}
```

### 📌 `Vehiculos.java`
```java
import java.time.LocalDate;
import java.time.Period;

public class Vehiculos extends Oficina {
    private String marca;
    private int matricula;
    private int kilometragem;
    private LocalDate fechaFabricacion;
    private int propietarioDNI;
    
    public int getEdad() {
        return Period.between(fechaFabricacion, LocalDate.now()).getYears();
    }
    
    // Getters y Setters
}
```

### 📌 `Coche.java`
```java
public class Coche extends Vehiculos {
    private int numAsientos;
    private boolean airbags;
    
    public boolean llevaSillita() {
        return numAsientos > 4;
    }
    
    // Getters y Setters
}
```

### 📌 `MotoCarretera.java`
```java
public class MotoCarretera extends Vehiculos {
    private int potencia;
    
    public int getPotencia() {
        return potencia;
    }
}
```

### 📌 `MotoAgua.java`
```java
public class MotoAgua extends Vehiculos {
    private int potencia;
    
    public int getPotencia() {
        return potencia;
    }
}
```

### 📌 `Propietario.java`
```java
public class Propietario {
    private int dni;
    private String nombre;
    private String apellidos;
    private int puntos;
    
    // Getters y Setters
}
```

### 📌 `Main.java`
```java
public class Main {
    public static void main(String[] args) {
        System.out.println("🚗 Sistema de Gestión de Tráfico Iniciado");
    }
}
```

---

## 🚀 **Cómo Ejecutar**
1. Clona el repositorio:  
   ```bash
   git clone https://github.com/tuusuario/sistema-trafico.git
   ```
2. Compila los archivos:
   ```bash
   javac Main.java
   ```
3. Ejecuta el programa:
   ```bash
   java Main
   ```
