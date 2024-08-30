package Ejercicios;

import java.util.Random;

import Ejercicios.Enums.Color;
import Ejercicios.Enums.DiaSemana;
import Ejercicios.Modelos.ConvertidorColor;

public class ApplicationEnums {
  public static void main(String[] args) {
    /*
     * DiaSemana[] dias = new DiaSemana[10];
     * Random random = new Random();
     * // Llena el arreglo con días de la semana generados al azar
     * for (int i = 0; i < dias.length; i++) {
     * dias[i] = DiaSemana.values()[random.nextInt(DiaSemana.values().length)];
     * }
     * 
     * // Imprime el resultado para cada día en el arreglo
     * for (DiaSemana dia : dias) {
     * imprimirDiaLaboral(dia);
     * }
     */

    String[] valoresHexadecimales = {
        "#FF0000", // ROJO
        "#FFFF00", // AMARILLO
        "#0000FF", // AZUL
        "#00FF00", // No es un color primario
        "#FF00FF" // No es un color primario
    };

    for (String valorHexadecimal : valoresHexadecimales) {
      Color color = ConvertidorColor.convertirHexadecimal(valorHexadecimal);

      if (color != null) {
        System.out.println(color.name()); // Imprime el nombre del color
      } else {
        System.out.println("No es un color primario");
      }

    }
  }

  public static void imprimirDiaLaboral(DiaSemana dia) {
    if (dia.esDiaLaboral()) {
      System.out.println(dia + ": Día laboral");
    } else {
      System.out.println(dia + ": No es día laboral");
    }
  }
}
