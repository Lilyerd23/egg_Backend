package Ejercicios.Enums;

public enum DiaSemana {
  LUNES, MARTES, MIÉRCOLES, JUEVES, VIERNES, SÁBADO, DOMINGO;

  public boolean esDiaLaboral() {
    // Los días laborales son de LUNES a VIERNES
    return this != SÁBADO && this != DOMINGO;
  }

  public static void imprimirDiaLaboral(DiaSemana dia) {
    if (dia.esDiaLaboral()) {
      System.out.println(dia + ": Día laboral");
    } else {
      System.out.println(dia + ": No es día laboral");
    }
  }
}
