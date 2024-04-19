/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio15;

/**
 *
 * @author mari2
 */
public class PruebaInterfaz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // crea arreglo PorPagar con cuatro elementos
      PorPagar[] objetosPorPagar = new PorPagar[ 6 ];
      
      // llena el arreglo con objetos que implementan la interfaz PorPagar
      objetosPorPagar[ 0 ] = new Factura( "01234", "asiento", 2, 375.00 );
      objetosPorPagar[ 1 ] = new Factura( "56789", "llanta", 4, 79.95 );
      objetosPorPagar[ 2 ] = 
         new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00 );
      objetosPorPagar[ 3 ] = 
         new EmpleadoPorHoras( "Lisa", "Barnes", "888-88-8888",25.0,45.0 );
      objetosPorPagar[4] = new EmpleadoPorComision("Marco","Arriaga","121190",52.0f,0.1f);
      objetosPorPagar[5] = new EmpleadoBaseMasComision("Mariana","Gallardo","1212308",25.0f,.15f,200.0f);

      System.out.println( 
         "Facturas y Empleados procesados en forma polimorfica:\n" ); 

      // procesa en forma genérica cada elemento en el arreglo objetosPorPagar
      for ( PorPagar porPagarActual : objetosPorPagar )
      {
          if(porPagarActual instanceof EmpleadoBaseMasComision){
              ((EmpleadoBaseMasComision)porPagarActual).establecerSalarioBase(1.10f*((EmpleadoBaseMasComision)porPagarActual).obtenerSalarioBase());
          }
         // imprime porPagarActual y su monto de pago apropiado
         System.out.printf( "%s \n%s: $%,.2f\n\n", 
            porPagarActual.toString(), 
            "pago vencido", porPagarActual.obtenerMontoPago() ); 
      } // fin de for
    }
    
}
