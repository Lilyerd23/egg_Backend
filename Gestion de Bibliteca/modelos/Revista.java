package modelos;

public class Revista extends ItemBiblioteca implements Catalogable {
  private String nombreRevista;
  private int nroEdicion;
  private int cantidadEjemplares;

  public Revista(String nombreRevista, int nroEdicion, int cantidadEjemplares) {
    this.nombreRevista = nombreRevista;
    this.nroEdicion = nroEdicion;
    this.cantidadEjemplares = cantidadEjemplares;
  }

  @Override
  public void prestar() {
    if (cantidadEjemplares > 0) {
      cantidadEjemplares--;
      System.out.println("Revista '" + nombreRevista + "' edición " + nroEdicion
          + " ha sido prestada. Ejemplares restantes: " + cantidadEjemplares);
    } else {
      System.out.println("No hay ejemplares disponibles para prestar de la revista '" + nombreRevista + "'.");
    }
  }

  @Override
  public void devolver() {
    cantidadEjemplares++;
    System.out.println("Revista '" + nombreRevista + "' edición " + nroEdicion
        + " ha sido devuelta. Ejemplares disponibles: " + cantidadEjemplares);
  }

  @Override
  public double calcularMultas() {
    // Lógica para calcular multas
    return 0.0;
  }

  public String obtenerInformacion() {
    return "Nombre: " + nombreRevista + ", Número de Edición: " + nroEdicion + ", Cantidad de Ejemplares: "
        + cantidadEjemplares;
  }

}
