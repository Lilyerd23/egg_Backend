package Ejercicios.Modelos;

import Ejercicios.Enums.Color;

public class ConvertidorColor {
  public static Color convertirHexadecimal(String valorHexadecimal) {
    return Color.fromHexadecimal(valorHexadecimal);
  }
}
