import java.util.Scanner;

public class VerificarCadenaNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero ");
        String cadena = teclado.next();

        try {
            double numero = Double.valueOf(cadena);
            System.out.println("Entrada valida - " + numero);
        } catch (Exception e) {
            System.out.println("Error la entrada no es número válido");
        }
        teclado.close();
    }
}
