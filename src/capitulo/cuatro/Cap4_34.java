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
public class Cap4_34 {

    public static void main(String[] args) {
        //System.out.println( ++(x + y) ); el ++ esta de mas
        int x, y;
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";
        
        do {
                System.out.println("Teclee el valor para x");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, -2147483648));
        x = (int) val.getNumero();
        
         do {
                System.out.println("Teclee el valor para y");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, -2147483648));
        y = (int) val.getNumero();
        
        System.out.println("El resultado es: " + (x += y));

    }

}
