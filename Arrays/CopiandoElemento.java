import java.util.Scanner;
import java.util.*;

public class CopiandoElemento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = { 1, 3, 5 };

        System.out.print("Ingrese un primer numero ");
        int numero4 = teclado.nextInt();
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = numero4;
        System.out.print("Ingrese un segundo numero ");
        int numero5 = teclado.nextInt();
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = numero5;
        teclado.close();

        System.out.println("La lista de los numeros es: " + Arrays.toString(numeros));

    }
}
