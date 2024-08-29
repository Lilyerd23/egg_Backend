package modelos;

import java.util.ArrayList;
import java.util.List;

public class Persona {
  private String nombre;
  private String apellido;
  private List<Libro> librosPrestados;

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.librosPrestados = new ArrayList<>();
  }

  public void tomarPrestado(Libro libro) {
    if (!libro.isPrestado()) {
      libro.prestar();
      librosPrestados.add(libro);
      System.out.println(nombre + " " + apellido + " ha tomado prestado el libro '" + libro.obtenerInformacion() + "'");
    } else {
      System.out.println("El libro '" + libro.obtenerInformacion() + "' ya está prestado.");
    }
  }

  public void devolver(Libro libro) {
    if (librosPrestados.contains(libro)) {
      libro.devolver();
      librosPrestados.remove(libro);
      System.out.println(nombre + " " + apellido + " ha devuelto el libro '" + libro.obtenerInformacion() + "'");
    } else {
      System.out.println("El libro '" + libro.obtenerInformacion() + "' no está en la lista de libros prestados por "
          + nombre + " " + apellido);
    }
  }

  public List<Libro> getLibrosPrestados() {
    return librosPrestados;
  }
}
