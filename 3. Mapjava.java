/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapjava;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Josue
 */
public class Mapjava {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // ==========================================
        // 1. declaración
        // ==========================================
        Map<String, String> mapaAlumnos = new HashMap<>();

        System.out.println("--- INICIO DEL PROGRAMA: GESTION DE MAPS ---");

        // ==========================================
        // 2. asignación de valores
        // ==========================================
        mapaAlumnos.put("25-1000-2026", "Ana Martinez");
        mapaAlumnos.put("25-2000-2026", "Pedro Armas");
        mapaAlumnos.put("25-3000-2026", "Lucia Fernandez");
        
        System.out.println("-> Sistema: 3 alumnos han sido cargados exitosamente.");

        // ==========================================
        // 3. busqueda por carnet
        // ==========================================
        System.out.println("\n--- SECCI0N DE BUSQUEDA ---");
        System.out.print("Ingrese el carnet a buscar: ");
        String carnetBusqueda = leer.nextLine();

        if (mapaAlumnos.containsKey(carnetBusqueda)) {
            System.out.println("¡Alumno encontrado! Nombre: " + mapaAlumnos.get(carnetBusqueda));
        } else {
            System.out.println("Error: Carnet no encontrado.");
        }

        // ==========================================
        // 4. eliminación de valores
        // ==========================================
        System.out.println("\n--- SECCION DE ELIMINACION ---");
        System.out.print("Ingrese el carnet a eliminar: ");
        String carnetBaja = leer.nextLine();

        if (mapaAlumnos.containsKey(carnetBaja)) {
            mapaAlumnos.remove(carnetBaja);
            System.out.println("Exito: Alumno eliminado correctamente.");
        } else {
            System.out.println("No se encontro el carnet.");
        }

        System.out.println("\nLista final: " + mapaAlumnos);
        System.out.println("--- FIN DEL PROGRAMA ---"); 
    }
}
