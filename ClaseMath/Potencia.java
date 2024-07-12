import java.util.Scanner;

public class Potencia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int base, exponente;
        System.out.print("Ingresa el numero base: ");
        base = teclado.nextInt();
        System.out.print("Ingresa el numero exponente: ");
        exponente = teclado.nextInt();
        teclado.close();
        System.out.println("El resultado es: " + Math.pow(base, exponente));
    }
}
