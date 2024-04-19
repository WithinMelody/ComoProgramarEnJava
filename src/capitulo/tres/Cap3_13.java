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
public class Cap3_13 {

    private String primerNombre, apellidoPaterno;
    private double salarioMensual;

    public Cap3_13(String primerN, String aPaterno, double sMensual) {
        primerNombre = primerN;
        apellidoPaterno = aPaterno;
        salarioMensual = sMensual;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoPaterno() {
        return this.apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
        if (salarioMensual < 0) {
            salarioMensual = 0.0;
        }
    }

    public double getSalarioMensual() {
        return this.salarioMensual;
    }

}
