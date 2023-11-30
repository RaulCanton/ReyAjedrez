package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Color;
import org.iesalandalus.programacion.reyajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reyajedrez.modelo.Rey;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;

import static org.iesalandalus.programacion.reyajedrez.Consola.*;


public class MainApp {

    static Rey rey;

    public static void main(String[] args) {
        int despedirse;

       do {

           mostrarMenu();
           despedirse=ejecutarOpcion(elegirOpcionMenu());

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
                try {

                  // Si el rey ya está creado no deja volver a crearlo.
                   if (rey != null) {
                    System.out.println("El rey ya existe, no puedes cambiar de pieza con la partida empezada."+"\n");
                    mostrarRey();
                    System.out.println("Elige otra opción.");
                    mostrarMenu();
                    ejecutarOpcion(elegirOpcionMenu());
                   } else{
                       crearReyDefecto();
                       mostrarRey();}
                       System.out.println();
                    return opcion;
                }catch (IllegalArgumentException e){
                    System.out.println("El rey no puede  ser nulo");
                }

                // Si el rey ya está creado no deja volver a crearlo.
            case 2:
               System.out.println("Has elegido: 2 - Crear Rey eligiendo color.");

               try {
               if (rey !=null) {
                    System.out.println("El rey ya existe, no puedes cambiar de pieza con la partida empezada."+"\n");
                    System.out.println("Elige otra opción.");
                    mostrarRey();
                   ejecutarOpcion(elegirOpcionMenu());
               }else {
                   crearReyColor();
                   mostrarRey();
                   System.out.println();
               }
                return opcion;
                 }catch (IllegalArgumentException e){
                  System.out.println("El rey no puede  ser nulo");
        }

            case 3:
                System.out.println("Has elegido: 3 - Mover.");
                // Antes de mover hay que crear el rey.
                while (rey==null){
                    System.out.println("El rey no puede ser nulo."+"\n");
                    System.out.println("Primero crea el rey."+"\n");
                    mostrarMenu();
                    ejecutarOpcion(elegirOpcionMenu());
                }
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

        // Controlo las excepciones del método mover.
        try {
            rey.mover(elegirDireccion());
        } catch (OperationNotSupportedException e){
            System.out.println("Ese movimiento no es valido.");
        } catch (IllegalArgumentException e){
            System.out.println("Te has salido del tablero.");
        }
    }

    private static void mostrarRey () {
        System.out.println("El rey actual es: "+rey);

    }

}






