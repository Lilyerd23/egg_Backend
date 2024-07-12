public class ContadorElementoPar {
    public static void main(String[] args) {
        int[] numRandom = new int[10];
        int contador = 0;
        for (int i = 0; i < numRandom.length; i++) {
            numRandom[i] = (int) (Math.random() * 100) + 1;
            System.out.print(numRandom[i] + " ");
        }

        for (int num : numRandom) {
            if (num % 2 == 0) {
                contador++;
            }
        }
        System.out.println();
        System.out.println("La cantidad total de numeros pares es: " + contador);
    }
}
