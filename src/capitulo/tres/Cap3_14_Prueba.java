/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.tres;

import validar.Validaciones;
import java.util.Scanner;

/**
 *
 * @author mari2
 */
public class Cap3_14_Prueba {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            System.out.print("Teclea un dia: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, 31, 0));
        int d = (int) val.getNumero();
        
        do {
            System.out.print("Teclea un mes: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, 12, 0));
        int m = (int) val.getNumero();
        
        do {
            System.out.print("Teclea un anio: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2020, 0));
        int a = (int) val.getNumero();


        Cap3_14 fecha = new Cap3_14(d, m, a);
        fecha.mostrarFecha();

    }

}
