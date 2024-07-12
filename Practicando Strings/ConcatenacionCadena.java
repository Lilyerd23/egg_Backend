import java.util.Scanner;

public class ConcatenacionCadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombre, apellido;
        System.out.print("Ingresa tu nombre: ");
        nombre = teclado.next();
        System.out.print("Ingresa tu apellido: ");
        apellido = teclado.next();
        System.out.println("Su nombre completo es: ".concat(nombre + " " + apellido));
    }
}
