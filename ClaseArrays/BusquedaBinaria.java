import java.util.*;

public class BusquedaBinaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numBuscar;
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 18, 20 };
        System.out.println(Arrays.toString(numeros));
        System.out.print("Ingrese un número para buscar: ");
        numBuscar = teclado.nextInt();

        System.out.println("El indice del numero a buscar es: " + Arrays.binarySearch(numeros, numBuscar));
        teclado.close();
    }
}
