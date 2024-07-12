import java.util.Scanner;

public class FindMaximo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el " + i + 1 + " número entero ");
            numeros[i] = teclado.nextInt();
        }
        int maximo = numeros[0];
        for (int i = 0; i < numeros.length - 1; i++) {
            maximo = Math.max(numeros[i], numeros[i + 1]);
        }
        System.out.println("El numero maximo es " + maximo);
        teclado.close();

    }
}
