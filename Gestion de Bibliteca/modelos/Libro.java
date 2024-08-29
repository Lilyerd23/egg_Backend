package modelos;

public class Libro extends ItemBiblioteca implements Catalogable {
  private String titulo;
  private String autor;
  private int numeroDePaginas;
  private boolean prestado;

  public Libro(String titulo, String autor, int numeroDePaginas) {
    this.titulo = titulo;
    this.autor = autor;
    this.numeroDePaginas = numeroDePaginas;
    this.prestado = false; // Inicialmente el libro no está prestado
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

  public int getNumeroDePaginas() {
    return numeroDePaginas;
  }

  public void setNumeroDePaginas(int numeroDePaginas) {
    this.numeroDePaginas = numeroDePaginas;
  }

  public void setPrestado(boolean prestado) {
    this.prestado = prestado;
  }

  @Override
  public void prestar() {
    if (!prestado) {
      prestado = true;
      System.out.println("El libro '" + titulo + "' ha sido prestado.");
    } else {
      System.out.println("El libro '" + titulo + "' ya está prestado.");
    }
  }

  @Override
  public void devolver() {
    if (prestado) {
      prestado = false;
      System.out.println("El libro '" + titulo + "' ha sido devuelto.");
    } else {
      System.out.println("El libro '" + titulo + "' no estaba prestado.");
    }
  }

  @Override
  public double calcularMultas() {
    // Lógica para calcular multas
    return 0.0;
  }

  @Override
  public String obtenerInformacion() {
    return "Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numeroDePaginas;
  }

  public void mostrarInformacion() {
    System.out.println(obtenerInformacion());
  }

  public boolean isPrestado() {
    return prestado;
  }
}
