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
public class Cap4_17 {

    public static void main(String arg[]) {

        float prom1 = 0, prom2 = 0;
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";

        System.out.println("Calculo de kilometros y litros usados");
        do {
            System.out.print("Teclee los kilometros conducidos:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        int kmConducidos = (int) val.getNumero();

        do {
            System.out.print("Teclee los litros usados:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        int ltUsados = (int) val.getNumero();

        prom1 += kmConducidos;
        prom2 += ltUsados;
        System.out.println("Kilometros sobre litro usados:" + " " + kmConducidos / ltUsados);
        System.out.println("Calculo total de kilometros sobre litros usados:" + " " + prom1 / prom2);

    }

}
