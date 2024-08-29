package modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  private List<Libro> catalogoLibros;

  public Biblioteca() {
    catalogoLibros = new ArrayList<>();
  }

  public void agregarLibro(Libro libro) {
    catalogoLibros.add(libro);
    System.out.println("Libro '" + libro.obtenerInformacion() + "' ha sido agregado al catálogo.");
  }

  public void mostrarCatalogo() {
    System.out.println("Catálogo de libros:");
    for (Libro libro : catalogoLibros) {
      libro.mostrarInformacion();
    }
  }

  public Libro buscarLibroPorTitulo(String titulo) {
    for (Libro libro : catalogoLibros) {
      if (libro.obtenerInformacion().contains(titulo)) {
        return libro;
      }
    }
    return null;
  }

  public void prestarLibro(Persona persona, String titulo) {
    Libro libro = buscarLibroPorTitulo(titulo);
    if (libro != null) {
      persona.tomarPrestado(libro);
    } else {
      System.out.println("El libro con el título '" + titulo + "' no está en el catálogo.");
    }
  }

  public void devolverLibro(Persona persona, String titulo) {
    Libro libro = buscarLibroPorTitulo(titulo);
    if (libro != null) {
      persona.devolver(libro);
    } else {
      System.out.println("El libro con el título '" + titulo + "' no está en el catálogo.");
    }
  }
}
