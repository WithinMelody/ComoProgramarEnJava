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
public class Cap4_29 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Validaciones val = new Validaciones();
        String dato = "";

        do {
            System.out.print("Introduzca el lado del cuadrado: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, 20, 1));
        int lado = (int) val.getNumero();

        System.out.println();
        for (int row = 1; row <= lado; row++) {
            for (int col = 1; col <= lado; col++) {
                if (row == 1 || row == lado || col == 1 || col == lado) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
