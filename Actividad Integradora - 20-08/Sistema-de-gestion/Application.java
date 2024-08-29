import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelos.Empleado;

public class Application {
  private static Empleado[] empleados = {
      new Empleado("Juan Pérez", 30, 3000.50, "Ventas"),
      new Empleado("Ana Gómez", 25, 3500.00, "Marketing"),
      new Empleado("Luis Martínez", 40, 4000.75, "IT"),
      new Empleado("María López", 28, 2800.00, "Ventas")
  };

  private static Empleado[] empleadosOriginales = empleados.clone(); // Guarda una copia original

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean salir = false;

    while (!salir) {
      System.out.println("\nSistema de Gestión de Empleados");
      System.out.println("1. Mostrar todos los empleados");
      System.out.println("2. Crear empleado");
      System.out.println("3. Filtrar empleados");
      System.out.println("4. Ordenar empleados");
      System.out.println("5. Incrementar salario");
      System.out.println("6. Limpiar filtros");
      System.out.println("7. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea

      switch (opcion) {
        case 1:
          mostrarEmpleados(empleados);
          break;
        case 2:
          crearEmpleado(scanner);
          break;
        case 3:
          filtrarEmpleados(scanner);
          break;
        case 4:
          ordenarEmpleados(scanner);
          break;
        case 5:
          incrementarSalario(scanner);
          break;
        case 6:
          limpiarFiltros();
          System.out.println("Filtros limpios. Mostrando empleados originales.");
          mostrarEmpleados(empleados);
          break;
        case 7:
          salir = true;
          System.out.println("Saliendo del programa.");
          break;
        default:
          System.out.println("Opción no válida. Inténtelo de nuevo.");
      }
    }
    scanner.close();
  }

  public static void mostrarEmpleados(Empleado[] empleados) {
    // Imprimir encabezado
    System.out.printf("%-5s %-20s %-5s %-10s %-15s%n", "ID", "Nombre", "Edad", "Salario", "Departamento");
    System.out.println("-------------------------------------------------------------");

    // Imprimir cada empleado
    for (int i = 0; i < empleados.length; i++) {
      System.out.printf("%-5d %s%n", i + 1, empleados[i].toString());
    }
  }

  public static void crearEmpleado(Scanner scanner) {
    System.out.print("Ingrese el nombre del nuevo empleado: ");
    String nombre = scanner.nextLine();

    // Verificar si ya existe un empleado con ese nombre
    if (buscarEmpleadoPorNombre(empleados, nombre) != null) {
      System.out.println("Error: Ya existe un empleado con ese nombre.");
      return;
    }

    System.out.print("Ingrese la edad del nuevo empleado: ");
    int edad = scanner.nextInt();
    System.out.print("Ingrese el salario del nuevo empleado: ");
    double salario = scanner.nextDouble();
    scanner.nextLine(); // Consumir el salto de línea
    System.out.print("Ingrese el departamento del nuevo empleado: ");
    String departamento = scanner.nextLine();

    // Crear y agregar el nuevo empleado
    Empleado nuevoEmpleado = new Empleado(nombre, edad, salario, departamento);
    List<Empleado> listaEmpleados = new ArrayList<>(List.of(empleados));
    listaEmpleados.add(nuevoEmpleado);
    empleados = listaEmpleados.toArray(new Empleado[0]);
    empleadosOriginales = empleados.clone();
    System.out.println("Empleado creado exitosamente.");
  }

  public static void filtrarEmpleados(Scanner scanner) {
    System.out.println("Seleccione el atributo para filtrar:");
    System.out.println("1. Nombre");
    System.out.println("2. Edad");
    System.out.println("3. Salario");
    System.out.println("4. Departamento");
    System.out.print("Seleccione una opción: ");
    int filtro = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea

    switch (filtro) {
      case 1:
        System.out.print("Ingrese el nombre para filtrar: ");
        String nombre = scanner.nextLine();
        empleados = filtrarEmpleadosPorNombre(empleados, nombre);
        break;
      case 2:
        System.out.print("Ingrese la edad mínima: ");
        int edadMin = scanner.nextInt();
        System.out.print("Ingrese la edad máxima: ");
        int edadMax = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea
        empleados = filtrarEmpleadosPorEdad(empleados, edadMin, edadMax);
        break;
      case 3:
        System.out.print("Ingrese el salario mínimo: ");
        double salarioMin = scanner.nextDouble();
        System.out.print("Ingrese el salario máximo: ");
        double salarioMax = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea
        empleados = filtrarEmpleadosPorSalario(empleados, salarioMin, salarioMax);
        break;
      case 4:
        System.out.print("Ingrese el departamento para filtrar: ");
        String departamento = scanner.nextLine();
        empleados = filtrarEmpleadosPorDepartamento(empleados, departamento);
        break;
      default:
        System.out.println("Opción no válida. Inténtelo de nuevo.");
    }

    mostrarEmpleados(empleados);
  }

  public static void ordenarEmpleados(Scanner scanner) {
    System.out.println("Seleccione el atributo para ordenar:");
    System.out.println("1. Nombre");
    System.out.println("2. Edad");
    System.out.println("3. Salario");
    System.out.println("4. Departamento");
    System.out.print("Seleccione una opción: ");
    int criterio = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea

    String atributo;
    switch (criterio) {
      case 1:
        atributo = "nombre";
        break;
      case 2:
        atributo = "edad";
        break;
      case 3:
        atributo = "salario";
        break;
      case 4:
        atributo = "departamento";
        break;
      default:
        System.out.println("Opción no válida. Inténtelo de nuevo.");
        return;
    }

    empleados = ordenarEmpleados(empleados, atributo);
    mostrarEmpleados(empleados);
  }

  public static Empleado[] ordenarEmpleados(Empleado[] empleados, String criterio) {
    // Clonar el arreglo para no modificar el original
    Empleado[] empleadosOrdenados = empleados.clone();

    // Algoritmo de Burbuja para ordenar
    for (int i = 0; i < empleadosOrdenados.length - 1; i++) {
      for (int j = 0; j < empleadosOrdenados.length - 1 - i; j++) {
        if (debeIntercambiar(empleadosOrdenados[j], empleadosOrdenados[j + 1], criterio)) {
          Empleado temp = empleadosOrdenados[j];
          empleadosOrdenados[j] = empleadosOrdenados[j + 1];
          empleadosOrdenados[j + 1] = temp;
        }
      }
    }
    return empleadosOrdenados;
  }

  public static void incrementarSalario(Scanner scanner) {
    System.out.print("Ingrese el nombre del empleado al que desea incrementar el salario: ");
    String nombre = scanner.nextLine();
    Empleado empleado = buscarEmpleadoPorNombre(empleados, nombre);

    if (empleado == null) {
      System.out.println("Empleado no encontrado.");
      return;
    }

    System.out.print("Ingrese el porcentaje de aumento: ");
    double porcentaje = scanner.nextDouble();
    scanner.nextLine(); // Consumir el salto de línea

    empleado = incrementarSalario(empleado, porcentaje);
    System.out.println("Salario incrementado exitosamente.");
    mostrarEmpleados(new Empleado[] { empleado });
  }

  public static void limpiarFiltros() {
    empleados = empleadosOriginales.clone(); // Restaurar el arreglo original
  }

  // Métodos auxiliares
  public static Empleado buscarEmpleadoPorNombre(Empleado[] empleados, String nombre) {
    for (Empleado empleado : empleados) {
      if (empleado.getNombre().equalsIgnoreCase(nombre)) {
        return empleado;
      }
    }
    return null; // Retorna null si no se encuentra el empleado
  }

  public static Empleado[] filtrarEmpleadosPorNombre(Empleado[] empleados, String nombre) {
    List<Empleado> filtrados = new ArrayList<>();
    for (Empleado empleado : empleados) {
      if (empleado.getNombre().equalsIgnoreCase(nombre)) {
        filtrados.add(empleado);
      }
    }
    return filtrados.toArray(new Empleado[0]);
  }

  public static Empleado[] filtrarEmpleadosPorDepartamento(Empleado[] empleados, String departamento) {
    List<Empleado> filtrados = new ArrayList<>();
    for (Empleado empleado : empleados) {
      if (empleado.getDepartamento().equalsIgnoreCase(departamento)) {
        filtrados.add(empleado);
      }
    }
    return filtrados.toArray(new Empleado[0]);
  }

  public static Empleado[] filtrarEmpleadosPorEdad(Empleado[] empleados, int edadMin, int edadMax) {
    List<Empleado> filtrados = new ArrayList<>();
    for (Empleado empleado : empleados) {
      if (empleado.getEdad() >= edadMin && empleado.getEdad() <= edadMax) {
        filtrados.add(empleado);
      }
    }
    return filtrados.toArray(new Empleado[0]);
  }

  public static Empleado[] filtrarEmpleadosPorSalario(Empleado[] empleados, double salarioMin, double salarioMax) {
    List<Empleado> filtrados = new ArrayList<>();
    for (Empleado empleado : empleados) {
      if (empleado.getSalario() >= salarioMin && empleado.getSalario() <= salarioMax) {
        filtrados.add(empleado);
      }
    }
    return filtrados.toArray(new Empleado[0]);
  }

  private static boolean debeIntercambiar(Empleado e1, Empleado e2, String criterio) {
    switch (criterio) {
      case "nombre":
        return e1.getNombre().compareToIgnoreCase(e2.getNombre()) > 0;
      case "edad":
        return e1.getEdad() > e2.getEdad();
      case "salario":
        return e1.getSalario() > e2.getSalario();
      case "departamento":
        return e1.getDepartamento().compareToIgnoreCase(e2.getDepartamento()) > 0;
      default:
        System.out.println("Criterio de ordenación no válido.");
        return false;
    }
  }

  public static Empleado incrementarSalario(Empleado empleado, double porcentaje) {
    double salarioActual = empleado.getSalario();
    double aumento = salarioActual * (porcentaje / 100);
    empleado.setSalario(salarioActual + aumento);
    return empleado; // Retorna el objeto empleado con el salario actualizado
  }

}
