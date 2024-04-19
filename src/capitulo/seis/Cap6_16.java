/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.seis;

import java.util.Scanner;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap6_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2;
        Validaciones val = new Validaciones();
        String dato = "";


            do {
                System.out.println("Teclee el multiplo: ");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, -2147483648));
            n1 = (int) val.getNumero();

            do {
                System.out.println("Numero a verificar: ");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, -2147483648));
            n2 = (int) val.getNumero();

            multiplo(n1, n2);

 
    }

    static boolean multiplo(int num1, int num2) {
        int residuo = num2 % num1;
        if (residuo == 0) {
            System.out.println("El numero " + num2 + " es multiplo de " + num1);
            return true;
        } else {
            System.out.println(num2 + " NO es un multiplo de " + num1);
            return false;
        }
    }

}
