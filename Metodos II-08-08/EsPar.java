import java.util.Scanner;

public class EsPar {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {

    Integer numero = null;

    do {
      try {
        numero = solicitarNumero();
      } catch (Exception e) {
        sc.nextLine();
        System.out.println("No ingresó un número, intente nuevamente:");
      }
    } while (numero == null);
    if (esPar(numero)) {
      System.out.println("El " + numero + " es par");
    }
  }

  public static int solicitarNumero() {
    System.out.print("Por favor ingrese un número:");
    return sc.nextInt();
  }

  public static boolean esPar(int numero) {
    return numero % 2 == 0;
  }
}
