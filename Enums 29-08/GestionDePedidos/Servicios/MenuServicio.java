package GestionDePedidos.Servicios;

import java.util.Scanner;

import GestionDePedidos.Enums.EstadoPedido;

public class MenuServicio {
  private final PedidoServicio pedidoServicio;
  private final Scanner scanner = new Scanner(System.in);

  public MenuServicio(PedidoServicio pedidoServicio) {
    this.pedidoServicio = pedidoServicio;
  }

  public void mostrarMenu() {
    while (true) {
      System.out.println("\n--- Menú de Gestión de Pedidos ---");
      System.out.println("1. Crear nuevo pedido");
      System.out.println("2. Actualizar estado de un pedido");
      System.out.println("3. Buscar pedidos por estado");
      System.out.println("4. Mostrar lista de pedidos");
      System.out.println("5. Salir");
      System.out.print("Seleccione una opción: ");

      int opcion = scanner.nextInt();
      scanner.nextLine(); // Consumir la nueva línea

      switch (opcion) {
        case 1:
          crearNuevoPedido();
          break;
        case 2:
          actualizarEstadoPedido();
          break;
        case 3:
          buscarPedidosPorEstado();
          break;
        case 4:
          mostrarListaDePedidos();
          break;
        case 5:
          System.out.println("Saliendo...");
          return;
        default:
          System.out.println("Opción inválida, por favor intente de nuevo.");
      }
    }
  }

  private void crearNuevoPedido() {
    System.out.print("Número de pedido: ");
    String numeroDePedido = scanner.nextLine();
    System.out.print("Nombre del cliente: ");
    String cliente = scanner.nextLine();
    System.out.print("Lista de productos (separados por comas): ");
    String[] listaDeProductos = scanner.nextLine().split(",");

    pedidoServicio.crearPedido(numeroDePedido, cliente, listaDeProductos);
    System.out.println("Pedido creado exitosamente.");
  }

  private void actualizarEstadoPedido() {
    System.out.print("Número de pedido: ");
    String numeroDePedido = scanner.nextLine();
    System.out.print("Nuevo estado (PENDIENTE, ENVIADO, ENTREGADO): ");
    EstadoPedido nuevoEstado = EstadoPedido.valueOf(scanner.nextLine().toUpperCase());

    boolean actualizado = pedidoServicio.actualizarEstadoPedido(numeroDePedido, nuevoEstado);
    if (actualizado) {
      System.out.println("Estado del pedido actualizado.");
    } else {
      System.out.println("Número de pedido no encontrado.");
    }
  }

  private void buscarPedidosPorEstado() {
    System.out.print("Estado de pedido (PENDIENTE, ENVIADO, ENTREGADO): ");
    EstadoPedido estado = EstadoPedido.valueOf(scanner.nextLine().toUpperCase());
    pedidoServicio.buscarPedidosPorEstado(estado)
        .forEach(System.out::println);
  }

  private void mostrarListaDePedidos() {
    System.out.println("Filtrar por cliente o producto (dejar en blanco para no filtrar)");
    String filtro = scanner.nextLine();
    pedidoServicio.obtenerPedidosFiltrados(filtro)
        .forEach(System.out::println);
  }
}
