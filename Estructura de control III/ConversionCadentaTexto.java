import java.util.Scanner;

public class ConversionCadentaTexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena;
        System.out.println("Ingresa una cadena que represente un numero entero: ");
        cadena = teclado.nextLine();

        try {
            int numero = Integer.parseInt(cadena);
            System.out.println("El numero ingresado es -> " + numero);
        } catch (NumberFormatException e) {
            System.out.println(
                    "Error: La cadena ingresada no es valida y no puede convertirse en numero entero");
        }
        teclado.close();
    }
}
