package modelos;

public class Rectangulo {
  private double ancho;
  private double alto;

  public Rectangulo(double ancho, double alto) {
    this.ancho = ancho;
    this.alto = alto;
  }

  public Rectangulo() {
  }

  public double getAncho() {
    return ancho;
  }

  public void setAncho(double ancho) {
    this.ancho = ancho;
  }

  public double getAlto() {
    return alto;
  }

  public void setAlto(double alto) {
    this.alto = alto;
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
