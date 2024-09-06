import java.util.HashSet;
import java.util.Set;

public class Libreria {

  private Set<Libro> catalogo;

  // Constructor
  public Libreria() {
    this.catalogo = new HashSet<>();
  }

  // Método para agregar un libro
  public void agregarLibro(Libro libro) {
    if (catalogo.add(libro)) {
      System.out.println("Libro agregado: " + libro);
    } else {
      System.out.println("El libro ya está en el catálogo: " + libro);
    }
  }

  // Método para eliminar un libro por ISBN
  public void eliminarLibro(String isbn) {
    Libro libroAEliminar = new Libro("", "", isbn);
    if (catalogo.remove(libroAEliminar)) {
      System.out.println("Libro eliminado con ISBN: " + isbn);
    } else {
      System.out.println("No se encontró el libro con ISBN: " + isbn);
    }
  }

  // Método para mostrar el catálogo de libros
  public void mostrarCatalogo() {
    if (catalogo.isEmpty()) {
      System.out.println("El catálogo está vacío.");
    } else {
      System.out.println("Catálogo de libros:");
      for (Libro libro : catalogo) {
        System.out.println(libro);
      }
    }
  }
}