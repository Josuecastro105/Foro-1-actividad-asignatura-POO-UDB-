import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlumnosUDB {

    public static void main(String[] args) {

        try (
                Scanner sc = new Scanner(System.in)) {
            Map<String, String> alumnos = new HashMap<>();  
            
            int opcion;
            
            final int INGRESAR = 1;
            final int BUSCAR = 2;
            final int ELIMINAR = 3;
            final int MOSTRAR = 4;
            final int SALIR = 5;
            
            do {
                   
                System.out.println("\n MENU UDB VIRTUAL ");
                System.out.println("1. Ingresar alumno");
                System.out.println("2. Buscar alumno");
                System.out.println("3. Eliminar alumno");
                System.out.println("4. Mostrar todos los alumnos");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                
                opcion = sc.nextInt();
                sc.nextLine(); 
                switch (opcion) {
                    case INGRESAR:
                        {
                            String carnet;
                            String nombre;
                            System.out.print("Ingrese carnet: ");
                            carnet = sc.nextLine();
                            System.out.print("Ingrese nombre completo: ");
                            nombre = sc.nextLine();
                            alumnos.put(carnet, nombre);
                            System.out.println("Alumno ingresado exitosamente");
                            break;
                        }
                    case BUSCAR:
                        {
                            String carnet;
                            System.out.print("Ingrese carnet a buscar: ");
                            carnet = sc.nextLine();
                            if (alumnos.containsKey(carnet)) {
                                System.out.println("Alumno: " + alumnos.get(carnet));
                            } else {
                                System.out.println("Alumno no encontrado, no se puede Mostrar");
                            }       break;
                        }
                    case ELIMINAR:
                        {
                            String carnet;
                            System.out.print("Ingrese carnet a eliminar: ");
                            carnet = sc.nextLine();
                            if (alumnos.containsKey(carnet)) {
                                alumnos.remove(carnet);
                                System.out.println("Alumno eliminado exitosamente");
                            } else {
                                System.out.println("Alumno no encontrado, no se puede Eliminar");
                            }       break;
                        }
                    case MOSTRAR:
                        if (alumnos.isEmpty()) {
                            System.out.println("No hay alumnos registrados");
                        } else {
                            System.out.println("Listado de alumnos:");
                    
                    alumnos.entrySet().forEach((alumno) -> {
                        System.out.println("Carnet: " + alumno.getKey() +
                                " | Nombre: " + alumno.getValue());
                    });
                        }   break;
                    case SALIR:
                        System.out.println("Saliendo del sistema..");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                
            } while (opcion != SALIR);
        }
    }
}

