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
public class Cap6_25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            dato = JOptionPane.showInputDialog("1.Numero primo tradicional\n2.Imprimir numeros primos\n3.Numero primo metodo raiz");
        } while (val.validar(dato, 4, 1));
        byte opc = (byte) val.getNumero();
        switch (opc) {
            case 1:
                do {
                    dato = JOptionPane.showInputDialog("Teclea un numero");
                } while (val.validar(dato, Integer.MAX_VALUE, Integer.MIN_VALUE));
                int num = (int) val.getNumero();
                JOptionPane.showMessageDialog(null,esPrimo(num));
             break;
            case 2:
                primo1_10000();
            break;
            case 3:
                do {
                    dato = JOptionPane.showInputDialog("Teclea un numero");
                } while (val.validar(dato, Integer.MAX_VALUE, Integer.MIN_VALUE));
                num = (int) val.getNumero();
                JOptionPane.showMessageDialog(null,esPrimoRaiz(num));
        }

    }

    static boolean esPrimo(int num) {
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        if (num == 4) {
            return false;
        }
        return true;
    }

    static boolean esPrimoRaiz(int num) {
        int rango = (int) Math.sqrt(num);
        for (int i = 2; i < rango; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        if (num == 4) {
            return false;
        }
        return true;
    }

    static void primo1_10000() {
        String cadena = "Números Primos entre 1 y 10000:\n";
        int cont = 0;
        for (int i = 2; i < 10000; i++) {
            if (esPrimo(i)) {
                cadena += i + " ";
                cont++;
            }
            if (cont == 40) {
                cadena += "\n";
                cont = 0;
            }
        }
        JOptionPane.showMessageDialog(null, cadena + "\nLos números a probar para verificar si es o no número par son: " + (10000 / 2) + " o n/2");
        cadena = "Números Primos entre 1 y 1000 (Probando con modificacion de sqrt(n)):\n";
        cont = 0;
        for (int i = 2; i < 10000; i++) {
            if (esPrimo(i)) {
                cadena += i + " ";
                cont++;
            }
            if (cont == 40) {
                cadena += "\n";
                cont = 0;
            }
        }
        //JOptionPane.showMessageDialog(null, cadena + "\nLos números a probar para verificar si es o no número par son: " + ((int) Math.sqrt(1000)) + " o sqrt(n)");
    }

}
