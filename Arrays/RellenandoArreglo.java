import java.util.Arrays;
import java.util.Scanner;

public class RellenandoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanioArreglo, numRelleno;
        System.out.print("Ingresa el tamaño del arreglo: ");
        tamanioArreglo = scanner.nextInt();
        System.out.print("Ingrese el numero con el que quieres rellenar: ");
        numRelleno = scanner.nextInt();

        int[] arreglo = new int[tamanioArreglo];

        Arrays.fill(arreglo, numRelleno);
        System.out.print("Arreglo: " + Arrays.toString(arreglo));
        scanner.close();
    }
}
