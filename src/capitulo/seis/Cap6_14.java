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
public class Cap6_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int exponente;
        int base;
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            System.out.println("Teclee el exponente");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        exponente = (int) val.getNumero();

        do {
            System.out.println("Teclee la base");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        base = (int) val.getNumero();

        enteroPotencia(base, exponente);

    }

    static void enteroPotencia(int base, int exponente) {
        double potencia = 1;
        for (int i = 1; i <= exponente; i++) {
            potencia *= base;
        }

        System.out.println("El resultado de la potencia es: " + potencia);

    }
}
