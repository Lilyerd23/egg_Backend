package Rectangulo;

public class Rectangulo {
  double ancho;
  double alto;
  static int contadorRectangulos = 0;

  public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
    contadorRectangulos++;
  }

  public double area() {
    return this.ancho * this.alto;
  }

  public double perimetro() {
    return 2 * (this.ancho + this.alto);
  }

  public void imprimirArea() {
    System.out.println("El area del rectangulo es " + area());
  }

  public void imprimirPerimetro() {
    System.out.println("El perimetro del rectangulo es " + perimetro());
  }
}
