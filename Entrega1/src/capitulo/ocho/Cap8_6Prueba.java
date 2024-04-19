/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap8_6Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cap8_6 ahorrador1 = new Cap8_6();
        Cap8_6 ahorrador2 = new Cap8_6();

        ahorrador1.setSaldoAhorros(3000.00f);
        ahorrador2.setSaldoAhorros(2000.00f);
        ahorrador1.calcularInteresMensual(4, 3000.00f);
        ahorrador2.calcularInteresMensual(4, 2000.00f);

        JOptionPane.showMessageDialog(null, "Saldos con tasa de 4%" + "\nAhorrador 1: " + ahorrador1.getSaldoAhorros() + "\nAhorrador 2:" + ahorrador2.getSaldoAhorros());
        
        ahorrador1.calcularInteresMensual(5,3000.00f);
        ahorrador2.calcularInteresMensual(5,2000.00f);
        
        JOptionPane.showMessageDialog(null,"Saldos con tasa de 5%"+"\nAhorrador 1:" + ahorrador1.getSaldoAhorros()+"\nAhorrador 2: "+ahorrador2.getSaldoAhorros());

    }

}
