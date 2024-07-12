import java.util.Scanner;

public class BusquedaCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Ingresa un texto");
        texto = teclado.nextLine();
        System.out.println("Su texto en mayuscula es: " + texto.toUpperCase());
        System.out.println("Su texto en minuscula es: " + texto.toLowerCase());

    }
}
