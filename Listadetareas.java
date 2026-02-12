/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadetareas;

/**
 *
 * @author MINEDUCYT
 */
import java.util.ArrayList;
import java.util.List;

public class Listadetareas{

    public static void main(String[] args) {

        List<String> tareas = new ArrayList<>();

        tareas.add("Hacer la tarea");
        tareas.add("Estudiar Java");
        tareas.add("Ir al gimnasio");

        System.out.println("Lista de tareas:");

        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
    }
}
