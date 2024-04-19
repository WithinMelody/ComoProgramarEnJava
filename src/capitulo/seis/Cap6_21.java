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
public class Cap6_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b;
        int numero;
        Validaciones val = new Validaciones();
        String dato = "";
        

         do {
                dato =JOptionPane.showInputDialog("Menu principal\n1.Cociente de un numero\n2.Residuo de un numero\n3.Separar numeros");
            } while (val.validar(dato, 4, 1));
            byte opc = (byte) val.getNumero();
            
        switch(opc){
            case 1:
                do{
                    dato = JOptionPane.showInputDialog("Teclee el dividendo");
                }while(val.validar(dato,2147483647,1));
                a = (int) val.getNumero();
         
                do{
                    dato = JOptionPane.showInputDialog("Teclee el divisor");
                }while(val.validar(dato,2147483647,1));
                b = (int) val.getNumero();
                cocienteN(a, b);
                break;
            case 2:
                do{
                    dato = JOptionPane.showInputDialog("Teclee el dividendo");
                }while(val.validar(dato,2147483647,1));
                a = (int) val.getNumero();
                do{
                    dato = JOptionPane.showInputDialog("Teclee el divisor");
                }while(val.validar(dato,2147483647,1));
                b = (int) val.getNumero();
                residuoN(a, b);
                break;
            case 3:
                 do{
                    dato = JOptionPane.showInputDialog("Teclee un numero");
                }while(val.validar(dato,99999,0));
                numero = (int) val.getNumero();
                 mostrarDigitos(numero);
            default:
                JOptionPane.showMessageDialog(null,"Bye bye!");
                break;
        }
        
        
       


    }

    static void cocienteN(int a, int b) {
        int cociente = a / b;
        JOptionPane.showMessageDialog(null, "El cociente de la division es: " + cociente);
    }

    static void residuoN(int a, int b) {
        int residuo = a % b;
        JOptionPane.showMessageDialog(null, "El residuo de la division es: " + residuo);
    }

    static void mostrarDigitos(int num) {
        String n=Integer.toString(num);
        String cadena="";
        for (int i = 0; i < n.length(); i++) {
            cadena+=n.charAt(i)+"  ";
        }
        JOptionPane.showMessageDialog(null,cadena);
    }
   
    }


