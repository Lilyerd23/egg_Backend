import java.util.Scanner;

import modelos.Equipo;
import modelos.Jugador;

public class AppLiga {

  public static Scanner sc = new Scanner(System.in);
  public static int opcion, opcionJugador,
      opcionEquipo, contadorJugador = 0, contadorEquipo = 0;
  public static Equipo equipoList[];
  public static Jugador jugadorList[];

  public static void main(String[] args) {
    opcion = menu();
    seleccion(opcion);
  }

  public static int menu() {

    try {
      System.out.println("------ GESTION DE LIGA DE JUGADORES DE FUTBOL------");
      System.out.println("------ Menu ------");
      System.out.println("1. Crear Jugador");
      System.out.println("2. Crear Equipo");
      System.out.println("3. Asignar Jugador a Equipo");
      System.out.println("4. Listar Jugadores");

    } catch (Exception e) {
      System.out.println("Opcion no valida");
    }
    opcion = sc.nextInt();
    sc.nextLine();

    return opcion;
  }

  public static void seleccion(int op) {
    System.out.println("seleccion");
    switch (op) {
      case 1:
        crearJugador();
        break;
      case 2:
        crearEquipo();
        break;
      case 3:
        asignarJugadorEquipo(jugadorList, equipoList);
        break;
      case 4:
        listaJugadores();
      default:
        break;
    }
  }

  public static void crearJugador() {
    System.out.print("Ingresa el nombre del jugador: ");
    String nombre = sc.nextLine();
    Equipo equipo = null;
    int num = 0;
    System.out.println("\nLista de equipos");
    if (equipoList == null) {
      System.out.println("No hay equipos disponibles");
      // Jugador[] jugador = { new Jugador(nombre) };
    } else {
      for (int index = 0; index <= equipoList.length; index++) {
        System.out.println((index + 1) + ". " + equipoList[index]);
      }
      /*
       * System.out.println("Selecciona uno de los equipos");
       * num = sc.nextInt();
       * equipo = equipoList[num];
       * Jugador[] jugador = { new Jugador(nombre, equipo) };
       */
    }

    System.out
        .println("\nJugador creado exitosamente " + nombre);
    menu();
    contadorJugador++;
  }

  public static void crearEquipo() {
    System.out.println("alo cerar equipo");
    System.out.print("Ingresa el nombre del equipo: ");
    String nombre = sc.nextLine();
    equipoList[contadorEquipo].setNombre(nombre);
    System.out.println("Equipo creado -> " + nombre);
    contadorEquipo++;
    menu();
  }

  public static void asignarJugadorEquipo(Jugador[] jugadores, Equipo[] equipos) {
    System.out.println("Lista de Jugadores");
    for (int i = 0; i < jugadores.length; i++)

    {
      System.out.println((i + 1) + ". " + equipos[i].getNombre());
    }
    System.out.print("\nSelecciona un jugador: ");
    opcionJugador = sc.nextInt();
    sc.nextLine();

    System.out.println("\nLista de equipos");
    for (int i = 0; i < equipos.length; i++) {
      System.out.println((i + 1) + ". " + equipos[i].getNombre());
    }
    System.out.print("\nSelecciona un jugador: ");
    opcionEquipo = sc.nextInt();
    sc.nextLine();

    jugadorList[contadorJugador].setNombre(jugadores[opcionJugador - 1].getNombre());
    jugadorList[contadorJugador].setEquipo(equipos[opcionJugador - 1]);
    menu();
  }

  public static Jugador[] listaJugadores() {
    return jugadorList;
  }
}
