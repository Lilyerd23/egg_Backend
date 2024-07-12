import java.util.Scanner;

public class SumaElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];
        int resultado = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el " + i + 1 + " número entero ");
            numeros[i] = teclado.nextInt();
            resultado = numeros[i] + resultado;
        }
        System.out.println("El resultado de la suma es " + resultado);
        teclado.close();
    }

}
