import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int figura;
        double radio, lado, base, altura, area;
        System.out.print("Elige una figura (entre el 1 y 3) ");
        figura = teclado.nextInt();
        switch (figura) {
            case 1:
                System.out.println("Ingrese el radio del círculo");
                radio = teclado.nextDouble();
                area = Math.PI * Math.pow(radio, 2);
                System.out.println("El area del círculo es " + area);
                break;
            case 2:
                System.out.println("Ingrese el lado del cuadrado");
                lado = teclado.nextDouble();
                area = Math.pow(lado, 2);
                System.out.println("El area del cuadrado es " + area);
                break;
            case 3:
                System.out.println("Ingrese la base del triángulo");
                base = teclado.nextDouble();
                System.out.println("Ingrese la altura del triángulo");
                altura = teclado.nextDouble();
                area = (base * altura) / 2;
                System.out.println("El area del triángulo es " + area);
                break;
            default:
                System.out.println("Opcion no válida ");
                break;
        }
        teclado.close();
    }
}
