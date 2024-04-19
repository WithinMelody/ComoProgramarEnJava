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
public class Cap9_3 {

    private EmpleadoPorComision_9_3 comisionEmpleado;
    private double sueldoBase;

    public Cap9_3(String nombre, String apellido, String ssn, double ventas, double tasa, double sueldo) {
        comisionEmpleado = new EmpleadoPorComision_9_3(nombre, apellido, ssn, ventas, tasa);
        setSueldoBase(sueldo);
    }

    public void setPrimerNombre(String primer) {
        comisionEmpleado.setPrimerNombre(primer);
    }

    public String getPrimerNombre() {
        return comisionEmpleado.getPrimerNombre();
    }

    public void setApellido(String segundo) {
        comisionEmpleado.setApellido(segundo);
    }

    public String getApellido() {
        return comisionEmpleado.getApellido();
    }

    public void setSeguroSocial(String ssn) {
        comisionEmpleado.setSeguroSocial(ssn);
    }

    public String getSeguroSocial() {
        return comisionEmpleado.getSeguroSocial();
    }

    public void setVentasBruto(double ventas) {
        comisionEmpleado.setVentasBruto(ventas);
    }

    public double getVentasBruto() {
        return comisionEmpleado.getVentasBruto();
    }

    public void setTasaComision(double tasa) {
        comisionEmpleado.setTasaComision(tasa);
    }

    public double getTasaComision() {
        return comisionEmpleado.getTasaComision();
    }

    public void setSueldoBase(double sueldo) {
        if (sueldo >= 0.0) {
            sueldoBase = sueldo;
        } else {
            throw new IllegalArgumentException("El salario debe ser >= 0.0");
        }
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public double ganancias() {
        return getSueldoBase() + comisionEmpleado.ganancias();
    }

    public String toString() {
        return String.format("%s %s\n%s: %.2f", "con sueldo base", comisionEmpleado.toString(), "Sueldo base", getSueldoBase());

    }

}
