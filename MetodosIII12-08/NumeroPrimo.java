import java.util.Scanner;

public class NumeroPrimo {
  public static Scanner teclado = new Scanner(System.in);
  public static int num;

  public static void main(String[] args) {
    esPrimo();
  }

  public static boolean esPrimo() {
    boolean esPrimo = true;
    System.out.print("Ingrese un número: ");
    num = teclado.nextInt();

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        esPrimo = false;
      }
    }
    if (num == 0 || esPrimo) {
      return true;
    }

    return esPrimo();
  }
}
