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
public class Cuadrado extends DosDimensiones {

    private double largo;

    public Cuadrado(double largo) {
        this.largo = largo;
    }

    public double getLargo() {
        return largo > 0 ? largo : 0;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public double getArea() {
        return Math.pow(getLargo(), 2);
    }

    @Override
    public String toString() {
        return String.format("%sLargo: %.2f\n",super.toString(),getLargo());
    }

}
