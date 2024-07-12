import java.util.Scanner;

public class Complementarios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String texto, sinEspacio;
        System.out.println("Escribe tu texto");
        texto = teclado.nextLine();
        sinEspacio = texto.trim();
        System.out.println(sinEspacio);
    }
}
