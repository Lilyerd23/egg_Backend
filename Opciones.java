import java.util.Scanner;

public class Opciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("Seleccione una opcion del 1 al 3");
        System.out.println("Opción 1: Guardar");
        System.out.println("Opción 2: Cargar");
        System.out.println("Opción 3: Salir");
        opcion = teclado.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Guardado");
                break;
            case 2:
                System.out.println("Cargando");
                break;
            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Valor no valido");
                break;
        }
        teclado.close();
    }
}