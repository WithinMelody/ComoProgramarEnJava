/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cinco;

import java.util.Scanner;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap5_16 {

    public static void main(String[] args) {
        int contador = 1, num;
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";

        while (contador <= 5) {
            do {
                System.out.print("Introduce el numero " + contador + ": ");
                dato = entrada.nextLine();
            } while (val.validar(dato, 30, 1));
            num = (int) val.getNumero();

            for (int i = 1; i <= num; i++) {
                System.out.print("*");
            }

            System.out.println();

            contador++;
        }

    }
}
