import java.util.Scanner;

public class PracticaScanner {
    public static void main(String[] args) {
        // Solicita al usuario que ingrese su nombre (cadena de texto), guárdalo en una
        // variable e imprime el dato por consola..
        Scanner teclado = new Scanner(System.in);
        String nombre;
        int edad;
        System.out.println("Ingrese su nombre");
        nombre = teclado.next();
        System.out.println("Edad");
        edad = teclado.nextInt();
        System.out.println("Su nombre es " + nombre + " y su edad es " + edad);
    }
}
