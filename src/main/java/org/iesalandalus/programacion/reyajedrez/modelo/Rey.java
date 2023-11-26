package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;

public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Color getColor() {

        return color;
    }

    private void setColor(Color color) {

        this.color = color;
    }

    public Posicion getPosicion() {

        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public Rey (){
      this.color = Color.BLANCO;
      this.posicion = new Posicion(1,'e');

    }

    public Rey (Color color){
        this.color = color;
        if (color == Color.BLANCO){
            this.posicion = new Posicion(1, 'e');
        }
        if (color ==Color.NEGRO) {
            this.posicion = new Posicion(8,'e');
        }
    }
    Rey reyBlanco = new Rey(Color.BLANCO);
    Rey reyNegro = new Rey(Color.NEGRO);


    public void mover (Direccion direccion)throws IllegalArgumentException,OperationNotSupportedException {

        int nuevaFila = posicion.getFila();
        char nuevaColumna = posicion.getColumna();
        int nuevaColumnaNumCorto = nuevaColumna + 3;
        int nuevaColumnaNumLargo = nuevaColumna - 4;
        // totalMovimientos =0;
        if (direccion == null) {
            throw new IllegalArgumentException("La posición no es valida");
        }

        if (direccion == Direccion.NORTE) {
            posicion = new Posicion(nuevaFila + 1, nuevaColumna);
        }
        if (direccion == Direccion.NORESTE) {
            posicion = new Posicion(nuevaFila + 1, --nuevaColumna);
        }
        if (direccion == Direccion.NOROESTE) {
            posicion = new Posicion(nuevaFila + 1, ++nuevaColumna);
        }
        if (direccion == Direccion.ESTE) {
            posicion = new Posicion(nuevaFila, --nuevaColumna);
        }
        if (direccion == Direccion.OESTE) {
            posicion = new Posicion(nuevaFila, ++nuevaColumna);
        }
        if (direccion == Direccion.SUR) {
            posicion = new Posicion(nuevaFila - 1, nuevaColumna);
        }
        if (direccion == Direccion.SURESTE) {
            posicion = new Posicion(nuevaFila - 1, --nuevaColumna);
        }
        if (direccion == Direccion.SUROESTE) {
            posicion = new Posicion(nuevaFila - 1, ++nuevaColumna);
        }

        if (direccion == Direccion.ENROQUE_CORTO) {
            if (totalMovimientos == 0) {
                if (color == Color.BLANCO) {
                    posicion = new Posicion(1, 'g');
                }
            } else {
                throw new OperationNotSupportedException("El enroque no valido");
            }
        }

        if (direccion == Direccion.ENROQUE_LARGO) {
            if (totalMovimientos == 0){
                if (color == Color.BLANCO) {
                    posicion = new Posicion(1, 'c');
                }
            } else {
            throw new OperationNotSupportedException("El enroque no valido");
                }
        }

        if (direccion == Direccion.ENROQUE_CORTO) {
            if (totalMovimientos == 0) {
                if (color == Color.NEGRO) {
                    posicion = new Posicion(8, 'g');
                }
            } else {
                throw new OperationNotSupportedException("El enroque no valido");
            }
        }

        if (direccion == Direccion.ENROQUE_LARGO) {
            if (totalMovimientos == 0) {
                if (color == Color.NEGRO) {
                    posicion = new Posicion(8, 'c');
                }
            } else {
                throw new OperationNotSupportedException("El enroque no valido");
            }
        }
        if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 'a' || nuevaColumna > 'h' || nuevaColumnaNumCorto < 'a' || nuevaColumnaNumLargo > 'h') {
            throw new OperationNotSupportedException("Este movimiento no se puede realizar. ");
        }

        if (posicion = new Posicion(posicion.getFila(), posicion.getColumna());{
           totalMovimientos = totalMovimientos + 1;
        }

    }
    @Override
    public String toString (){
        return "Color "+getColor()+ "Posición "+getPosicion();
    }

}
