package GestionDePedidos;

import GestionDePedidos.Servicios.MenuServicio;
import GestionDePedidos.Servicios.PedidoServicio;

public class Application {
  public static void main(String[] args) {
    PedidoServicio pedidoServicio = new PedidoServicio();
    MenuServicio menuServicio = new MenuServicio(pedidoServicio);

    menuServicio.mostrarMenu();
  }
}
