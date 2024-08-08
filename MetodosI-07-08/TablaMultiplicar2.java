import java.util.Scanner;

public class TablaMultiplicar2 {
  public static Scanner sc = new Scanner(System.in);
  public static int[] numeros = new int[3];

  public static void main(String[] args) {
    imprimirTablasMultiplicar(pedirNumeros());
  }

  public static int[] pedirNumeros() {
    for (int i = 0; i < 3; i++) {
      System.out.print("Ingresa el número " + (i + 1) + ": ");
      numeros[i] = sc.nextInt();
    }
    return numeros;
  }

  public static void imprimirTablasMultiplicar(int[] numeros) {
    for (int i = 0; i < 3; i++) {
      System.out.println();
      System.out.println("------ Tabla del número " + numeros[i] + "----------");
      for (int j = 1; j <= 10; j++) {
        System.out.println(numeros[i] + " x " + j + " = " + (numeros[i] * j));
      }
    }
  }
}
