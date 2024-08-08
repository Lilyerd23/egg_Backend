import java.util.Scanner;

public class MenuInteractico {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("");
            System.out.println("Elije una de las 5 opciones");
            System.out.println("1. Comprar producto.");
            System.out.println("2. Realizar devolucion");
            System.out.println("3. Ver mis pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");

            opcion = teclado.nextInt();
            String opciontxt = opcion == 1 ? "Comprar producto"
                    : opcion == 2 ? "Realizar devolucion"
                            : opcion == 3 ? "Ver mis pedidos"
                                    : opcion == 4 ? "Preguntas frecuentes " : "Salir";
            System.out.println("Opcion elegida: " + opciontxt);
        } while (opcion != 5);
        System.out.println("Salida exitosa!");
        teclado.close();

    }
}