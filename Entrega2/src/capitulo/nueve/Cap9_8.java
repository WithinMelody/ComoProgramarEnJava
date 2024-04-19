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
//Cuadrilatero
public class Cap9_8 {
    private Punto p1,p2,p3,p4;
    
    public Cap9_8(double x1,double y1,double x2,double y2,double x3,double y3,double x4,double y4){
        p1 = new Punto(x1,y1);
        p2 = new Punto(x2,y2);
        p3 = new Punto(x3,y3);
        p4 = new Punto(x4,y4);
    }
    
    public Punto getP1(){
        return p1;
    }
    
    public Punto getP2(){
        return p2;
    }
    
    public Punto getP3(){
        return p3;
    }
    
    public Punto getP4(){
        return p4;
    }
    
    @Override
    public String toString(){
        return String.format("%s:\n%s", "Coordenadas del cuadrilatero ",getCoordenadas());
    }
    
    public String getCoordenadas(){
        return String.format("%s,%s,%s,%s\n",p1,p2,p3,p4);
    }
    
}
