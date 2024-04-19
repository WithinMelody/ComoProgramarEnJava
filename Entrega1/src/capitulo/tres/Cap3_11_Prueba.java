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
public class Cap3_11_Prueba {

    public static void main(String[] args) {
        Cap3_11 cuenta1 = new Cap3_11(50.00); // crea objeto Cuenta
        Cap3_11 cuenta2 = new Cap3_11(-7.53); // crea objeto Cuenta
        Validaciones val = new Validaciones();
        String dato = "";

        // muestra el saldo inicial de cada objeto
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

        // crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        double montoDeposito, montoRetiro; // deposita el monto escrito por el usuario

        do {
            System.out.print("Escriba el monto a depositar para cuenta1: "); // indicador
            dato = entrada.nextLine();
        } while (val.validar(dato, Math.pow(1.7976931, 308), 0));
        montoDeposito = val.getNumero();
        System.out.printf("\nSumando %.2f al saldo de cuenta1\n\n", montoDeposito);
        cuenta1.abonar(montoDeposito); // suma al saldo de cuenta1
        // muestra los saldos
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n\n", cuenta2.obtenerSaldo());

        do {
            System.out.print("Escriba el monto a depositar para cuenta2: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, Math.pow(1.7976931, 308), 0));
        montoDeposito = val.getNumero();
        System.out.printf("\nSumando %.2f al saldo de cuenta2\n\n", montoDeposito);
        cuenta2.abonar(montoDeposito); // suma al saldo de cuenta2

        //Cargando saldo
        do {
            System.out.println("Escriba el monto a retirar para cuenta1: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, Math.pow(1.7976931, 308), 0));
        montoRetiro = val.getNumero();
        System.out.println("Verificando si se puede retirar" + montoRetiro);
        cuenta1.cargarSaldo(montoRetiro);

        do {
            System.out.println("Escriba el monto a retirar para cuenta2: ");
            dato = entrada.nextLine();
        } while (val.validar(dato, Math.pow(1.7976931, 308), 0));
        montoRetiro = val.getNumero();
        System.out.println("Verificando si se puede retirar" + montoRetiro);
        cuenta2.cargarSaldo(montoRetiro);

        // muestra los saldos
        System.out.printf("Saldo de cuenta1: $%.2f\n", cuenta1.obtenerSaldo());
        System.out.printf("Saldo de cuenta2: $%.2f\n", cuenta2.obtenerSaldo());

    }
}
