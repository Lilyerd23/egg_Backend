import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double number;
        System.out.print("Ingrese un número ");
        try {
            number = teclado.nextDouble();
            teclado.close();

            if (number > 0) {
                System.out.println("El número " + number + "  es positivo");
            } else if (number == 0) {
                System.out.println("El número ingresado es cero");
            } else {
                System.out.println("El número " + number + " es negativo");
            }
        } catch (Exception e) {
            System.out.println("Erro: Ingresó un caracter y no un numero");
        }

    }
}
