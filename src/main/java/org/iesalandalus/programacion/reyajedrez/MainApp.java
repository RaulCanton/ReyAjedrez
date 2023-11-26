package org.iesalandalus.programacion.reyajedrez;

import org.iesalandalus.programacion.reyajedrez.modelo.Rey;




public class MainApp {
    public static void main(String[] args) {

        Rey rey;

        private static void ejecutarOpcion (int opcion) {
            Consola.mostrarMenu();
            Consola.elegirOpcionMenu(opcion);
            if (opcion == 1) {
                System.out.println("Has elegido: 1 - Crear Rey por defecto.");
                new Rey();
            }
            if (opcion == 2) {
                System.out.println("Has elegido: 2 - Crear Rey eligiendo color.");
                Consola.elegirColor();
            }
            if (opcion == 3) {
                System.out.println("Has elegido: 3 - Mover.");
                Consola.elegirDireccion();
            }
            if (opcion == 4) {
                System.out.println("Has elegido: 4 - Salir.");
                Consola.despedirse();
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