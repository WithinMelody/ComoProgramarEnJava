/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12;

/**
 *
 * @author mari2
 */
public abstract class Empleado {
  
   private String primerNombre;
   private String apellidoPaterno;
   private String numeroSeguroSocial;
   private Fecha cumple;

   // constructor con tres argumentos
   public Empleado( String nombre, String apellido, String nss, int m, int d, int y )
   {
      primerNombre = nombre;
      apellidoPaterno = apellido;
      numeroSeguroSocial = nss;
      cumple = new Fecha(m, d, y);
   } // fin del constructor de Empleado con tres argumentos

   // establece el primer nombre
   public void establecerPrimerNombre( String nombre )
   {
      primerNombre = nombre;  // debería validar
   } // fin del método establecerPrimerNombre

   // devuelve el primer nombre
   public String obtenerPrimerNombre()
   {
      return primerNombre;
   } // fin del método obtenerPrimerNombre

   // establece el apellido paterno
   public void establecerApellidoPaterno( String apellido )
   {
      apellidoPaterno = apellido;  // debería validar
   } // fin del método establecerApellidoPaterno

   // devuelve el apellido paterno
   public String obtenerApellidoPaterno()
   {
      return apellidoPaterno;
   } // fin del método obtenerApellidoPaterno

   // establece el número de seguro social
   public void establecerNumeroSeguroSocial( String nss )
   {
      numeroSeguroSocial = nss; // debería validar
   } // fin del método establecerNumeroSeguroSocial

   // devuelve el número de seguro social
   public String obtenerNumeroSeguroSocial()
   {
      return numeroSeguroSocial;
   } // fin del método obtenerNumeroSeguroSocial

    public Fecha getCumple() {
        return cumple;
    }

    public void setCumple(Fecha cumple) {
        this.cumple = cumple;
    }
   
   // devuelve representación String de un objeto Empleado
   @Override
   public String toString()
   {
      return String.format( "%s %s\nnumero de seguro social: %s", 
         obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial() );
   } // fin del método toString

   // método abstracto sobrescrito por las subclases concretas
   public abstract double ingresos(); // aquí no hay implementación
} // fin de la clase abstracta Empleado
    

