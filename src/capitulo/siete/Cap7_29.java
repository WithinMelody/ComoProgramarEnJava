/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.siete;

import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap7_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int serie, num1 = 0, num2 = 1, suma = 1;
    
        Validaciones val = new Validaciones();
        String dato = "";
        
            do {

                dato = JOptionPane.showInputDialog("Posicion a calcular para serie Fibonacci");
            } while (val.validar(dato,Integer.MAX_VALUE, Integer.MIN_VALUE));
            serie = (int) val.getNumero();
            int valores[] = new int[serie];
        
        for (int i = 1; i < serie; i++) {
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
            valores[i]= num2;
        }
        
        String cad2 = "Serie Fibonacci\n";
        for (int i = 0; i < valores.length; i++) {
            cad2+=valores[i]+"\n";
        }
        JOptionPane.showMessageDialog(null,cad2);
    }

}
