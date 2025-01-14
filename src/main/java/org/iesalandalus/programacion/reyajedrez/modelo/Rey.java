package org.iesalandalus.programacion.reyajedrez.modelo;

import javax.naming.OperationNotSupportedException;
import java.util.Objects;
import org.iesalandalus.programacion.reyajedrez.Consola;
public class Rey {

    private Color color;
    private Posicion posicion;
    private int totalMovimientos;

    public Color getColor() {

        return color;
    }

    private void setColor(Color color)throws IllegalArgumentException {
        if ((color != Color.BLANCO) && (color != Color.NEGRO)) {
            throw new IllegalArgumentException("El color no es valido.");
        }
        this.color = color;
    }

    public Posicion getPosicion() {

        return posicion;
    }

    private void setPosicion(Posicion posicion) {
        Objects.requireNonNull(posicion,"La posición no puede ser nula.");
        this.posicion = posicion;
    }

    public Rey (){
      this.color = Color.BLANCO;
      this.posicion = new Posicion(1,'e');
      this.totalMovimientos =0;

    }

    public Rey (Color color){
        Objects.requireNonNull(color,"El color no puede ser nulo.");
        this.color = color;
        if (color == Color.BLANCO){
            color = Color.BLANCO;
            this.posicion = new Posicion(1, 'e');
        }
        if (color ==Color.NEGRO) {
            color = Color.NEGRO;
            this.posicion = new Posicion(8,'e');
        }

    }




    public void mover (Direccion direccion) throws OperationNotSupportedException {

        int nuevaFila = posicion.getFila();
        char nuevaColumna = posicion.getColumna();
            // Al final mueve la pieza......
        if (direccion == null) {
            throw new IllegalArgumentException("La posición no es valida");
        }else {

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
                if  (totalMovimientos == 0){
                    if (color == Color.BLANCO) {
                        posicion = new Posicion(1, 'g');
                    }
                } else {
                    throw new OperationNotSupportedException ("El enroque no valido");
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
            if (nuevaFila < 1 || nuevaFila > 8 || nuevaColumna < 'a' || nuevaColumna > 'h') {
                throw new OperationNotSupportedException("Este movimiento no se puede realizar. ");
            }
        }
        totalMovimientos = totalMovimientos + 1;


    }
    @Override
    public String toString (){
        return "Color "+getColor()+ " Posición "+getPosicion();
    }

}
