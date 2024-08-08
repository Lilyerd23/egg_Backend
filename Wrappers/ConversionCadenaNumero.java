import java.util.Scanner;

public class ConversionCadenaNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa un número entero");
        String numero = teclado.next();

        System.out.println("Número: " + Integer.parseInt(numero));
        teclado.close();

    }
}
