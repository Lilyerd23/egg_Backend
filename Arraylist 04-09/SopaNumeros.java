import java.util.ArrayList;
import java.util.Scanner;

public class SopaNumeros {

  public static void main(String[] args) {
    // Leer valores ingresados por el usuario
    ArrayList<Integer> numeros = leerValores();

    // Calcular la suma y el promedio de los valores
    int suma = calcularSuma(numeros);
    double promedio = calcularPromedio(numeros);
    // Mostrar resultados
    mostrarResultados(numeros, suma, promedio);

  }

  // Método para leer valores del usuario
  public static ArrayList<Integer> leerValores() {
    ArrayList<Integer> numeros = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    int valor;

    System.out.println("Ingrese números enteros. Introduzca -99 para finalizar.");

    while (true) {
      System.out.print("Ingrese un número: ");
      valor = scanner.nextInt();

      if (valor == -99) {
        break;
      }

      numeros.add(valor);
    }
    scanner.close();

    return numeros;
  }

  // Método para calcular la suma de los valores
  public static int calcularSuma(ArrayList<Integer> numeros) {
    int suma = 0;
    for (int numero : numeros) {
      suma += numero;
    }
    return suma;
  }

  // Método para calcular el promedio de los valores
  public static double calcularPromedio(ArrayList<Integer> numeros) {
    if (numeros.isEmpty()) {
      return 0; // Evitar división por cero si no hay valores
    }

    int suma = calcularSuma(numeros);
    return (double) suma / numeros.size();
  }

  // Método para mostrar los resultados
  public static void mostrarResultados(ArrayList<Integer> numeros, int suma, double promedio) {
    System.out.println("Valores ingresados: " + numeros);
    System.out.println("Número total de valores: " + numeros.size());
    System.out.println("Suma de los valores: " + suma);
    System.out.println("Promedio de los valores: " + promedio);

    int conteoMayoresQuePromedio = 0;
    for (int valor : numeros) {
      if (valor > promedio) {
        conteoMayoresQuePromedio++;
      }
    }

    System.out.println("Cantidad de valores mayores que la media: " + conteoMayoresQuePromedio);
  }
}
