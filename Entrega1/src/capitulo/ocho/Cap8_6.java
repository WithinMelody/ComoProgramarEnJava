/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;

/**
 *
 * @author mari2
 */
public class Cap8_6 {

    /**
     * @param args the command line arguments
     */
    private static float tasaInteresAnual;
    private float saldoAhorros;
    private float mensual;

    public static float getTasaInteresAnual() {
        return tasaInteresAnual;
    }

    public static void setTasaInteresAnual(float tasaInteresAnual) {
        Cap8_6.tasaInteresAnual = tasaInteresAnual;
    }

    public float getSaldoAhorros() {
        return saldoAhorros+mensual;
    }

    public void setSaldoAhorros(float saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public float calcularInteresMensual(float interes, float saldo) {
        mensual = ((interes * saldo) / 12);
        return mensual;
    }
    public static float modificarTasaInteres(float nuevo){
            tasaInteresAnual = nuevo;
            return nuevo;
    }
}
