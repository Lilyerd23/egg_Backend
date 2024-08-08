import java.util.Scanner;

public class NumeroPrimoPlus {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de números primos que desea generar: ");
    int cantidad = scanner.nextInt();
    scanner.close();
    int[] primos = new int[cantidad];
    int num = 2;
    int indice = 0;

    while (indice < cantidad) {
      boolean esPrimo = true;
      for (int i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
          esPrimo = false;
          break;
        }
      }
      if (esPrimo) {
        primos[indice] = num;
        indice++;
      }
      num++;
    }

    System.out.println("Los " + cantidad + " números primos generados son:");
    for (int i = 0; i < cantidad; i++) {
      System.out.print(primos[i] + " ");
    }
    System.out.println();
  }
}
