package GestionDePedidos.Servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

import GestionDePedidos.Enums.EstadoPedido;
import GestionDePedidos.Modelos.Pedido;

public class PedidoServicio {

  private final List<Pedido> pedidos = new ArrayList<>();

  public void crearPedido(String numeroDePedido, String cliente, String[] listaDeProductos) {
    Pedido nuevoPedido = new Pedido(numeroDePedido, cliente, listaDeProductos);
    pedidos.add(nuevoPedido);
  }

  public boolean actualizarEstadoPedido(String numeroDePedido, EstadoPedido nuevoEstado) {
    for (Pedido pedido : pedidos) {
      if (pedido.getNumeroDePedido().equals(numeroDePedido)) {
        pedido.setEstadoDelPedido(nuevoEstado);
        return true;
      }
    }
    return false;
  }

  public List<Pedido> buscarPedidosPorEstado(EstadoPedido estado) {
    return pedidos.stream()
        .filter(pedido -> pedido.getEstadoDelPedido() == estado)
        .collect(Collectors.toList());
  }

  public List<Pedido> obtenerTodosLosPedidos() {
    return new ArrayList<>(pedidos);
  }

  public List<Pedido> obtenerPedidosFiltrados(String filtro) {
    return pedidos.stream()
        .filter(pedido -> pedido.getCliente().contains(filtro) || Arrays.stream(pedido.getListaDeProductos())
            .anyMatch(producto -> producto.contains(filtro)))
        .collect(Collectors.toList());
  }
}
