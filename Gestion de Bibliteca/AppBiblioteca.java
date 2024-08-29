import modelos.Biblioteca;
import modelos.Libro;
import modelos.Persona;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AppBiblioteca {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Biblioteca biblioteca = new Biblioteca();
    Persona persona = new Persona("Lily", "Ramírez"); // Se puede cambiar o agregar más personas
    int opcion = -1;

    // Agregamos algunos libros a la biblioteca
    biblioteca.agregarLibro(new Libro("Cien Años de Soledad", "Gabriel García Márquez", 417));
    biblioteca.agregarLibro(new Libro("1984", "George Orwell", 328));
    biblioteca.agregarLibro(new Libro("El Hobbit", "J.R.R. Tolkien", 310));

    do {
      System.out.println("\n--- Menú Biblioteca ---");
      System.out.println("1. Agregar Libro");
      System.out.println("2. Mostrar Catálogo");
      System.out.println("3. Prestar Libro");
      System.out.println("4. Devolver Libro");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");

      try {
        opcion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        switch (opcion) {
          case 1:
            // Agregar Libro
            System.out.print("Ingrese el título del libro: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el autor del libro: ");
            String autor = scanner.nextLine();
            System.out.print("Ingrese el número de páginas: ");
            int numeroDePaginas = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            Libro libro = new Libro(titulo, autor, numeroDePaginas);
            biblioteca.agregarLibro(libro);
            break;

          case 2:
            // Mostrar Catálogo
            biblioteca.mostrarCatalogo();
            break;

          case 3:
            // Prestar Libro
            System.out.print("Ingrese el título del libro que desea prestar: ");
            String tituloPrestar = scanner.nextLine();
            biblioteca.prestarLibro(persona, tituloPrestar);
            break;

          case 4:
            // Devolver Libro
            System.out.print("Ingrese el título del libro que desea devolver: ");
            String tituloDevolver = scanner.nextLine();
            biblioteca.devolverLibro(persona, tituloDevolver);
            break;

          case 5:
            System.out.println("Saliendo del programa.");
            break;

          default:
            System.out.println("Opción no válida. Inténtelo de nuevo.");
            break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada no válida. Por favor, ingrese un número.");
        scanner.nextLine(); // Limpiar el buffer del scanner para evitar bucles infinitos
      }
    } while (opcion != 5);

    scanner.close();
  }
}
