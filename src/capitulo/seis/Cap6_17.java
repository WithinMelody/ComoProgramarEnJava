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
public class Cap6_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Validaciones val = new Validaciones();
        String dato = "";
      
            Scanner entrada = new Scanner(System.in);

            do {
                System.out.println("Teclea un numero");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, -2147483648));
            int numero = (int) val.getNumero();

            esPar(numero);


    }

    static boolean esPar(int num) {
        if (num % 2 == 0) {
            System.out.println("El numero es par");
            return true;
        } else {
            System.out.println("El numero es impar");
            return false;
        }
    }

}
