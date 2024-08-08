import java.util.Scanner;

public class GeneradorContrasenia {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int sizePassword;
    boolean tieneMayuscula = false;
    boolean tieneMinuscula = false;
    boolean tieneDigito = false;

    System.out.print("Ingresa la longitud de la contraseña a generar => ");
    sizePassword = teclado.nextInt();
    Character[] password = new Character[sizePassword];

    do {

      for (int i = 0; i < sizePassword; i++) {
        int numRandom = (int) (Math.random() * (122 - 48)) + 48;
        int tipoCaracter = (int) (Math.random() * 3);
        if (tipoCaracter == 0 && !tieneMayuscula) {
          password[i] = (char) ('A' + Math.random() * 26);
          tieneMayuscula = true;
        } else if (tipoCaracter == 1 && !tieneMinuscula) {
          password[i] = (char) ('a' + Math.random() * 26);
          tieneMinuscula = true;
        } else if (tipoCaracter == 2 && !tieneDigito) {
          password[i] = (char) ('0' + Math.random() * 10);
          tieneDigito = true;
        } else {
          password[i] = (char) numRandom;
        }
      }
    } while (!tieneMayuscula || !tieneMinuscula || !tieneDigito);

    for (int i = 0; i < sizePassword; i++) {
      System.out.print(password[i]);
    }

    teclado.close();
  }
}