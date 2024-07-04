import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dividiendo, divisor, cociente;
        System.out.println("Ingrese el primer numero a dividir");
        dividiendo = teclado.nextInt();
        System.out.println("Ingrese el segundo numero a dividir");
        divisor = teclado.nextInt();

        try {
            cociente = dividiendo / divisor;
            System.out.println("El resultado es " + cociente);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir entre 0 ");
        }
        teclado.close();
    }
}