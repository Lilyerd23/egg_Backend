import java.util.Scanner;

public class LongitudDeCadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        System.out.println("Ingrese un texto");
        texto = teclado.nextLine();
        System.out.println("La longitud es: " + texto.length());

    }
}
