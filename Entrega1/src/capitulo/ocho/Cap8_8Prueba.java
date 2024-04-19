/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;

import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap8_8Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";
        int dia, mes, year;
        String resp;
        

        dia = Integer.parseInt(JOptionPane.showInputDialog("Dame el dia"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Dame el mes"));
        year = Integer.parseInt(JOptionPane.showInputDialog("Dame el año"));

        Cap8_8 prueba = new Cap8_8(dia, mes, year);
        Cap8_8 prueba2 = new Cap8_8(dia,mes,year);
        
        do{ 
            
            resp = JOptionPane.showInputDialog(prueba2+"\nDesea aumentar el dia?"); 
            prueba2.siguienteDia(dia);
            
        }while(resp.equals("si"));
        
         
    }

}
