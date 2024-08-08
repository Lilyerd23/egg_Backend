import java.util.Scanner;

public class AdivinandoNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroAdivinar = (int) (Math.random() * 20) + 1;
        int numeroIngresado;

        do {
            System.out.print("Adivine el numero que se generará => ");
            numeroIngresado = teclado.nextInt();
            if (numeroIngresado < numeroAdivinar) {
                System.out.println("El numero que ingresaste es menor que el numero aleatorio");
            } else if (numeroIngresado > numeroAdivinar) {
                System.out.println("El numero que ingresaste es mayor que el numero aleatorio");
            }
        } while (numeroAdivinar != numeroIngresado);
        System.out.println("El numero que ingresaste es el correcto!!");
        teclado.close();
    }
}
