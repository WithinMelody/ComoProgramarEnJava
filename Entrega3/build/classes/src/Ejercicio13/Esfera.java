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
public class Esfera extends TresDimensiones{
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio>0 ? radio : 0;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getVolumen() {
      return (1/3)*Math.PI*Math.pow(getRadio(),3);
    }

    @Override
    public double getArea() {
      return (1/3)*Math.PI*Math.pow(getRadio(),2);
    }

    @Override
    public String toString() {
        return String.format("%sRadio: %.2f",super.toString(),getRadio());
    }
    
    
    
    
}
