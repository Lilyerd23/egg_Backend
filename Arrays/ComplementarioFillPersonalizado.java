import java.util.Arrays;
import java.util.Scanner;

public class ComplementarioFillPersonalizado {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanioArreglo, numRelleno;
        System.out.print("Ingresa el tamaño del array: ");
        tamanioArreglo = teclado.nextInt();
        System.out.print("Ingresa el numero con el que quieres rellenar el array: ");
        numRelleno = teclado.nextInt();
        System.out.print("Indice hasta donde rellenar: ");
        int indice = teclado.nextInt();
        teclado.close();
        int[] arreglo = new int[tamanioArreglo];
        Arrays.fill(arreglo, 0, indice, numRelleno);
        int nuevoIndice, nuevoNum;

        /*
         * do {
         * System.out.println("Continua llenando el arreglo");
         * System.out.print("Ingresa el valor a llenar en el array: ");
         * nuevoNum = teclado.nextInt();
         * System.out.println("Ingresa el indice para terminar de llenar");
         * nuevoIndice = teclado.nextInt();
         * 
         * if (nuevoIndice > indice && nuevoIndice < tamanioArreglo) {
         * System.out.println("Sigue llenando");
         * } else {
         * 
         * }
         * 
         * } while (nuevoIndice < arreglo.length);
         */
        System.out.println("Arreglo resultante: " + Arrays.toString(arreglo));
    }
}
