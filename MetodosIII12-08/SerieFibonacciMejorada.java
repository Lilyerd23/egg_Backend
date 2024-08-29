import java.util.Scanner;

public class SerieFibonacciMejorada {
  public static int posicion, numPrevio = 0, nextNum = 1;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("INGRESA LA POSICION PARA CALCULAR LA SERIE FIBONCACI => ");
    posicion = scanner.nextInt();
    generarSerie(posicion);
    scanner.close();

  }

  public static int generarSerie(int posicion) {
    System.out.print(numPrevio + " ");
    if (posicion == 0) {
      return 0;
    }

    int suma = numPrevio + nextNum;
    numPrevio = nextNum;
    nextNum = suma;
    return generarSerie(posicion - 1);
  }
}
