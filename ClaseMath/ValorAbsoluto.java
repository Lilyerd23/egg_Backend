import java.util.Scanner;

public class ValorAbsoluto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Ingresa un número => ");
        numero = teclado.nextInt();
        teclado.close();
        System.out.println("El valor absoluto del numero es: " + Math.abs(numero));
    }

}
