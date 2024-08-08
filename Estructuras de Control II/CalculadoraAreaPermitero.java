import java.util.Scanner;

public class CalculadoraAreaPermitero {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    // int opcion;
    double base, altura, area, perimetro;
    System.out.println("Seleccione una opcion (1y 2) ");
    System.out.println("Opción 1: Circulo ");
    System.out.println("Opción 2: Rectangulo ");
    int opcion = teclado.nextInt();

    switch (opcion) {
      case 1:
        System.out.println("Ingrese el radio del círculo");
        double radio = teclado.nextDouble();
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio;
        System.out.println("Deseas saber el área o perimetro del circulo? ");
        System.out.println("1. Area ");
        System.out.println("2. Perimetro ");
        int opcion2 = teclado.nextInt();
        switch (opcion2) {
          case 1:
            System.out.println("El area del círculo es " + area);
            break;
          case 2:
            System.out.println("El perímetro del círculo es " + perimetro);
            break;
          default:
            System.out.println("Opcion no valida");
            break;
        }
        break;
      case 2:
        System.out.println("Ingrese la base del rectángulo");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura del rectángulo");
        altura = teclado.nextDouble();
        area = altura * base;
        perimetro = (altura + base) * 2;
        System.out.println("Deseas saber el área o perimetro del rectángulo? ");
        System.out.println("1. Area ");
        System.out.println("2. Perimetro ");
        opcion2 = teclado.nextInt();
        switch (opcion2) {
          case 1:
            System.out.println("El area del rectángulo es " + area);
            break;
          case 2:
            System.out.println("El perímetro del rectángulo es " + perimetro);
            break;
          default:
            System.out.println("Opcion no valida");
            break;
        }
        break;
      default:
        System.out.println("Opcion no valida");
        break;
    }
    teclado.close();
  }
}
