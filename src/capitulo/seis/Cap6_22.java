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
public class Cap6_22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";
        byte opc = 0;
        
        do {
            dato = JOptionPane.showInputDialog("1.Farenheit a Centigrados\n2.Centigrados a Farenheit");
        } while (val.validar(dato,3,1));
        opc = (byte) val.getNumero();
        

        switch (opc) {
            case 1:

                do {

                    dato = JOptionPane.showInputDialog("Teclee los Grados Fahrenheit");
                } while (val.validar(dato, 2147483647, -2147483648));
                int f = (int) val.getNumero();
                celsius(f);
                break;
            case 2:
                do {

                    dato = JOptionPane.showInputDialog("Teclee los Grados Centigrados");
                } while (val.validar(dato, 2147483647, -2147483648));
                int c = (int) val.getNumero();
                farenheit(c);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Bye bye!");
                break;
        }
 
    }

    static int celsius(int fah) {
        int cent = (int) (5.0 / 9.0 * (fah - 32));
        JOptionPane.showMessageDialog(null, fah + " grados fahrenheit equivalen a " + cent + " grados centigrados");
        return cent;

    }

    static int farenheit(int cen) {
        int far = (int) (9.0 / 5.0 * cen + 32);
        JOptionPane.showMessageDialog(null, cen + " grados centigrados equivalen a " + far + " grados fahrenheit");
        return far;
    }
}
