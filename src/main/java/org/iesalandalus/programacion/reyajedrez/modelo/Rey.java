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

    public mover (Direccion direccion) throw OperationNotSupportedException{

        if (direccion==null){
            throw new IllegalArgumentException("La posición no es valida");
        }

        if (direccion==Direccion.NOROESTE && posicion.equals(new Posicion(1,'a')){
           throw new OperationNotSupportedException("Este movimiento no se puede realizar. ");
        }

        else {
        }
    }


    @Override
    public String toString (){
        return "Color "+getColor()+ "Posición "+getPosicion();
    }

}
