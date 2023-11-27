package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;
import org.iesalandalus.programacion.reyajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;
import java.sql.SQLOutput;


public class Consola {
    public static Direccion direccion;

    private Consola() {

    }

    public static void mostrarMenu() {
        System.out.println("1 - Crear Rey por defecto.");
        System.out.println("2 - Crear Rey eligiendo color.");
        System.out.println("3 - Mover.");
        System.out.println("4 - Salir.");
    }

    public static int elegirOpcionMenu(int opcion) {

        do {
            System.out.println("Elige una opción del menú.");
            opcion = Entrada.entero();
            return opcion;
        }
        while (opcion < 1 && opcion > 4);
    }
           // if (opcion == 1) {
             //   System.out.println("Has elegido: 1 - Crear Rey por defecto.");
                // new Rey();
           // }
          //  if (opcion == 2) {
             //   System.out.println("Has elegido: 2 - Crear Rey eligiendo color.");
                //elegirColor();
            //}
          //  if (opcion == 3) {
            //    System.out.println("Has elegido: 3 - Mover.");
                //elegirDireccion();
          //  }
           // if (opcion == 4) {
              //  System.out.println("Has elegido: 4 - Salir.");
                // despedirse();
            //}



    public static String elegirColor(String color) {

        do {
            System.out.println("Elige un color: Blanco o Negro?:");
            color = Entrada.cadena();

        }
        while (color != "Blanco" && color != "Negro");

        return color;
    }





    public static void mostrarMenuDirecciones(){
        System.out.println("Elige una opción para mover el rey;");
        System.out.println("1 - NORTE");
        System.out.println("2 - NORESTE");
        System.out.println("3 - ESTE");
        System.out.println("4 - SURESTE");
        System.out.println("5 - SUR");
        System.out.println("6 - SUROESTE");
        System.out.println("7 - OESTE");
        System.out.println("8 - NOROESTE");
        System.out.println("9 - ENROQUE_CORTO");
        System.out.println("10 - ENROQUE_LARGO");
    }

    public static Direccion elegirDireccion(int opcion) throws OperationNotSupportedException {

        do {
            System.out.println("Elige una opción: ");
            opcion = Entrada.entero();
            if (opcion == 1) {
                return direccion.NORTE;
            }
            if (opcion == 2) {
                return (direccion.NORESTE);
            }
            if (opcion == 3) {
                return (direccion.ESTE);
            }
            if (opcion == 4) {
                return (direccion.SURESTE);
            }
            if (opcion == 5) {
                return (direccion.SUR);
            }
            if (opcion == 6) {
                return (direccion.SUROESTE);
            }
            if (opcion == 7) {
                return (direccion.OESTE);
            }
            if (opcion == 8) {
                return (direccion.NOROESTE);
            }
            if (opcion == 9) {
                return (direccion.ENROQUE_CORTO);
            }
            if (opcion == 10) {
                return (direccion.ENROQUE_LARGO);
            }
        } while (opcion < 1 && opcion > 10);
    }
    public static void despedirse(){

         System.out.println("Hasta pronto.");

    }
}
