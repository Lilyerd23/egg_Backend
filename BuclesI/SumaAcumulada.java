public class SumaAcumulada {
    public static void main(String[] args) {
        int[] numeros = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        System.out.println("La suma de la lista es: " + suma);
    }
}
