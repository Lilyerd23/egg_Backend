import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConExcepcion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2;
        try {
            System.out.println("Ingrese el primer numero a restar");
            numero1 = teclado.nextDouble();

            System.out.println("Ingrese el segundo numero a restar");
            numero2 = teclado.nextDouble();
            System.out.println("El resultado de la resta es " + (numero1 - numero2));
        } catch (InputMismatchException e) {
            System.out.println("Ingresó un caracter y no un número " + e.getMessage());
        } catch (Exception e) {
            System.out.println(e);
        }
        teclado.close();
    }
}
