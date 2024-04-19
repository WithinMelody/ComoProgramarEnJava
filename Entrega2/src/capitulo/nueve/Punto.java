/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.nueve;

/**
 *
 * @author mari2
 */
public class Punto {
    private double x;
    private double y;
    
    public Punto(double coordX,double coordY){
        x = coordX;
        y = coordY;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    @Override
    public String toString(){
        return String.format("%.1f,%.1f",getX(),getY());
    }
          
    
}
