package modelos;

public class Pelicula extends ItemBiblioteca implements Catalogable {
  private String titulo;
  private String director;
  private int anioEstreno;

  public Pelicula(String titulo, String director, int anioEstreno) {
    this.titulo = titulo;
    this.director = director;
    this.anioEstreno = anioEstreno;
  }

  @Override
  public void prestar() {
    // Lógica para prestar una película
    System.out.println("La película '" + titulo + "' ha sido prestada.");
  }

  @Override
  public void devolver() {
    // Lógica para devolver una película
    System.out.println("La película '" + titulo + "' ha sido devuelta.");
  }

  @Override
  public double calcularMultas() {
    // Lógica para calcular multas
    return 0.0;
  }

  @Override
  public String obtenerInformacion() {
    return "Título: " + titulo + ", Director: " + director + ", Año de Estreno: " + anioEstreno;
  }
}
