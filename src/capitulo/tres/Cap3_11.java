/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.tres;

/**
 *
 * @author mari2
 */
public class Cap3_11 {

    private double saldo;

    public Cap3_11(double saldoInicial) {
        if (saldoInicial > 0.0) {
            saldo = saldoInicial;
        }
    }

    public void abonar(double monto) {
        saldo = saldo + monto;
    }

    public double obtenerSaldo() {
        return saldo;
    }

    public void cargarSaldo(double retiro) {
        if (retiro > saldo) {
            System.out.print("No cuentas con esa cantidad de dinero");
        } else {
            saldo = saldo - retiro;
        }
    }

}
