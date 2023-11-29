package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;


public class MainApp {

    static Rey rey;

    public static void main(String[] args) {
        int despedirse;
        //despedirse=ejecutarOpcion(elegirOpcionMenu());
       do {
           // mostrarMenuDirecciones();
           mostrarMenu();
           despedirse=ejecutarOpcion(elegirOpcionMenu());
           // ejecutarOpcion(elegirOpcionMenu());
           //  elegirDireccion();
           //{
            /*try
            {
                //llamas al resto de metodos
            }
            catch(Exception e)
            {
                // muestras los errores
            }*/
       }while((despedirse != 4));
    }

    private static int ejecutarOpcion(int opcion) {


        switch (opcion){
            case 1:
                System.out.println("Has elegido: 1 - Crear Rey por defecto. Rey Blanco en posición 1-e");
                crearReyDefecto();
                mostrarRey();
                return opcion;


            case 2:
                System.out.println("Has elegido: 2 - Crear Rey eligiendo color.");
                elegirColor();
                crearReyColor();
                mostrarRey();
                return opcion;


            case 3:
                System.out.println("Has elegido: 3 - Mover.");
                //mostrarMenuDirecciones();
              //  elegirDireccion();
                crearReyDefecto();
                mover();

                mostrarRey();
                return opcion;


            case 4:
                System.out.println("Has elegido: 4 - Salir.");
                Consola.despedirse();
                return opcion;


            default:
                throw new IllegalArgumentException ("La opción no es correcta.");

        }

    }

    private static void crearReyDefecto(){
        rey = new Rey();
    }

    private static void crearReyColor () {
           rey = new Rey(elegirColor());
    }


    private static void mover () {
        mostrarMenuDirecciones();
        //elegirDireccion();
        rey.mover(elegirDireccion());

    }

    private static void mostrarRey () {
        System.out.println("Imprimmo el rey: "+rey);

    }

}






