import java.util.Scanner;

public class ValidacionContrasenia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String password = "secreto";
        String contraseniaUsuario = "";
        System.out.print("Ingrese su contraseña: ");
        contraseniaUsuario = teclado.next();

        while (!password.equals(contraseniaUsuario)) {
            System.out.print("Contraseña incorrecta, ingrese nuevamente: ");
            contraseniaUsuario = teclado.next();
        }
        System.out.println("Contraseña correcta!!");
        teclado.close();
    }
}
