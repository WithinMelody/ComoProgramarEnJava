/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.seis;

import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap6_23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float n1, n2, n3;
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            dato = JOptionPane.showInputDialog("Teclea un numero");
        } while (val.validar(dato, Float.MAX_VALUE,Float.NEGATIVE_INFINITY));
        n1 = (float) val.getNumero();
        
        do {
            dato = JOptionPane.showInputDialog("Teclea un segundo numero");
        } while (val.validar(dato,Float.MAX_VALUE,Float.NEGATIVE_INFINITY));
        n2 = (float) val.getNumero();
        
        do {
            dato = JOptionPane.showInputDialog("Teclea un tercer numero");
        } while (val.validar(dato,Float.MAX_VALUE,Float.NEGATIVE_INFINITY));
        n3 = (float) val.getNumero();
        
        JOptionPane.showMessageDialog(null,"El menor es: "+minimo3(n1,n2,n3));
    }
    
    static float minimo3(float n1,float n2, float n3){
       return Math.min(Math.min(n1,n2),n3);
       
    }

}
