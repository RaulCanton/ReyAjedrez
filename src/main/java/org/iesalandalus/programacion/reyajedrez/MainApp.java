package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;


public class MainApp {

    static Rey rey;

    public static void main(String[] args) {

        do
        {
            try
            {
                //llamas al resto de metodos
            }
            catch(Exception e)
            {
                // muestras los errores
            }
        }while();
    }

    private static int ejecutarOpcion(int opcion) {


            mostrarMenu();
            elegirOpcionMenu(opcion);
            if (opcion == 1) {
                System.out.println("Has elegido: 1 - Crear Rey por defecto.");

                crearReyDefecto();
            }
            if (opcion == 2) {
                System.out.println("Has elegido: 2 - Crear Rey eligiendo color.");
                elegirColor();
                crearReyColor();
            }
            if (opcion == 3) {
                System.out.println("Has elegido: 3 - Mover.");
                elegirDireccion();
                mover();
            }
            if (opcion == 4) {
                System.out.println("Has elegido: 4 - Salir.");
                Consola.despedirse();
            }
        return opcion;
    }
    private static void crearReyDefecto () {
        rey = new Rey();
    }

    private static void crearReyColor () {
       String color = elegirColor(" ");
        if (color == 'Blanco'){
            rey = new Rey();
        }
        if (color == 'Negro'){
            rey = new Rey(Color.NEGRO);
        }
    }

    private static void mover () {
        mostrarMenuDirecciones();
        elegirDireccion();
    }

    private static void mostrarRey () {
        Rey.toString();

    }

}






