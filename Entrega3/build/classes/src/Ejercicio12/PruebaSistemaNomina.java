/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

import java.util.Calendar;

/**
 *
 * @author mari2
 */
public class PruebaSistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             // crea objetos de las subclases
       int currentMonth = 1 + Calendar.getInstance().get(Calendar.MONTH);
      
      EmpleadoAsalariado empleadoAsalariado = 
         new EmpleadoAsalariado( "John", "Smith", "111-11-1111", 800.00, 11,3,1883 );
      EmpleadoPorHoras empleadoPorHoras = 
         new EmpleadoPorHoras( "Karen", "Price", "222-22-2222", 16.75, 40,21,10,1997 );
      EmpleadoPorComision empleadoPorComision = 
         new EmpleadoPorComision( 
         "Sue", "Jones", "333-33-3333", 10000, .06, 11,10,1997 );
      EmpleadoBaseMasComision empleadoBaseMasComision = 
         new EmpleadoBaseMasComision( 
         "Bob", "Lewis", "444-44-4444", 5000, .04, 300,4,5,2020 );

      System.out.println( "Empleados procesados por separado:\n" );
      
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         empleadoPorComision, "ingresos", empleadoPorComision.ingresos() );
      System.out.printf( "%s\n%s: $%,.2f\n\n", 
         empleadoBaseMasComision, 
         "ingresos", empleadoBaseMasComision.ingresos() );

      // crea un arreglo Empleado de cuatro elementos
      Empleado[] empleados = new Empleado[ 4 ]; 

      // inicializa el arreglo con objetos Empleado
      empleados[ 0 ] = empleadoAsalariado;
      empleados[ 1 ] = empleadoPorHoras;
      empleados[ 2 ] = empleadoPorComision; 
      empleados[ 3 ] = empleadoBaseMasComision;

     System.out.println( "Empleados procesados en forma polimorfica:\n" );
      
      // procesa en forma genérica a cada elemento en el arreglo de empleados
      for ( Empleado empleadoActual : empleados ) 
      {
         System.out.println( empleadoActual ); // invoca a toString

         // determina si el elemento es un EmpleadoBaseMasComision
         if ( empleadoActual instanceof EmpleadoBaseMasComision ) 
         {
            // conversión descendente de la referencia de Empleado
            // a una referencia de EmpleadoBaseMasComision
            EmpleadoBaseMasComision empleado = 
               ( EmpleadoBaseMasComision ) empleadoActual;

            empleado.establecerSalarioBase( 1.10 * empleado.obtenerSalarioBase() );

            System.out.printf( 
               "el nuevo salario base con 10%% de aumento es : $%,.2f\n",
               empleado.obtenerSalarioBase() );
         } // fin de if

         System.out.printf( 
            "ingresos $%,.2f\n\n", (empleadoActual.getCumple().getMonth() == currentMonth)?empleadoActual.ingresos()+100.0f : empleadoActual.ingresos());
      } // fin de for

      // obtiene el nombre del tipo de cada objeto en el arreglo de empleados
      for ( int j = 0; j < empleados.length; j++ )
         System.out.printf( "El empleado %d es un %s\n", j, 
            empleados[ j ].getClass().getName() ); 
    }

}
