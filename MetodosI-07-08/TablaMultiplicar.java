import java.util.Scanner;

public class TablaMultiplicar {
  public static Scanner sc = new Scanner(System.in);
  public static int tamanio = 10;

  public static void main(String[] args) {
    int numero = pedirNumero();
    imprimirTablaMultiplicar(numero);
  }

  public static int pedirNumero() {
    System.out.print("Ingresa un número: ");
    return sc.nextInt();
  }

  public static void imprimirTablaMultiplicar(int numero) {
    for (int i = 1; i <= tamanio; i++) {
      System.out.println(i + " x " + numero + " = " + i * numero);
    }
  }
}
