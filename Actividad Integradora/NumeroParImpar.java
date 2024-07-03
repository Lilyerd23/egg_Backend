import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        double resto;
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
        teclado.close();
        resto = numero % 2;

        String respuesta = resto == 0
                ? "El numero " + numero + " es par"
                : "El numero " + numero + " es impar";

        System.out.println(respuesta);
    }
}
