import java.util.Scanner;

public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.print("Ingrese un numero positivo ");
        numero = teclado.nextDouble();
        teclado.close();

        System.out.println("La raiz cuadrada de " + numero + " es " + Math.sqrt(numero));
    }
}
