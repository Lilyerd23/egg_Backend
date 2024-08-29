import java.util.Scanner;

public class CalculadoraII {

  public static Scanner teclado = new Scanner(System.in);
  public static double numero1, numero2, resultado;
  public static int opcion;
  public static String respuesta;

  public static void main(String[] args) {
    System.out.println("---------- Calculadora básica -----------");
    System.out.print("Ingresa el primer numero >> ");
    numero1 = teclado.nextDouble();
    System.out.print("Ingresa otro numero >> ");
    numero2 = teclado.nextDouble();
    menu();
  }

  public static void menu() {
    do {

      System.out.println();
      System.out.println("---------- OPERACIONES ---------- ");
      System.out.println("Ingresa el numero de la operacion a realizar");
      System.out.println("1. Suma");
      System.out.println("2. Resta");
      System.out.println("3. Multiplicacion");
      System.out.println("4. Division");
      System.out.println("5. Salir");
      System.out.println();
      System.out.print("OPCION N° ");
      opcion = teclado.nextInt();

      switch (opcion) {
        case 1:
          resultado = numero1 + numero2;
          // System.out.println("El resultado de la suma es " + resultado);
          break;
        case 2:
          resultado = numero1 - numero2;
          // System.out.println("El resultado de la resta es " + resultado);
          break;
        case 3:
          resultado = numero1 * numero2;
          // System.out.println("El resultado de la multiplicacion es " + resultado);
          break;
        case 4:
          resultado = numero1 / numero2;
          // System.out.println("El resultado de la division es " + resultado);
          break;
        case 5:
          System.out.println("Salió exitosamente...");
          teclado.close();
          break;
        default:
          System.out.println("No existe esa opcion");
          break;
      }

      if (opcion < 5 && opcion > 0) {
        respuesta = Double.isNaN(resultado) ? "No es posible"
            : ("El resultado es " +
                resultado);
        System.out.println(respuesta);
      }

    } while (opcion != 5 && !Double.isNaN(resultado));
  }
}