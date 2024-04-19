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
public class Trapecio extends Cap9_8{
    private double  altura;
    
    public Trapecio(double x1,double y1,double x2, double y2, double x3, double y3, double x4, double y4){
        super(x1,y1,x2,y2,x3,y3,x4,y4);
    }
    
    public double getAltura(){
        if(getP1().getY() == getP2().getY()){
            return Math.abs(getP2().getY()-getP3().getY());
        }else{
            return Math.abs(getP1().getY()-getP2().getY());
        }
    }
    
    public double getArea(){
        return getSuma() * getAltura() /2.0;
    }
    
    public double getSuma(){
        if(getP1().getY() == getP2().getY()){
            return Math.abs(getP1().getX()-getP2().getX())+Math.abs(getP3().getX()-getP4().getX());
        }else{
            return Math.abs(getP2().getX()-getP3().getX())+Math.abs(getP4().getX()-getP1().getX());
        }
    }
    
    @Override
    public String toString(){
        return String.format("\n%s:\n%s%s:%s\n%s:%s\n", "Coordenadas del trapecio ",getCoordenadas(),"Altura ",getAltura(),"Area ",getArea());
    }
}
