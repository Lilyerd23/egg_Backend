import java.util.Scanner;

public class PromedioElementos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[4];
        double suma = 0, promedio = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingrese el " + i + 1 + " número entero ");
            numeros[i] = teclado.nextInt();
            suma = numeros[i] + suma;
        }
        promedio = suma / 4;
        System.out.println("El resultado de la suma es " + suma);
        System.out.println("El promedio es " + promedio);

        teclado.close();

    }
}
