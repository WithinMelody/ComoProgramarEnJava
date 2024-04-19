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
public class Prueba_9_14 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        Cap9_14 empleado = new Cap9_14("Mariana","Gallardo","1670625",1000,.06);
        System.out.println("Informacion del empleado:");
        System.out.printf("\n%s %s\n","Nombre:",empleado.getNombre());
        System.out.printf("%s %s\n","Apellido:",empleado.getApellido());
        System.out.printf("%s %s\n","Seguro social:",empleado.getnumSeguroSocial());
        System.out.printf("%s %.2f\n","Ventas en bruto:",empleado.getVentasBruto());
        System.out.printf("%s %.2f\n","Tasa de comision:",empleado.getTasaComision());
        
        empleado.setVentasBruto(500);
        empleado.setTasaComision(.2);
        
        System.out.printf("\n%s:\n\n%s\n","Informacion actualizada:",empleado);
        
        ComisionExtra_9_14 empleado2 = new ComisionExtra_9_14("Marco","Arriaga","1800478",1200,.04,300);
        System.out.printf("\n%s %s\n","Nombre:",empleado2.getNombre());
        System.out.printf("%s %s\n","Apellido:",empleado2.getApellido());
        System.out.printf("%s %s\n","Seguro social:",empleado2.getnumSeguroSocial());
        System.out.printf("%s %.2f\n","Ventas en bruto:",empleado2.getVentasBruto());
        System.out.printf("%s %.2f\n","Tasa de comision:",empleado2.getTasaComision());
        
        empleado2.setSalarioBase(1000);
        
        System.out.printf("\n%s:\n\n\n%s\n","Informacion actualizada:",empleado2.toString());
        
               
        
    }
    
}
