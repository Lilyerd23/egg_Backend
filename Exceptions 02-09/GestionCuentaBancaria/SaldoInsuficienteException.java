package GestionCuentaBancaria;

public class SaldoInsuficienteException extends Exception {
  // Constructor que recibe un mensaje de error personalizado
  public SaldoInsuficienteException(String mensaje) {
    super(mensaje);
  }
}
