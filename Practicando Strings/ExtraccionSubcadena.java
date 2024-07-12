import java.util.Scanner;

public class ExtraccionSubcadena {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto;
        char caracter;
        System.out.print("Ingrese su texto: ");
        texto = teclado.next();
        System.out.println("Ingrese el primer numero entero");
        caracter = teclado.next().charAt(0);

        int indice = texto.indexOf(caracter);

        if (indice != -1) {
            System.out.println("El caracter se encuentra en la palabra.");
        } else {
            System.out.println("El caracter '" + caracter + "' no se encuentra en la palabra");
        }
        teclado.close();
    }
}
