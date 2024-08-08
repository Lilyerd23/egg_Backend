import java.util.Scanner;

public class Impresiones {
  public static Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    // Scanner teclado = new Scanner(System.in);
    String nombre;
    int edad;
    /*
     * System.out.print("Ingrese un nombre: ");
     * nombre = teclado.nextLine();
     * imprimeNombre(nombre);
     * System.out.print("Ingrese una edad: ");
     * edad = teclado.nextInt();
     */
    nombre = obtenerNombre();
    edad = obtenerEdad();
    imprimeNombreYEdad(nombre, edad);
    sc.close();
  }

  public static void imprimeNombre(String nombre) {
    System.out.println("Mi nombre es " + nombre);
  }

  public static void imprimeNombreYEdad(String nombre, int edad) {
    System.out.println("Me llamo " + nombre + " y tengo " + edad);
  }

  public static String obtenerNombre() {
    System.out.print("Ingrese un nombre ");
    return sc.nextLine();
  }

  public static int obtenerEdad() {
    System.out.print("Ingrese una edad ");
    return sc.nextInt();
  }
}
