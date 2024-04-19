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
public class Cap9_10 extends Cap9_14{
    private double salarioPorPieza;
    private int cantidad;
    
    public Cap9_10(String nombre, String apellido,String ssn, double salario, int numeroPiezas){
        super(nombre,apellido,ssn);
        setSalario(salario);
        setCantidad(numeroPiezas);
    }
    
    public void setSalario(double salario){
        salarioPorPieza = (salario > 0 ? salario : 0);
    }
    
    public void setCantidad(int numeroPiezas){
        cantidad = (numeroPiezas >0 ? numeroPiezas : 0);
    }
    
    public double ganancias(){
        return cantidad*salarioPorPieza;
    }
    
    public String toString(){
        return "Piezas por trabajador:" + super.toString();
    }
    
}
