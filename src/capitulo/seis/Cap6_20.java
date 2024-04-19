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
public class Cap6_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            dato = JOptionPane.showInputDialog("Teclea el radio del circulo");
        } while (val.validar(dato, Math.pow(1.79769313486232,308), 0));
        double radio = val.getNumero();

        circuloArea(radio);
    }

    static void circuloArea(double r) {
        double area = Math.PI * Math.pow(r, 2);
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + area);

    }

}
