/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.nueve;

/**
 *
 * @author mari2
 */
public class EmpleadoPorComision_9_3 {

    private String primerNombre;
    private String apellidoPaterno;
    private String numeroSeguroSocial;
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision_9_3(String nombre, String apellido, String nns, double ventas, double tasa) {
        primerNombre = nombre;
        apellidoPaterno = apellido;
        numeroSeguroSocial = nns;
        setVentasBruto(ventas);
        setTasaComision(tasa);
    }

    public void setPrimerNombre(String nombre) {
        primerNombre = nombre;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setApellido(String apellido) {
        apellidoPaterno = apellido;
    }

    public String getApellido() {
        return apellidoPaterno;
    }

    public String getSeguroSocial() {
        return numeroSeguroSocial;
    }

    public void setSeguroSocial(String numeroSeguroSocial) {
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    public double getVentasBruto() {
        return ventasBrutas;
    }

    public void setVentasBruto(double ventasBrutas) {
        if (ventasBrutas >= 0.0) {
            this.ventasBrutas = ventasBrutas;
        } else {
            throw new IllegalArgumentException("Las ventas deben ser >= 0.0");
        }
    }

    public double getTasaComision() {
        return tarifaComision;
    }

    public void setTasaComision(double tarifaComision) {
        if (tarifaComision > 0.0 && tarifaComision < 1.0) {
            this.tarifaComision = tarifaComision;
        } else {
            throw new IllegalArgumentException("La tarifa de comision debe ser >0.0 y <1.0");
        }
    }
    
    public double ganancias(){
        return getTasaComision()*getVentasBruto();
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s:%s\n%s:%.2f\n%s:%.2f","Empleado por comision",getPrimerNombre(),getApellido(),"Numero de seguro social",getSeguroSocial(),"Ventas brutas",getVentasBruto(),"Tarifa de comision",getTasaComision());
    }

}
