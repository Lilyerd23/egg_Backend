import java.util.Scanner;

public class SaludarPersonas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      // Llamar al método que solicita el nombre y lo saluda
      String nombre = obtenerNombre(scanner);
      System.out.println("¡Hola, " + nombre + "!");
    } catch (Exception e) {
      // Manejar excepciones que puedan ocurrir durante la obtención del nombre
      System.out.println(e.getMessage());
    } finally {
      // Cerrar el Scanner para liberar recursos
      scanner.close();
    }
  }

  public static String obtenerNombre(Scanner scanner) throws Exception {
    String nombre;
    while (true) {
      System.out.print("Por favor, ingresa tu nombre (al menos 2 caracteres): ");
      nombre = scanner.nextLine();

      if (nombre.length() < 2) {
        // Lanzar una excepción si el nombre tiene menos de 2 caracteres
        throw new Exception("El nombre debe tener al menos 2 caracteres.");
      }
      return nombre;
    }
  }
}
