/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio14;

/**
 *
 * @author mari2
 */
public class EmpleadoPorPiezas extends Empleado {

    private double salario;
    private int piezas;

    public EmpleadoPorPiezas(String nombre, String apellido, String nss, double salario, int piezas) {
        super(nombre, apellido, nss);
        setSalario(salario);
        setPiezas(piezas);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario >= 0.0f) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("Debe ser >=0.0f");
        }
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        if (piezas >= 0) {
            this.piezas = piezas;
        }else{
            throw new IllegalArgumentException("Debe ser >=0");
        }
    }
    
    public double ingresos(){
        return getPiezas()*getSalario();
    }

    @Override
    public String toString() {
        return String.format("Trabajo por piezas: %s\n%s: $%,.2f; %s: %d",super.toString(),"Salario:",getSalario(),"No. de piezas",getPiezas()); 
    }
    
    

}
