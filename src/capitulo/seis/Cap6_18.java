/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.seis;
import java.util.Scanner;
import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap6_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";

       
           do {
                dato = JOptionPane.showInputDialog("Ingrese un numero");
            } while (val.validar(dato, 2147483647, 0));
            int numero = (int) val.getNumero();
          cuadradoDeAsteriscos(numero);


       
    }
    static void cuadradoDeAsteriscos(int num){
        String cadena="";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                cadena+="*    ";
            }
            cadena+="\n";
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
}



