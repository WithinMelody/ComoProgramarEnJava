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
public class Cap4_19 {

    public static void main(String arg[]) {
        double art1 = 239.99;
        double art2 = 129.75;
        double art3 = 99.95;
        double art4 = 350.89;
        double valor1, valor2, valor3, valor4;
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            System.out.println("Cuantos articulos 1 vendio en la semana?");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        int n = (int) val.getNumero();
        valor1 = n * art1;

        do {
            System.out.println("Cuantos articulos 2 vendio en la semana?");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        int n2 = (int) val.getNumero();
        valor2 = n2 * art2;

        do {
            System.out.println("Cuantos articulos 3 vendio en la semana?");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        int n3 = (int) val.getNumero();
        valor3 = n3 * art3;

        do {
            System.out.println("Cuantos articulos 4 vendio en la semana?");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        int n4 = (int) val.getNumero();
        valor4 = n4 * art4;

        int mercancia = n + n2 + n3 + n4;
        double dinero = valor1 + valor2 + valor3 + valor4;
        System.out.println("Total de articulos vendidos:" + " " + mercancia + " " + "\nTotal de articulos en efectivo:" + dinero);
        double pago = 200 + (dinero * .09);
        System.out.println("Ingresos del vendedor:" + pago);

    }

}
