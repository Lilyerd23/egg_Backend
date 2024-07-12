import java.util.Scanner;

public class ComplementarioAleatorio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int min, max;

        System.out.println("Ingresa un valor minimo y maximo para generar numero aleatorio");
        System.out.print("Valor mínimo : ");
        min = teclado.nextInt();
        System.out.print("Valor maximo : ");
        max = teclado.nextInt();
        teclado.close();

        int random = (int) (Math.random() * (max - min + 1) + min);

        System.out.println("El numero generado es: " + random);

    }
}
