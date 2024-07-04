import java.util.InputMismatchException;
import java.util.Scanner;

public class DeterminacionEdades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.print("INGRESE SU EDAD ");
        try {
            edad = teclado.nextInt();
            if (edad < 0) {
                System.out.println("Edad no valida ");
            } else if (edad > 0 && edad <= 18) {
                System.out.println("Eres menor de edad");
            } else if (edad >= 18 && edad <= 64) {
                System.out.println("Eres un adulto");
            } else {
                System.out.println("Eres un adulto mayor");
            }
        } catch (InputMismatchException e) {
            System.out.println("Ingresaste un caracter no un numero entero");
        }

        teclado.close();
    }
}
