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
public class Cap8_4Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cap8_4 intento = new Cap8_4();
        Validaciones val = new Validaciones();
        String dato = "";
        
        
        do{
            dato = JOptionPane.showInputDialog("Ancho del rectangulo:");
        }while(val.validar(dato,20,0));
        
        float ancho = (float) val.getNumero();
        
        do{
            dato = JOptionPane.showInputDialog("Largo del rectangulo:");
        }while(val.validar(dato,20,0));
        
        float longitud = (float) val.getNumero();
        
        intento.setLongitud(longitud);
        intento.setAnchura(ancho);
        JOptionPane.showMessageDialog(null,"El perimetro es: "+intento.obtenerPer(ancho,longitud));
        JOptionPane.showMessageDialog(null,"El area es: "+intento.obtenerArea(ancho, longitud));
    }
    
}
