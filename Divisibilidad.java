import java.util.Scanner;

public class Divisibilidad {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double number;
        System.out.print("Ingrese un número ");
        number = teclado.nextDouble();
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("El número es divisible por 3 y 5");
        } else if (number % 3 == 0) {
            System.out.println("El número es divisible por 3");

        } else if (number % 5 == 0) {
            System.out.println("El número es divisible por 5");

        } else {
            System.out.println("El número no es divisible por 3 y 5");

        }
        teclado.close();
    }
}
