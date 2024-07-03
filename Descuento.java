import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double precio, resultado;
        System.out.println("Ingrese el precio de su producto");
        precio = teclado.nextDouble();

        if (precio >= 100) {
            resultado = precio - (precio * 0.01);
            System.out.println("El precio con descuento es " + resultado);
        } else {
            System.out.println("El precio final es " + precio);
        }
        teclado.close();
    }
}
