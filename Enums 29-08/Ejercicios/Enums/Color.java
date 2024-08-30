package Ejercicios.Enums;

public enum Color {
  ROJO("#FF0000"),
  AMARILLO("#FFFF00"),
  AZUL("#0000FF");

  private final String valorHexadecimal;

  Color(String valorHexadecimal) {
    this.valorHexadecimal = valorHexadecimal;
  }

  public String getValorHexadecimal() {
    return valorHexadecimal;
  }

  // Método estático para obtener un Color a partir del valor hexadecimal
  public static Color fromHexadecimal(String valorHexadecimal) {
    for (Color color : values()) {
      if (color.getValorHexadecimal().equalsIgnoreCase(valorHexadecimal)) {
        return color;
      }
    }
    return null;
  }
}
