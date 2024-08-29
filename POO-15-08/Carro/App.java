package Carro;

public class App {
  public static void main(String[] args) {
    Auto auto = new Auto("Tesla", "Y", 2024);
    Auto auto2 = new Auto("Toyota", "Corolla");
    Auto auto3 = new Auto("Chevrolet", "Montana", 2020);
    Auto auto4 = new Auto("Mercedes");
    Auto auto5 = new Auto();

    auto.imprimirDatos();
    auto2.imprimirDatos();
    auto3.imprimirDatos();
    auto4.imprimirDatos();
    auto5.imprimirDatos();

  }
}
