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
public class Cap3_12_Prueba {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            System.out.print("Ingrese el numero de piezas:"); // indicador
            dato = entrada.nextLine();
        } while (val.validar(dato,'\uffff','\u0000'));
        String piezas = Double.toString((val.getNumero()));

  
        System.out.print("Ingrese descripcion de la pieza:"); // indicador
        String objeto= entrada.nextLine();
        
        do {
            System.out.print("Ingrese la cantidad de piezas a comprar:"); 
            dato = entrada.nextLine();
        } while (val.validar(dato,2147483647, 0));
        int cant = (int) val.getNumero();

       
        do {
             System.out.print("Ingrese el precio de las piezas:");
                dato = entrada.nextLine();
        } while (val.validar(dato,Math.pow(1.79769313486232,308), 0));
        double pr = val.getNumero();

        Cap3_12 total = new Cap3_12(piezas, objeto, cant, pr);

        System.out.println("Precio a pagar:" + total.obtenerMontoFactura());

    }

}
