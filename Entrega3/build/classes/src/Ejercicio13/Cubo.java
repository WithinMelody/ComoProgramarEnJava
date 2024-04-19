/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio13;

/**
 *
 * @author mari2
 */
public class Cubo extends TresDimensiones{
    private double borde;

    public Cubo(double borde) {
        this.borde = borde;
    }

    public double getBorde() {
        return borde>0 ? borde : 0;
    }

    public void setBorde(double borde) {
        this.borde = borde;
    }

    @Override
    public double getVolumen() {
        return Math.pow(getBorde(),3);
    }

    @Override
    public double getArea() {
       return 6*Math.pow(getBorde(),2);
    }

    @Override
    public String toString() {
        return String.format("%s Borde: %.2f\n", super.toString(), getBorde());
    }
    
    
}
