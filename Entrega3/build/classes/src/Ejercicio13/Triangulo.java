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
public class Triangulo extends DosDimensiones{
    private double base, altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base>0 ? base : 0;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura>0 ? altura : 0;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double getArea() {
       return (getBase()*getAltura())/2;
    }

    @Override
    public String toString() {
        return String.format("%sBase: %.2f\n Altura: %.2f\n",super.toString(),getBase(), getAltura());
    }
    
    
    
}
