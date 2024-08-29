public class SumaArray {
  public static void main(String[] args) {
    int suma = 0;
    int[] array = { 1, 5, 47, 13, 45, 9, 685, 87 };
    for (int i = 0; i < array.length; i++) {
      suma = array[i] + suma;
    }
  }
}
