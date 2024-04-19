/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validar;

/**
 *
 * @author mari2
 */
public class Validaciones {
     private double numero;

    public boolean validar(String dato, double max, double min) {
        try {
            numero = Double.parseDouble(dato);
            if (numero <= max && numero >= min) {
                return false;
            }
        } catch (Exception e) {
        }
        System.out.println("Error: Dato de entrada incorrecto");
        return true;
    }

    public double getNumero() {
        return numero;
    }
}
