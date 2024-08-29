package Persona;

public class Application {
  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.nombre = "Juan";
    persona.edad = 25;
    persona.imprimirDatos();

    Persona persona2 = new Persona();
    persona2.nombre = "Maria";
    persona2.edad = 30;
    persona2.imprimirDatos();
  }
}
