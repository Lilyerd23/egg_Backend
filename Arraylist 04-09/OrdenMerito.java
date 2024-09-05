import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class OrdenMerito {
  public static ArrayList<Integer> listaNotas = new ArrayList<>();
  public static Scanner sc = new Scanner(System.in);
  public static Integer nota;
  public static String opcion;

  public static void main(String[] args) {
    do {

      SolicitarNotas();
      System.out.print("¿Desea agregar otro número? (s/n): ");
      opcion = sc.next();

    } while (opcion.equalsIgnoreCase("s"));

    // Ordenar la lista en orden ascendente
    Collections.sort(listaNotas);
    // Imprimir la lista en orden ascendente
    System.out.println("Lista en orden ascendente: " + listaNotas);
    // Ordenar la lista en orden descendente
    Collections.reverse(listaNotas);

    // Imprimir la lista en orden descendente
    System.out.println("Lista en orden descendente: " + listaNotas);

    // Cerrar el scanner
    sc.close();
  }

  public static void SolicitarNotas() {
    try {
      System.out.print("\nIngresa una nota entre el 1 al 10 -> ");
      nota = sc.nextInt();
      if (nota >= 1 && nota <= 10) {
        listaNotas.add(nota);

      } else {
        System.out.println("Número fuera de rango. Debe estar entre 1 y 10.");
      }
    } catch (Exception e) {
      System.out.println("Ingrese un numero entero");
    }
  }
}
