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
public class Cap6_27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1, num2;
       Validaciones val = new Validaciones();
        String dato = "";
        
        do {
            dato = JOptionPane.showInputDialog("Teclea un numero");
        } while (val.validar(dato, Integer.MAX_VALUE, Integer.MIN_VALUE));
        num1 = (int) val.getNumero();
        
        do {
            dato = JOptionPane.showInputDialog("Teclea un segundo numero");
        } while (val.validar(dato, Integer.MAX_VALUE, Integer.MIN_VALUE));
        num2 = (int) val.getNumero();
        
        JOptionPane.showMessageDialog(null,"El MCD es: "+mcd(num1,num2));
    }
    
    static int mcd(int n1, int n2){
       if(n2==0){
           return n1;
       } else{
           return mcd(n2,n1%n2);
       }
    
    }
}
