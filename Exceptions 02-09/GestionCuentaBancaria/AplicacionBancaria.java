package GestionCuentaBancaria;

import java.util.Scanner;

public class AplicacionBancaria {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CuentaBancaria cuenta = new CuentaBancaria(1000.00); // Inicializar cuenta con saldo de 1000.00

    try {
      while (true) {
        System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
        System.out.print("Ingrese el monto a retirar (o 'salir' para terminar): ");
        String input = scanner.nextLine();

        // Opción para salir del programa
        if (input.equalsIgnoreCase("salir")) {
          break;
        }

        try {
          double monto = Double.parseDouble(input);
          cuenta.retirar(monto);
          System.out.println("Retiro exitoso. Saldo restante: " + cuenta.obtenerSaldo());
        } catch (NumberFormatException e) {
          System.out.println("Entrada inválida. Por favor, ingrese un número válido.");
        } catch (SaldoInsuficienteException e) {
          System.out.println(e.getMessage());
        }
      }
    } finally {
      scanner.close(); // Asegúrate de cerrar el scanner en el bloque finally
    }
  }
}
