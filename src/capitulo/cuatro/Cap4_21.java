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
public class Cap4_21 {

    public static void main(String[] args) {
        int numero;
        int mayor = 0;
        Scanner entrada = new Scanner(System.in);
         Validaciones val = new Validaciones();
        String dato = "";
        for (int contador = 0; contador < 10; contador++) {
            do {
                System.out.print("Ingrese un numero");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647,-2147483648));
            numero = (int) val.getNumero();

            if (contador == 0) {
                mayor = numero;
            }

            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El numero mas grande es:" + mayor);
    }
}
