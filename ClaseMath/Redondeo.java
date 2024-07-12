import java.util.Scanner;

public class Redondeo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.print("Ingresa un numero decimal: ");
        numero = teclado.nextDouble();
        teclado.close();
        System.out.print("El numero redondeado es: " + Math.round(numero));
    }
}
