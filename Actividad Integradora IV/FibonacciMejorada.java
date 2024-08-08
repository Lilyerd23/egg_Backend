import java.util.Scanner;

public class FibonacciMejorada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int posicion, numPrevio = 0, nextNum = 1;

    System.out.print("INGRESA LA POSICION PARA CALCULAR LA SERIE FIBONCACI => ");
    posicion = scanner.nextInt();
    scanner.close();
    int i = 0;
    while (i <= posicion) {
      System.out.print(numPrevio + " ");
      int suma = numPrevio + nextNum;
      numPrevio = nextNum;
      nextNum = suma;
      i++;
    }
  }
}
