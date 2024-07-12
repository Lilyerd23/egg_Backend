import java.util.Scanner;

public class ConstrasenaSegura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String password;
        System.out.print("Ingrese una constraseña segura: ");

        password = teclado.next();
        String regexp = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        if (password.matches(regexp)) {
            System.out.println("¡Contraseña segura! Cumple con todos los criterios.");
        } else {
            System.out.println(
                    "Contraseña no segura.");
            System.out.println("Debe incluir al menos 8 caracteres");
            System.out.println("Contener al menos una letra mayuscula y una letra minuscula");
            System.out.println("Contener al menos un número");
            System.out.println("Contener al menos un caracter especial");
        }
        teclado.close();
    }
}
