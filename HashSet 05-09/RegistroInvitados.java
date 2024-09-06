import java.util.HashSet;
import java.util.Set;

public class RegistroInvitados {

  // HashSet para almacenar los nombres de los invitados
  private Set<String> invitados;

  // Constructor
  public RegistroInvitados() {
    // Inicializa el HashSet
    this.invitados = new HashSet<>();
  }

  public void agregarInvitado(String nombre) {
    // Añade el nombre al HashSet. El HashSet se encarga de evitar duplicados.
    if (invitados.add(nombre)) {
      System.out.println("Invitado agregado: " + nombre);
    } else {
      System.out.println("El invitado ya está en la lista: " + nombre);
    }
  }

  public void eliminarInvitado(String nombre) {
    // Elimina el nombre del HashSet si existe
    if (invitados.remove(nombre)) {
      System.out.println("Invitado eliminado: " + nombre);
    } else {
      System.out.println("El invitado no está en la lista: " + nombre);
    }
  }

  public void mostrarInvitado() {
    // Imprime la lista de invitados
    if (invitados.isEmpty()) {
      System.out.println("La lista de invitados está vacía.");
    } else {
      System.out.println("Lista de invitados:");
      for (String invitado : invitados) {
        System.out.println("- " + invitado);
      }
    }
  }

}
