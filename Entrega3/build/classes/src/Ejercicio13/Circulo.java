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
public class Circulo extends DosDimensiones{
    private double radio;
    
    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio>0 ? radio : 0;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadio(),2);
    }

    @Override
    public String toString() {
        return String.format("%sRadio: %.2f\n",super.toString(),getRadio());
    }
    
    
    
}
