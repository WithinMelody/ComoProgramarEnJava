/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cuatro;

import java.util.Scanner;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap4_30 {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";


            do {
                System.out.print("Teclee un numero con 5 digitos: ");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, -2147483648));
            num = (int) val.getNumero();

            if (dato.length() > 5 | dato.length()<5) {
                System.out.print("Error, intente de nuevo\n");
            } else if (num == invertirNumero(num)) {
                System.out.println("Es un palindromo");
            } else {
                System.out.println("No es un palindromo");
            }
            
 

    }

    static int invertirNumero(int numero) {
        int cifra, inverso = 0;
        while (numero != 0) {
            cifra = numero % 10;
            inverso = (inverso * 10) + cifra;
            numero /= 10;
        }
        return inverso;
    }

}
