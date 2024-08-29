package modelos;

public class Circulo {
  private double radio;

  public Circulo(double radio) {
    this.radio = radio;
  }

  public Circulo() {
  }

  public double getRadio() {
    return radio;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double area() {
    return Math.PI * Math.pow(radio, 2);
  }

  public double perimetro() {
    return 2 * Math.PI * radio;
  }

  public void imprimirArea() {
    System.out.println("El área del círculo es: " + area());
  }

  public void imprimirPerimetro() {
    System.out.println("El perímetro del círculo es: " + perimetro());
  }
}
