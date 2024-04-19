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
public class Cap6_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";
    do{
        do {
                System.out.println("Teclee un caracter");
                dato = entrada.nextLine();
            } while (dato.equals(""));

            char caracterRelleno = dato.charAt(0);

            do {
                System.out.println("Teclee un numero");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, 0));
            int numero = (int) val.getNumero();

            cuadradoDeCaracter(numero, caracterRelleno);

            System.out.println("Para salir teclee -1\nPara continuar teclee cualquier tecla");
            dato = entrada.nextLine();
        } while (!dato.equals("-1"));

    }


    static void cuadradoDeCaracter(int num, char caracter) {
        String cadena = "";
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                cadena += caracter;
            }
            cadena += "\n";
        }
        System.out.println(cadena);
    }

}

