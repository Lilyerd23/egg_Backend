import java.util.ArrayList;
import java.util.Scanner;

public class Ciudades {
  public static final Scanner sc = new Scanner(System.in);
  public static ArrayList<String> listaCiudades = new ArrayList<>();
  public static String ciudad;

  public static void main(String[] args) {
    String opcion;
    do {
      agregarCiudad();
      System.out
          .print("Deseas seguir agregando una ciudad? S para continuar -> ");
      opcion = sc.nextLine();
    } while (opcion.equals("S") || opcion.equals("s"));

    mostrarCiudades();
    sc.close(); // Cerrar el scanner para liberar recursos de memoria.

  }

  public static void agregarCiudad() {
    System.out.println("Ingresa el nombre de una ciudad ");
    ciudad = sc.nextLine();
    listaCiudades.add(ciudad);
  }

  public static void mostrarCiudades() {
    System.out.println("---- Lista de ciudades ----");
    for (String ciudad : listaCiudades) {
      System.out.println("> " + ciudad);
    }
  }
}
