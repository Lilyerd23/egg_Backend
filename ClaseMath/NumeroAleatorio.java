public class NumeroAleatorio {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 355) + 1;
        System.out.println("Un numero entre el 1 y 355: " + num);
    }
}
