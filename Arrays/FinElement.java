import java.util.Scanner;

public class FinElement {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = { 25, 14, 6, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.print("Ingresa un número ");
        int numero = teclado.nextInt();
        boolean encontrado = false;
        for (int num : numeros) {
            if (num == numero) {
                encontrado = true;
            } else {
                encontrado = false;
            }
        }
        if (encontrado == false) {
            System.out.println("No encontrado");
        } else {
            System.out.println("El numero se encuentra dentro de la lista");
        }

        teclado.close();
    }
}
