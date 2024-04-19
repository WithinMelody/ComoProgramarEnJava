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
public class Cap6_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            dato = JOptionPane.showInputDialog("Teclea un numero");
        } while (val.validar(dato, Integer.MAX_VALUE, Integer.MIN_VALUE));
        numero = (int) val.getNumero();
        
        JOptionPane.showMessageDialog(null,"El numero invertido es: "+invertir(numero));
    }
    
    static int invertir(int n){
        int cifra, inverso=0;
        while(n!=0){
            cifra = n%10;
            inverso = (inverso*10) + cifra;
            n/=10;
        }
        return inverso;
    }

}
