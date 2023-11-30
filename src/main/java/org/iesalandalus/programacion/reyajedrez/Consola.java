package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.utilidades.Entrada;
import org.iesalandalus.programacion.reyajedrez.modelo.Color;
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

    public static int elegirOpcionMenu() {
        int opcion;
        do {
            System.out.println("Elige una opción del menú.");
            opcion = Entrada.entero();

        }
        while (opcion < 1 || opcion > 4);
        return opcion;
    }

    public static Color elegirColor() {
    Color color= Color.BLANCO;
    int opcion;
        do {
            System.out.println("Elige un color:");
            System.out.println("1.- Blanco");
            System.out.println("2.- Negro");
            opcion = Entrada.entero();
        }

        while (opcion < 1 && opcion >2);
        if (opcion == 1){
            color = Color.BLANCO;
        }
        if (opcion == 2){
            color = Color.NEGRO;
        }
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
        //Hacer un swich
    public static Direccion elegirDireccion() {
        int opcion;
        opcion = Entrada.entero();

        while (opcion < 1 || opcion > 10) {
            System.out.println("*** La opción elegida no es valida. ***");
            mostrarMenuDirecciones();
            opcion = Entrada.entero();
        }
            // Asigno la dirección. Con el if funcionaba también (pero menos eficiente jeje).

        switch (opcion) {
            case 1:
                direccion = direccion.NORTE;
                break;
            case 2:
                direccion = direccion.NORESTE;
                break;
            case 3:
                direccion = direccion.ESTE;
                break;
            case 4:
                direccion = direccion.SURESTE;
            case 5:
                direccion = direccion.SUR;
                break;
            case 6:
                direccion = direccion.SUROESTE;
                break;
            case 7:
                direccion = direccion.OESTE;
                break;
            case 8:
                direccion = direccion.NOROESTE;
                break;
            case 9:
                direccion = direccion.ENROQUE_CORTO;
                break;
            case 10:
                direccion = direccion.ENROQUE_LARGO;
                break;
        }
       return direccion;
    }

    public static void despedirse(){

         System.out.println("Hasta pronto.");

    }
}
