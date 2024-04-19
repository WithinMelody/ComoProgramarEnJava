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
public class ComisionExtra_9_14 extends Cap9_14{
    private double salarioBase;
    
    public ComisionExtra_9_14(String nombre, String apellido, String numSeguroSocial, double ventasBruto, double tasaComision, double salarioBase){
        super(nombre,apellido, numSeguroSocial, ventasBruto, tasaComision);
        if(salarioBase <0.0){
            throw new IllegalArgumentException("El salario base debe ser >=0.0");
        }else{
            this.salarioBase = salarioBase;
        }
        
    }
    
     public void setSalarioBase(double salarioBase){
         if(salarioBase<0.0){
             throw new IllegalArgumentException("El saladio base debe ser >=0.0");
         }else{
             this.salarioBase = salarioBase;
         }
     }
     
     public double getSalarioBase(){
         return salarioBase;
     }
     @Override
     public double ganancias(){
         return getSalarioBase()+super.ganancias();
     }
     @Override
     public String toString(){
         return String.format("%s %s\n%s: %.2f","Empleado por comision",super.toString(),"Salario base",getSalarioBase());
     }
}
