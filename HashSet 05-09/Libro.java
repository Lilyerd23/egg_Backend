import java.util.Objects;

public class Libro {
  private String titulo;
  private String autor;
  private String isbn;

  public Libro(String titulo, String autor, String isbn) {
    this.titulo = titulo;
    this.autor = autor;
    this.isbn = isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  // Implementación de equals
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Libro libro = (Libro) o;
    return isbn.equals(libro.isbn);
  }

  // Implementación de hashCode
  @Override
  public int hashCode() {
    return Objects.hash(isbn);
  }

  @Override
  public String toString() {
    return "Título: " + titulo + ", Autor: " + autor + ", ISBN: " + isbn;
  }
}
