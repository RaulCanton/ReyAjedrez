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

    public static void elegirOpcion(int opcion){
        opcion=0;
        while (opcion !=1 || opcion !=2 ||opcion !=3 ||opcion !=4 ||)
        System.out.println("Elige una opción del menú.");
        opcion=Entrada.entero();
    }
}
