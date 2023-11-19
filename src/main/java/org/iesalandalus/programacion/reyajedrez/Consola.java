package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.sql.SQLOutput;

public class Consola {

    private  Consola(){

    }
    public static void mostrarMenu(){
        System.out.println("1 - Crear Rey por defecto.");
        System.out.println("2 - Crear Rey eligiendo color.");
        System.out.println("3 - Mover.");
        System.out.println("4 - Salir.");
    }

    public static void elegirOpcionMenu(int opcion){
        opcion=0;
        while (opcion < 1 && opcion >4) {
            System.out.println("Elige una opción del menú.");
            opcion = Entrada.entero();

            if (opcion == 1) {
                System.out.println("Has elegido: 1 - Crear Rey por defecto.");
            }
            if (opcion == 2) {
                System.out.println("Has elegido: 2 - Crear Rey eligiendo color.");
            }
            if (opcion == 3) {
                System.out.println("Has elegido: 3 - Mover.");
            }
            if (opcion == 4) {
                System.out.println("Has elegido: 4 - Salir.");
            }
        }
    }
    public static void elegirColor(String color){
        color="rojo";
        while (color !="Blanco" && color != "Negro") {
            System.out.println("Elige un color: Blanco o Negro?:");
            color = Entrada.cadena();
        }
    }

    public static void mostrarMenuDirecciones(){
        System.out.println("Elige una opción para mover el rey;");
        System.out.println("1 - NORTE");
        System.out.println("2 - NOROESTE");
        System.out.println("3 - ESTE");
        System.out.println("4 - SURESTE");
        System.out.println("5 - SUR");
        System.out.println("6 - SUROESTE");
        System.out.println("7 - OESTE");
        System.out.println("8 - NOROESTE");
        System.out.println("9 - ENROQUE_CORTO");
        System.out.println("10 - ENROQUE_LARGO");
    }

    public static void elegirDireccion(int opcion) {
        opcion = 0;
        while (opcion < 1 && opcion > 10) {
            System.out.println("Elige una opción: ");
        }


    }

    public static void despedirse(){
         System.out.println("Hasta pronto.");

    }
}
