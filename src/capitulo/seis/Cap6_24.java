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
public class Cap6_24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";
        byte opc;
        
        do {
            dato = JOptionPane.showInputDialog("1.Numero perfecto \n2.Numeros perfectos del 1 al 1000");
        } while (val.validar(dato, 3,1));
        opc = (byte) val.getNumero();    
        

        switch (opc) {
            case 1:
                do {
                    dato = JOptionPane.showInputDialog("Teclea un numero");
                } while (val.validar(dato, Integer.MAX_VALUE, 1));
                int num = (int) val.getNumero();
                if (perfecto(num) == true) {
                        JOptionPane.showMessageDialog(null,"El "+num+" es un número perfecto");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"El "+num+" no es un número perfecto");
                    }
                break;
            case 2:
                String cadena="Números perfectos del 1 hasta el 1000:\n";
                    for (int i = 1; i <= 1000; i++) {
                        if(perfecto(i)){
                           cadena+=i+"  ";
                        }
                    }
                    
                    JOptionPane.showMessageDialog(null,cadena);
                    
                    break;
            default:
                JOptionPane.showMessageDialog(null,"Bye bye!");
                break;

         }
         
    }
    
     static boolean perfecto(int numero) {
        int suma = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                suma += i;
                
            }
         // System.out.println(suma);   imprimir factores, computadora luego de un rato se traba xD
        }
        if (suma == numero) {
            return true;
        }
        return false;
        
    }
     

}
