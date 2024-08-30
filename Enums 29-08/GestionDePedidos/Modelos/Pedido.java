package GestionDePedidos.Modelos;

import GestionDePedidos.Enums.EstadoPedido;
import java.util.Arrays;

public class Pedido {
  private String numeroDePedido;
  private String cliente;
  private String[] listaDeProductos;
  private EstadoPedido estadoDelPedido;

  public Pedido(String numeroDePedido, String cliente, String[] listaDeProductos) {
    this.numeroDePedido = numeroDePedido;
    this.cliente = cliente;
    this.listaDeProductos = listaDeProductos;
    this.estadoDelPedido = EstadoPedido.PENDIENTE; // Estado inicial
  }

  public String getNumeroDePedido() {
    return numeroDePedido;
  }

  public void setNumeroDePedido(String numeroDePedido) {
    this.numeroDePedido = numeroDePedido;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public String[] getListaDeProductos() {
    return listaDeProductos;
  }

  public void setListaDeProductos(String[] listaDeProductos) {
    this.listaDeProductos = listaDeProductos;
  }

  public EstadoPedido getEstadoDelPedido() {
    return estadoDelPedido;
  }

  public void setEstadoDelPedido(EstadoPedido estadoDelPedido) {
    this.estadoDelPedido = estadoDelPedido;
  }

  @Override
  public String toString() {
    return "\nPedido{" +
        "N° Pedido ='" + numeroDePedido + '\'' +
        ", Cliente='" + cliente + '\'' +
        ", Lista De Productos=" + Arrays.toString(listaDeProductos) +
        ", Estado Del Pedido=" + estadoDelPedido +
        '}';
  }

}
