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
public class Cap9_14 {

    private final String nombre;
    private final String apellido;
    private final String numSeguroSocial;
    private double ventasBruto;
    private double tasaComision;

    public Cap9_14(String nombre, String apellido, String numSeguroSocial, double ventasBruto, double tasaComision) {
        if (ventasBruto < 0.0) {
            throw new IllegalArgumentException("Las ventas en bruton deben ser >= 0.0");
        }
        if (tasaComision <= 0.0 || tasaComision >= 1.0) {
            throw new IllegalArgumentException("La comision debe ser >0.0 y <1.0");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSeguroSocial = numSeguroSocial;
        this.ventasBruto = ventasBruto;
        this.tasaComision = tasaComision;
    }
    
    public Cap9_14(String nombre, String apellido, String numSeguroSocial){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numSeguroSocial = numSeguroSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getnumSeguroSocial() {
        return numSeguroSocial;
    }

    public double getVentasBruto() {
        return ventasBruto;
    }

    public void setVentasBruto(double ventasBruto) {
        if (ventasBruto < 0.0) {
            throw new IllegalArgumentException("Las ventas en bruto deben ser >=0.0");
        } else {
            this.ventasBruto = ventasBruto;
        }
    }

    public double getTasaComision() {
        return tasaComision;
    }

    public void setTasaComision(double tasaComision) {
        if (tasaComision <= 0.0 || tasaComision >= 1.0) {
            throw new IllegalArgumentException("La tasa de comision debe ser >0.0 y <1.0");
        } else {
            this.tasaComision = tasaComision;
        }
        
    }
    
    public double  ganancias(){
        return getTasaComision()*getVentasBruto();
    }
    @Override
    public String toString(){
        return String.format("%s:%s%s\n%s:%s\n%s: %.2f\n%s:%.2f","Comision empleado",getNombre(),getApellido(),"Numero de seguro social",getnumSeguroSocial(),"Ventas en bruto",getVentasBruto(),"Tasa de comision",getTasaComision());
    }

}


