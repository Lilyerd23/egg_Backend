import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionLibreria {
  public static void main(String[] args) {
    Libreria libreria = new Libreria();
    Scanner scanner = new Scanner(System.in);
    int opcion;
    do {
      System.out.println("\n--- Menú de Opciones ---");
      System.out.println("1. Agregar libro");
      System.out.println("2. Eliminar libro mediante ISBN");
      System.out.println("3. Mostrar catálogo");
      System.out.println("4. Salir");
      System.out.print("Seleccione una opción: ");

      try {
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        switch (opcion) {
          case 1:
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el número de ISBN del libro: ");
            String isbn = scanner.nextLine();
            Libro libro = new Libro(titulo, autor, isbn);
            libreria.agregarLibro(libro);
            break;

          case 2:
            System.out.print("Ingrese el número de ISBN del libro a eliminar: ");
            String isbnEliminar = scanner.nextLine();
            libreria.eliminarLibro(isbnEliminar);
            break;

          case 3:
            libreria.mostrarCatalogo();
            break;

          case 4:
            System.out.println("Saliendo del programa...");
            break;

          default:
            System.out.println("Opción no válida. Intente nuevamente.");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada no válida. Por favor ingrese un número.");
        scanner.next(); // Limpiar el buffer en caso de entrada inválida
        opcion = 0; // Para continuar en el bucle
      }

    } while (opcion != 4);

    scanner.close();
  }
}
