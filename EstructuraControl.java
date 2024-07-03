import java.util.Scanner;

public class EstructuraControl {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int number;
        System.out.println("Ingrese su puntuación entre el 0 y 100");
        number = teclado.nextInt();
        teclado.close();
        if (number >= 90 && number <= 100) {
            System.out.println("Su calificación es A");
        } else if (number >= 80 && number <= 89) {
            System.out.println("Su calificación es B");
        } else if (number >= 70 && number <= 79) {
            System.out.println("Su calificación es C");
        } else if (number >= 60 && number <= 69) {
            System.out.println("Su calificación es D");
        } else if (number >= 0 && number < 60) {
            System.out.println("Su calificación es F");
        } else {
            System.out.println("El numero ingresado no se encuentra dentro del rango valido");
        }
    }
}
