import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionConExcepcion {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("----- Division de 2 numeros enteros -----");

    try {
      // Solicitar el numerador y el divisor
      int numerador = obtenerNumerador(scanner);
      int divisor = obtenerNumerador(scanner);

      // Realizar la división
      if (divisor == 0) {
        throw new ArithmeticException("El divisor no puede ser cero.");
      }
      double resultado = (double) numerador / divisor;

      // Mostrar el resultado
      System.out.println("Resultado de la división: " + resultado);

    } catch (InputMismatchException e) {
      System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    } finally {
      scanner.close();
    }
  }

  public static int obtenerNumerador(Scanner scanner) {
    int numero;
    while (true) {
      try {
        System.out.print("Ingrese un número entero (diferente de cero): ");
        numero = scanner.nextInt();

        if (numero == 0) {
          throw new ArithmeticException("El número ingresado no puede ser cero.");
        }
        return numero;

      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
        scanner.next(); // Limpiar el buffer del scanner

      } catch (ArithmeticException e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
