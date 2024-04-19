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
public class Prueba_9_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cap9_8 cuad = new Cap9_8(4.2,5.3,6.4,7.5,8.6,5.7,3.8,5.9);
        
        Trapecio t = new Trapecio(3.5,2.2,4.5,5.6,6.7,3.2,2.1,1.5);
        
        Paralelogramo p = new Paralelogramo(7.0,7.0,4.5,3.2,5.8,4.3,5.8,4.3);
        
        Rectangulo r = new Rectangulo(25.4,12.3,23.4,12.3,25.4,9.8,22.7,25.4);
        
        Cuadrado c = new Cuadrado(3.5,4.9,5.0,3.2,5.0,3.2,3.2,7.0);
        
        System.out.printf("%s %s %s %s %s\n",cuad,t,p,r,c);
    }
    
}
