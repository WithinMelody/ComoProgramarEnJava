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
public class Cap4_18 {

    public static void main(String arg[]) {
        Scanner entrada = new Scanner(System.in);
        int numCuenta, saldoInicial, totalArticulosMes, totalCreditosMes, limiteCredito, nuevoSaldo;
        Validaciones val = new Validaciones();
        String dato = "";

        do {
            System.out.println("Teclee su numero de cuenta:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        numCuenta = (int) val.getNumero();

        do {
            System.out.println("Teclee su saldo al inicio del mes:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        saldoInicial = (int) val.getNumero();

        do {
            System.out.println("Teclee el total de todos los articulos cargados durante el mes:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        totalArticulosMes = (int) val.getNumero();

        do {
            System.out.println("Teclee el total de creditos aplicados a la cuenta durante el mes:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        totalCreditosMes = (int) val.getNumero();

        do {
            System.out.println("Teclee su limite de credito permitido:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        limiteCredito = (int) val.getNumero();

        nuevoSaldo = saldoInicial + totalArticulosMes - totalCreditosMes;
        if (nuevoSaldo > limiteCredito) {
            System.out.println("Se excede el limite de su credito" + " " + numCuenta);
        } else {
            System.out.println("El limite de credito para la cuenta" + " " + numCuenta + " " + "es de:" + nuevoSaldo);
        }

    }
}
