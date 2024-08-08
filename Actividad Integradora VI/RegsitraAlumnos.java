import java.util.Scanner;
import java.util.InputMismatchException;

public class RegsitraAlumnos {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] alumnos = {};
    Double[] notas = {};
    Double promedio = 0.0, suma = 0.0;
    boolean salir = false;
    int opcion;
    int contador = 0;
    while (salir == false) {
      try {

        System.out.println(" --------- Bienvenido -------");
        System.out.println("Menu opcion gestion alumnos");
        System.out.println("1. Registrar Alumno.");
        System.out.println("2. Mostrar Alumnos.");
        System.out.println("3. Mostrar promedio de notas.");
        System.out.println("4. Modificar nota por nombres.");
        System.out.println("5. Eliminar alumno por nombre.");
        System.out.println("6. Salir.");
        opcion = teclado.nextInt();
        teclado.nextLine();
        switch (opcion) {
          case 1:
            System.out.print("Ingrese el nombre del alumno: ");
            System.out.println("Contador nombre " + contador);
            alumnos[contador] = teclado.nextLine();
            while (alumnos[contador].isEmpty()) {
              System.out.print("Ingrese un nombre: ");
              alumnos[contador] = teclado.nextLine();
            }
            boolean isValid = false;
            while (!isValid) {
              try {
                System.out.print("Ingrese la nota del alumno(entre 0.00 y 10.00): ");
                Double nuevaNota = teclado.nextDouble();
                if (nuevaNota >= 0.00 && nuevaNota <= 10.00) {
                  notas[contador] = nuevaNota;
                  isValid = true;
                  break;
                }
              } catch (Exception e) {
                System.out.println("Ingresa un numero valido");
                teclado.nextLine();
              }
            }
            contador++;
            break;
          case 2:
            System.out.println("tamaño " + notas.length);
            System.out.println("notas " + notas);
            for (Double nota : notas) {
              System.out.println("nota " + nota);
              suma = nota + suma;
            }
            promedio = suma / notas.length;
            System.out.println("Promedio de total de notas de los " + alumnos.length + " alumnos es: " + promedio);

            break;
          default:
            System.out.println("Debe ingresar un número entre el 1 y 6");
            break;
        }

      } catch (InputMismatchException e) {
        System.out.println("Debe ingresar un número");
        teclado.nextLine();
      }
    }
  }
}
