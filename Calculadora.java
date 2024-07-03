import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero1, numero2, resultado;
        String respuesta;
        int opcion;
        System.out.println("---------- Calculadora básica -----------");
        System.out.print("Ingresa el primer numero >> ");
        numero1 = teclado.nextDouble();
        System.out.print("Ingresa otro numero >> ");
        numero2 = teclado.nextDouble();

        System.out.println("-----OPERACIONES-------");
        System.out.println("Ingresa el numero de la operacion a realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println();
        System.out.print("OPCION N° ");
        opcion = teclado.nextInt();
        teclado.close();

        resultado = opcion == 1
                ? (numero1 + numero2)
                : opcion == 2
                        ? (numero1 - numero2)
                        : opcion == 3
                                ? (numero1 * numero2)
                                : opcion == 4
                                        ? numero1 / numero2
                                        : null;
        respuesta = Double.isNaN(resultado) ? "No es posible" : ("El resultado es " + resultado);
        System.out.println(respuesta);

        switch (opcion) {
            case 1:
                resultado = numero1 + numero2;
                // System.out.println("El resultado de la suma es " + resultado);
                break;
            case 2:
                resultado = numero1 - numero2;
                // System.out.println("El resultado de la resta es " + resultado);
                break;
            case 3:
                resultado = numero1 * numero2;
                // System.out.println("El resultado de la multiplicacion es " + resultado);
                break;
            case 4:
                resultado = numero1 / numero2;
                // System.out.println("El resultado de la division es " + resultado);
                break;
            default:
                // System.out.println("No existe esa opcion");
                break;
        }

    }
}
