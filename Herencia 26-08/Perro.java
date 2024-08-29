public class Perro {
  private String raza;

  public Perro() {
    super();
  }

  public Perro(String nombre, Integer edad, String raza) {
    super(nombre, edad);
    this.raza = raza;
  }

  public String getRaza() {
    return raza;
  }

  public static void ladrar() {
  }

}
