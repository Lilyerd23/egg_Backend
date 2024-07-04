import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionCalificaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese la calificacion (entre el 1 y 5) ");
        try {
            numero = teclado.nextInt();
            teclado.close();

            switch (numero) {
                case 1:
                    System.out.println("Muy deficiente");
                    break;
                case 2:
                    System.out.println("Deficiente");
                    break;
                case 3:
                    System.out.println("Suficiente");
                    break;
                case 4:
                    System.out.println("Notable");
                    break;
                case 5:
                    System.out.println("Sobresaliente");
                    break;
                default:
                    System.out.println("Calificacion no valida");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingreso un caracter no un numero entero");
        }

    }

}
