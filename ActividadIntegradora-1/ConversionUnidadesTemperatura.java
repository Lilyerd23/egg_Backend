import java.util.Scanner;

public class ConversionUnidadesTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int temperature;
        double conversion;
        String unidad;

        try {
            System.out.print("Ingrese la temperatura: ");
            temperature = teclado.nextInt();
            System.out.print("Ingrese la unidad de medida (C/F): ");
            unidad = teclado.next();
            if (unidad.toUpperCase().equals("C")) {
                conversion = (temperature * 9 / 5) + 32;
                System.out.println(temperature + " grados Celsius equivale a " + conversion + " grados Fahrenheit");
            } else if (unidad.toUpperCase().equals("F")) {
                conversion = (temperature - 32) * 5 / 9;
                System.out.println(temperature + " grados Fahrenheit equivale a " + conversion + " grados Celsius");
            } else {
                System.out.println("Error: Unidad de medida no válida. Ingrese C para Celsius o F para Fahrenheit.");
            }
        } catch (Exception e) {
            System.out.print("Error: Temperatura no válida. Ingrese una temperatura numérica. " + e.getMessage());
        }
        teclado.close();
    }

}
