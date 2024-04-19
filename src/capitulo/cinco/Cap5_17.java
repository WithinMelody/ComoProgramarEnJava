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
public class Cap5_17 {

    public static void main(String[] args) {
        double producto1 = 2.98;
        double producto2 = 4.50;
        double producto3 = 9.98;
        double producto4 = 4.49;
        double producto5 = 6.87;
        Scanner entrada = new Scanner(System.in);
        int prod, cant;
        double total = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        double general = 0;
        Validaciones val = new Validaciones();
        String dato = "";
        do {
            System.out.println("Producto 1, teclee 1\nProducto 2, teclee 2 \nProducto 3, teclee 3...etc\nPara checar el total de todos los productos vendidos, teclee 6.");
            do {
                System.out.println("Teclee su opcion: ");
                dato = entrada.nextLine();
            } while (val.validar(dato, 7, 1));
            prod = (int) val.getNumero();

            switch (prod) {
                case 1:
                    do {
                        System.out.println("Cantidad vendida del producto 1: ");
                        dato = entrada.nextLine();
                    } while (val.validar(dato, 2147483647, 0));
                    cant = (int) val.getNumero();
                    total = cant * producto1;
                    System.out.println("Total del producto 1: " + total);
                    break;
                case 2:
                    do {
                        System.out.println("Cantidad vendida del producto 2: ");
                        dato = entrada.nextLine();
                    } while (val.validar(dato, 2147483647, 0));
                    cant = (int) val.getNumero();
                    total2 = cant * producto2;
                    System.out.println("Total del producto 2: " + total2);
                    break;
                case 3:
                    do {
                        System.out.println("Cantidad vendida del producto 3: ");
                        dato = entrada.nextLine();
                    } while (val.validar(dato, 2147483647, 0));
                    cant = (int) val.getNumero();
                    total3 = cant * producto3;
                    System.out.println("Total del producto 3: " + total3);
                    break;
                case 4:
                    do {
                        System.out.println("Cantidad vendida del producto 4: ");
                        dato = entrada.nextLine();
                    } while (val.validar(dato, 2147483647, 0));
                    cant = (int) val.getNumero();
                    total4 = cant * producto4;
                    System.out.println("Total del producto 4: " + total4);
                    break;
                case 5:
                    do {
                        System.out.println("Cantidad vendida del producto 5: ");
                        dato = entrada.nextLine();
                    } while (val.validar(dato, 2147483647, 0));
                    cant = (int) val.getNumero();
                    total5 = cant * producto5;
                    System.out.println("Total del producto 5: " + total5);
                    break;
                case 6:
                    general = total + total2 + total3 + total4 + total5;
                    System.out.println("Total obtenido de todos los productos: " + general);
                    break;
                default:
                    System.out.println("Bye bye");
                    break;

            }
            System.out.println("Para salir teclee -1\nPara continuar teclee cualquier tecla");
            dato = entrada.nextLine();
        } while (!dato.equals("-1"));
    }

}
