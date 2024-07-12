import java.util.Scanner;

public class ComplementarioAleatorioRaiz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un número entre el 1 y 30: ");
        int numeroLimite = teclado.nextInt();

        int random = (int) (Math.random() * numeroLimite) + 1;
        double raiz = Math.sqrt(random);
        teclado.close();

        System.out.println("La raiz cuadrada del número " + random + " es:  " + raiz);
    }
}
