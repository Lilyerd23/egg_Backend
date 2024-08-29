import java.util.Scanner;

import modelos.Circulo;
import modelos.Rectangulo;
import modelos.Triangulo;

public class App {

  public static int opcion, figura;
  public static double base, altura, radio, ancho;
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("----- Cálculo de área y perimetros -----");
    System.out.println("Elige una figura geometrica");
    System.out.println("1. Rectangulo");
    System.out.println("2. Triángulo");
    System.out.println("3. Círculo");
    System.out.print("Figura: ");
    figura = sc.nextInt();
    operacionFiguraElegida();

  }

  public static void operacionFiguraElegida() {
    if (figura == 1) {
      operarRectangulo();
    } else if (figura == 2) {
      operarTriangulo();
    } else if (figura == 3) {
      operarCirculo();
    } else {
      System.out.println("Opcion inválida");
    }
  }

  public static void menu(int opcionFigura) {
    System.out.println("---- Menu de Opciones ----");
    System.out.println("¿Qué desea realizar?,elija una opcion");
    System.out.println("1. Crear Instancia.");
    switch (opcionFigura) {
      case 1:
        System.out.println("2. Obtener el ancho.");
        System.out.println("3. Obtener la altura.");
        System.out.println("4. Calcular Área.");
        System.out.println("5. Calcular perímetro.");
        System.out.println("6. Salir.");
        break;
      case 2:
        System.out.println("2. Obtener la base.");
        System.out.println("3. Obtener la altura.");
        System.out.println("4. Calcular Área.");
        System.out.println("5. Salir.");
        break;
      case 3:
        System.out.println("2. Obtener el radio.");
        System.out.println("3. Calcular Área.");
        System.out.println("4. Calcular perímetro.");
        System.out.println("5. Salir.");
        break;
      default:
        System.out.println("Opción inválida");
        break;
    }

  }

  public static void operarRectangulo() {
    do {
      menu(figura);
      Rectangulo rectangulo = new Rectangulo(ancho, altura);
      if (opcion == 1) {
        System.out.print("Ingresa el Ancho: ");
        ancho = sc.nextDouble();
        System.out.print("Ingresa el Alto:");
        altura = sc.nextDouble();
      }

      if (opcion == 2) {
        System.out.println("Ancho del rectangulo es: " + rectangulo.getAncho());
      }
      if (opcion == 3) {
        System.out.println("La altura del rectánglo es: " + rectangulo.getAlto());
      }
      if (opcion == 4) {
        rectangulo.imprimirArea();
      }
      if (opcion == 5) {
        rectangulo.imprimirPerimetro();
      }
    } while (opcion != 6);
  }

  public static void operarTriangulo() {
    try {
      do {
        menu(figura);
        Triangulo triangulo = new Triangulo(base, altura);
        if (opcion == 1) {
          System.out.print("Ingresa la base: ");
          base = sc.nextDouble();
          System.out.print("Ingresa la altura:");
          altura = sc.nextDouble();
        }
        if (opcion == 2) {
          System.out.println("La base del triángulo es: " + triangulo.getBase());
        }
        if (opcion == 3) {
          System.out.println("La altura del triángulo es: " + triangulo.getAltura());
        }
        if (opcion == 4) {
          triangulo.imprimirArea();
        }

      } while (opcion != 5);
    } catch (Exception e) {
      System.out.println("Ingresa una opcion valida");
    }

  }

  public static void operarCirculo() {
    try {
      do {
        System.out.println("opcion f " + figura);
        menu(figura);

        System.out.print("Opcion: ");
        opcion = sc.nextInt();
        sc.nextLine();
        sc.nextLine();
        Circulo circulo = new Circulo(radio);
        if (opcion == 1) {
          System.out.print("Ingresa el radio: ");
          radio = sc.nextDouble();
        } else if (opcion == 2) {
          System.out.println("El radio del círculo es: " + circulo.getRadio());
        } else if (opcion == 3) {
          circulo.imprimirArea();
        } else if (opcion == 4) {
          circulo.imprimirPerimetro();
        }

      } while (opcion != 5);
    } catch (Exception e) {
      System.out.println("Ingresa una opcion valida");
    }
  }
}
