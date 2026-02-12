import java.util.*;

public class EjemploPractico {
    public static void main(String[] args) {
       
    }
}
  // Creamos una colección para gestionar un inventario de productos
        Collection<String> inventario = new ArrayList<>();

        // Agregamos productos al inventario
        inventario.add("Laptop");
        inventario.add("Monitor 24 pulg");
        inventario.add("Teclado Mecánico");

        System.out.println("Inventario Inicial: " + inventario);

        // Simulamos la salida o eliminación de un producto
        System.out.println("...Eliminando 'Monitor 24 pulg' del registro...");
        inventario.remove("Monitor 24 pulg");

        // Mostramos el estado final de la colección
        System.out.println("Inventario Actualizado: " + inventario);