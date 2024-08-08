import java.util.Arrays;
import java.util.Collections;

public class OrdenDescendente {
    public static void main(String[] args) {
        int i = 0;
        Integer numeros[] = new Integer[10];

        do {
            int random = (int) (Math.random() * 100) + 1;
            numeros[i] = random;
            i = i + 1;
        } while (i < 10);

        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros, Collections.reverseOrder());
        System.out.println(Arrays.toString(numeros));
    }
}