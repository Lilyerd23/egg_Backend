public class Gato extends Animal {
  private String raza;

  public Gato() {
    super();
  }

  public Gato(String nombre, Integer edad, String raza) {
    super(nombre, edad);
    this.raza = raza;
  }

  public static void maullar() {
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

}
