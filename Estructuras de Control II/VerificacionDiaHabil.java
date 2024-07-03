import java.util.Scanner;

public class VerificacionDiaHabil {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número entre el 1 y 7 -> ");
        numero = teclado.nextInt();
        teclado.close();
        switch (numero) {
            case 1:
                System.out.println("Día Hábil ");
                break;
            case 2:
                System.out.println("Día Hábil ");
                break;
            case 3:
                System.out.println("Día Hábil ");
                break;
            case 4:
                System.out.println("Día Hábil ");
                break;
            case 5:
                System.out.println("Día Hábil ");
                break;
            case 6:
                System.out.println("Día No Hábil ");
                break;
            case 7:
                System.out.println("Día No Hábil ");
                break;

            default:
                break;
        }
    }

}
