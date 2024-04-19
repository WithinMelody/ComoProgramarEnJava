/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cuatro;

import java.util.Scanner;
import javax.swing.JOptionPane;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap4_31 {

    public static void main(String[] args) {
        String binario;
        int numero;
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        do {
            System.out.println("Teclee un numero binario");
             binario = entrada.nextLine();
        } while (binario.equals(""));

        if (esBinario(binario) == false) {
            System.out.println("Error, no es un binario");
        } else {
            numero = Integer.parseInt(binario);
            convertirEntero(numero);
        }

    }

    static void convertirEntero(int bin) {
        int exponente = 0;
        int decimal = 0; //sera el equivalente en base decimal
        while (bin != 0) {
            //se toma la ultima cifra
            int digito = bin % 10;
            //se multiplica por la potencia de 2 correspondiente y se suma al numero
            decimal = decimal + digito * (int) Math.pow(2, exponente);
            //se aumenta el exponente
            exponente++;
            //se quita la ultima cifra para repetir el proceso
            bin = bin / 10;
        }
        System.out.println("Decimal: " + decimal);

    }

    static boolean esBinario(String dato) {
        for (int i = 0; i < dato.length(); i++) {
            if (dato.charAt(i) != 48 && dato.charAt(i) != 49) {
                return false;
            }
        }
        return true;
    }

}
