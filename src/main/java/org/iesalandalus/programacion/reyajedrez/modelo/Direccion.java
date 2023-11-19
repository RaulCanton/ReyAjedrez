package org.iesalandalus.programacion.reyajedrez.modelo;

public enum Direccion {
    NORTE, NORESTE, ESTE, SURESTE, SUR, SUROESTE, OESTE, NOROESTE, ENROQUE_CORTO, ENROQUE_LARGO;

    private String cadenaAMostrar;

    private String Direccion(String cadenaAMostrar){
        this.cadenaAMostrar=cadenaAMostrar;
    }

    @Override

    public String toString(){
        return cadenaAMostrar;
    }

}
