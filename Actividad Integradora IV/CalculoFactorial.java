import java.util.Scanner;

public class CalculoFactorial {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero, factorial = 1, contador = 0;

    System.out.print("Ingrese el numero a calcular su factorial=> ");
    try {
      numero = teclado.nextInt();
      do {
        contador++;
        factorial = contador * factorial;
      } while (contador < numero);
      System.out.println("El factorial de " + numero + " es: " + factorial);

    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
    teclado.close();
  }
}
