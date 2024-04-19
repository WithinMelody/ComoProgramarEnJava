/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.seis;

import java.util.Random;
import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap6_30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Adivine el número");
        byte op;
        Validaciones val = new Validaciones();
        String dato = "";
        do {
            do {

                dato = JOptionPane.showInputDialog("Menu\n1.-Adivinar un número");
            } while (val.validar(dato, 2, 1));
            op = (byte) val.getNumero();
            switch (op) {
                case 1:
                    adivinar(aleatorio());
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Bye bye!");
                    break;

            }

            dato = JOptionPane.showInputDialog("Para salir teclee -1\nPara continuar teclee cualquier tecla");
        } while (!dato.equals("-1"));
    }

    static int aleatorio() {
        return (int) (Math.random() * 1001 + 1);
    }

    static boolean adivinar(int número) {
        //JOptionPane.showMessageDialog(null, "Numeros al azar, buena suerte!");
        String opc[] = {"No", "Si"};
        String cadena = "";
        int num;
        byte op;
        Validaciones val = new Validaciones();
        String dato = "";
        do {

            do {
                dato = JOptionPane.showInputDialog("Adivina un numero entre 1 y 1000");
            } while (val.validar(dato, 1000, 1));
            num = (int) val.getNumero();
           

            if (num > número) {
                JOptionPane.showMessageDialog(null, "Demasiado alto");
            } else if (num < número) {
                JOptionPane.showMessageDialog(null, "Demasiado bajo");
            } else {
                JOptionPane.showMessageDialog(null, "Felicidades, adivino el numero!");
                return true;
            }
            op = (byte) JOptionPane.showOptionDialog(null, "¿Desea saber el numero?", "Pregunta", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opc, opc[0]);
        } while (op != 1);
        JOptionPane.showMessageDialog(null, "La respuesta es: " + número);
        return false;
    }
}
