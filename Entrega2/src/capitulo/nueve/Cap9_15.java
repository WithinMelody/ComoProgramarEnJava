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
public class Cap9_15 extends Cap9_14{
    private double salario;
    private double horas;
    
    public Cap9_15(String nombre, String apellido, String ssn, double salarioHora, double horasTrabajadas){
        super(nombre,apellido,ssn);
        setSalario(salarioHora);
        setHoras(horasTrabajadas);
        
    }
    
    public void setSalario(double salarioHora){
        salario = (salarioHora < 0.0 ? 0.0 : salarioHora);
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setHoras(double horasTrabajadas){
        horas = (horasTrabajadas>=0 && horasTrabajadas <=168) ? horasTrabajadas : 0.0;
    }
    
    public double getHoras(){
        return horas;
    }
    
    public double ganancias(){
        if(getHoras() <= 40){
            return getSalario()*getHoras();
        }else{
            return 40*getSalario() + (getHoras()-40) * getSalario()*1.5;
        }
    }
    
    public String toString(){
        return String.format("Horas empleado: %sn\n%s: $%,.2f; %s: %.2f",super.toString(),"Salario por hora:",getSalario(),"Horas trabajadas",getHoras());
    }    
}
