package Carro;

public class Auto {
  String marca;
  String modelo;
  Integer anio;

  public Auto() {
    this(null, null, 0);
  }

  public Auto(String marca, String modelo, Integer anio) {
    this.marca = marca;
    this.modelo = modelo;
    this.anio = anio;
  }

  public Auto(String marca, String modelo) {
    this(marca, modelo, 0);
  }

  public Auto(String marca) {
    this(marca, null, 0);
  }

  public void imprimirDatos() {
    String datos = "Marca: " + (marca != null ? marca : "No asignada") +
        " || Modelo: " + (modelo != null ? modelo : "No asignado") +
        " || Año: " + (anio > 0 ? anio : 0);
    if (marca == null && modelo == null && anio == 0) {
      datos = "No se han asignado datos.";
    }

    System.out.println(datos);
  }
}