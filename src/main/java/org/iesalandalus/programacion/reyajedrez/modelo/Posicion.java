package org.iesalandalus.programacion.reyajedrez.modelo;

import java.util.Objects;

public class Posicion {

    private int fila;
    private char columna;

    public void setFila (int fila){
        if (fila>=1 && fila<=8)
            this.fila=fila;
        else
            throw new IllegalArgumentException("ERROR: Fila no válida.");
    }

    public int getFila(){
        return fila;
    }
    public void setColumna (char columna){
        Objects.requireNonNull(columna,"La columna no puede ser nula.");
        if (columna>='a' && columna<='h')
            this.columna=columna;
        else
            throw new IllegalArgumentException("ERROR: Columna no válida.");
    }

    public char getColumna(){
        return columna;
    }
    public Posicion(int fila,char columna){

        setFila(fila);
        setColumna(columna);

    }

    public Posicion(Posicion posicion){
        Objects.requireNonNull(posicion,"La posición no puede ser nula.");
        setFila(getFila());
        setColumna(getColumna());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Posicion other = (Posicion) obj;
        if (this.fila != other.fila) {
            return false;
        }
        if (this.columna != other.columna) {
            return false;
        }
        return true;
    }


    @Override
    public int hashCode() {
      int hash = 7;
      hash = 17 * hash + fila;
      hash = 17 * hash + columna;
      return hash;
    }

    @Override

    public String toString(){
        return "fila= "+getFila()+" columna= "+getColumna();
    }
}
