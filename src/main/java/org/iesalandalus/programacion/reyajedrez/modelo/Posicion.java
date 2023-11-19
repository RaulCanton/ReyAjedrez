package org.iesalandalus.programacion.reyajedrez.modelo;

public class Posicion {

    private int fila;
    private char columna;

    public void setFila (int fila){
        if (fila>=1 && fila<=8)
            this.fila=fila;
        else
            throw new IllegalArgumentException("La fila introducida no es valida");
    }

    public void setColumna (char columna){
        if (columna>='a' && columna<='h')
            this.columna=columna;
        else
            throw new IllegalArgumentException("La columna introducida no es valida");
    }

    public Posicion(int fila,char columna){
        setFila(fila);
        setColumna(columna);

    }
}
