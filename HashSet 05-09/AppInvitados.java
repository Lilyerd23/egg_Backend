import java.util.Scanner;

public class AppInvitados {
  public static void main(String[] args) {
    RegistroInvitados registro = new RegistroInvitados();
    Scanner scanner = new Scanner(System.in);
    int opcion;

    do {
      System.out.println("\n--- Menú de Opciones ---");
      System.out.println("1. Agregar invitado");
      System.out.println("2. Eliminar invitado");
      System.out.println("3. Mostrar lista de invitados");
      System.out.println("4. Salir");
      System.out.print("Seleccione una opción: ");

      try {
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        switch (opcion) {
          case 1:
            System.out.print("Ingrese el nombre del invitado a agregar: ");
            String nombreAgregar = scanner.nextLine();
            registro.agregarInvitado(nombreAgregar);
            break;
          case 2:
            System.out.print("Ingrese el nombre del invitado a eliminar: ");
            String nombreEliminar = scanner.nextLine();
            registro.eliminarInvitado(nombreEliminar);
            break;
          case 3:
            registro.mostrarInvitado();
            break;
          case 4:
            System.out.println("Saliendo del programa...");
            break;
          default:
            break;
        }
      } catch (Exception e) {
        System.out.println("Entrada no válida. Por favor ingrese un número.");
        scanner.next(); // Limpiar el buffer en caso de entrada inválida
        opcion = 0; // Para continuar en el bucle
      }

    } while (opcion != 4);
    scanner.close();

    /*
     * // Agregar algunos invitados
     * registro.agregarInvitado("Juan Pérez");
     * registro.agregarInvitado("Ana Gómez");
     * registro.agregarInvitado("Luis Fernández");
     * 
     * // Intentar agregar un invitado duplicado
     * registro.agregarInvitado("Ana Gómez");
     * 
     * // Mostrar la lista de invitados
     * registro.mostrarInvitado();
     * 
     * // Eliminar un invitado
     * registro.eliminarInvitado("Juan Pérez");
     * 
     * // Intentar eliminar un invitado que no está en la lista
     * registro.eliminarInvitado("Pedro Martínez");
     * 
     * // Mostrar la lista de invitados nuevamente
     * registro.mostrarInvitado();
     */
  }
}
