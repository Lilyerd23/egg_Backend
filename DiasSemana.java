import java.util.Scanner;

public class DiasSemana {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;
        String nombreDia = "";
        System.out.print("Ingrese un numero entre el 1 y el 7 => ");
        numero = teclado.nextInt();
        switch (numero) {
            case 1:
                nombreDia = "Lunes";
                break;
            case 2:
                nombreDia = "Martes";
                break;
            case 3:
                nombreDia = "Miércoles";
                break;
            case 4:
                nombreDia = "Jueves";
                break;
            case 5:
                nombreDia = "Viernes";
                break;
            case 6:
                nombreDia = "Sabado";
                break;
            case 7:
                nombreDia = "Domingo";
                break;
            default:
                System.out.println("Numero no valido");
                break;
        }
        System.out.println("El día de la semana correspondiente es: " + nombreDia);
        teclado.close();
    }
}