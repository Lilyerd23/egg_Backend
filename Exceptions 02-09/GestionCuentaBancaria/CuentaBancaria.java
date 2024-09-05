package GestionCuentaBancaria;

public class CuentaBancaria {
  private double saldo;

  // Constructor que inicializa el saldo
  public CuentaBancaria(double saldoInicial) {
    if (saldoInicial < 0) {
      throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
    }
    this.saldo = saldoInicial;
  }

  // Método para retirar dinero
  public void retirar(double cantidad) throws SaldoInsuficienteException {
    if (cantidad > saldo) {
      throw new SaldoInsuficienteException("Saldo insuficiente para completar el retiro.");
    }
    saldo -= cantidad;
  }

  // Método para obtener el saldo actual
  public double obtenerSaldo() {
    return saldo;
  }
}
