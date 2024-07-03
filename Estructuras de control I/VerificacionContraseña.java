import java.util.Scanner;

public class VerificacionContraseña {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String contrasena = "3gg2@24";
        String passwordUsuario;
        System.out.println("Ingrese su contraseña");
        passwordUsuario = teclado.nextLine();

        if (contrasena.equals(passwordUsuario)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        teclado.close();
    }
}