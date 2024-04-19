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
public class Cap6_28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte promedio;
        Validaciones val = new Validaciones();
        String dato = "";
        
         do {
            dato = JOptionPane.showInputDialog("Teclea el promedio");
        } while (val.validar(dato, Byte.MAX_VALUE, 0));
        promedio = (byte) val.getNumero();
        
       JOptionPane.showMessageDialog(null,"Los puntos son: "+puntosCalidad(promedio));
    }
    
    static byte puntosCalidad(byte prom){
        if(prom>=90 & prom<=100){
            return 4;
        }else if(prom>= 80 & prom<= 89){
            return 3;
        }else if(prom >=70 & prom<=79){
            return 2;
        }else if(prom >=60 & prom<=69){
            return 1;
        }else{
            return 0;
        }
    }
    
}
