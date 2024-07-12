public class FindMin {
    public static void main(String[] args) {
        int[] numeros = { 19, 104, 64, 54, 425, 86, 97, 34, 3456, 21, 64, 14 };
        int minimo = numeros[0];
        for (int num : numeros) {
            if (num < minimo) {
                minimo = num;
            }
        }
        System.out.println("El numero menor es: " + minimo);
    }
}
