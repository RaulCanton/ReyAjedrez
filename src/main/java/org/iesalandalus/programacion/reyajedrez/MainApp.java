package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Rey;




public class MainApp {
    public static void main(String[] args) {

        Rey rey;

        private static void ejecutarOpcion(int opcion){
            Consola.mostrarMenu();
            Consola.elegirOpcionMenu(opcion);
        }

        private static void crearReyDefecto() {
            Rey = new Rey();
        }

        private static void mover(){
            Consola.mostrarMenuDirecciones();
            Consola.elegirDireccion();
        }

        private static void mostrarRey(){
            Rey.toString();

        }


    }