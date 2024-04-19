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
public class Cap6_29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";
        int contC = 0, contCr = 0;
        do {
            do {
                dato = JOptionPane.showInputDialog("1.Lanzar Moneda\n2.Mostrar conteo cara y cruz");
            } while (val.validar(dato, 3, 1));
            byte opc = (byte) val.getNumero();

            switch (opc) {
                case 1:
                    if (tirar().equals("Cara")) {
                        contC++;
                    } else {
                        contCr++;
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Contador:\nCara: " + contC + "\nCruz: " + contCr);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Bye bye!");
            }
            dato = JOptionPane.showInputDialog("Para salir teclee -1\nPara continuar teclee cualquier tecla");
        } while (!dato.equals("-1"));
    }

    static String tirar() {
        if (aleatorio() == 1) {
            JOptionPane.showMessageDialog(null, "Resultado: Cara");
            return "Cara";
        }
        JOptionPane.showMessageDialog(null, "Resultado: Cruz");
        return "Cruz";
    }

    static byte aleatorio() {
        byte res = (byte) (Math.random() * 2);
        return res;
    }
}
