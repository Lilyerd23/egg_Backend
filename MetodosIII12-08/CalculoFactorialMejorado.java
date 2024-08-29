import java.util.Scanner;

public class CalculoFactorialMejorado {
  public static Scanner teclado = new Scanner(System.in);
  public static int numero, factorial = 1, contador = 1;

  public static void main(String[] args) {

    System.out.print("Ingrese el numero a calcular su factorial => ");
    try {
      numero = teclado.nextInt();
      factorial(numero);
      System.out.println("El factorial de " + numero + " es: " + factorial);
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
    teclado.close();
  }

  public static int factorial(int numero) {
    if (numero == 0) {
      return 0;
    }
    factorial = numero * factorial;
    return factorial(numero - 1);
  }
}
