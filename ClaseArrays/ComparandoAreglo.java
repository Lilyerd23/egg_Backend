import java.util.Arrays;

public class ComparandoAreglo {
    public static void main(String[] args) {
        Integer[] arrayUno = { 1, 2, 3, 4, 5, 6, 7, 8 };
        Integer[] arrayDos = { 1, 2, 3, 4, 5, 6, 7, 8 };
        boolean es = Arrays.equals(arrayDos, arrayUno);

        String respuesta = es == true
                ? "Los arreglos  son iguales"
                : "Los arreglos no son iguales";

        System.out.println(respuesta);
    }
}
