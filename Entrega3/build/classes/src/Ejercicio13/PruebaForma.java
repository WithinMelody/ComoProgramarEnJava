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
public class PruebaForma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Figura fig[] = new Figura[6];
        fig[0] = new Circulo(7.0);
        fig[1]= new Cuadrado(5.0);
        fig[2] = new Triangulo(6.0,4.0);
        fig[3]= new Esfera(12.0);
        fig[4]= new Cubo(3.0);
        fig[5] = new Tetraedo(8.0);
        
        for(Figura f : fig){
            //System.out.println(f);
            if(f instanceof DosDimensiones){
                DosDimensiones dd = (DosDimensiones) f;
                System.out.printf("%sArea: %.2f\n\n",dd.toString(),dd.getArea());
            } else if(f instanceof TresDimensiones){
                TresDimensiones td = (TresDimensiones) f;
                System.out.printf("%sArea: %.2f\n\n",td.toString(),td.getArea());
                System.out.printf("%sVolumen: %.2f\n\n",td.toString(),td.getVolumen());
            }
                    
        }
    }
    
}
