/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;

/**
 *
 * @author mari2
 */
public class Cap8_8 {

    private int mes;
    private int dia;
    private int year;

    private static final int[] daysPerMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Cap8_8(int dia, int mes, int year) {
        if (mes <= 0 || mes > 12) {
            throw new IllegalArgumentException("El mes (" + mes + ") debe de ser un numero entre 1-12");
        }
        
        if(dia<=0|| (dia>daysPerMonth[mes] || !(mes==2 && dia ==29))){
            throw new IllegalArgumentException("El dia ("+dia+") esta fuera del rango");
        }
        
      if(mes==2 && dia==29 && !(year%400==0 || (year%4==0 && year%100 !=0))){
          throw new IllegalArgumentException("El dia ("+dia+"esta fuera del rango");
      }
      
      if(year<=0 || year<=1990 || year>2020){
          throw new IllegalArgumentException("El año ("+year+") debe ser un numero entre 1990-2020");
      }
        this.mes = mes;
        this.dia=dia;
        this.year=year;
        System.out.printf("Fecha construida: %s%n",this);
    }
    
    public String toString(){
        return String.format("%d/%d/%d", dia, mes, year);
    }
    
    public int siguienteDia(int day){
        return day+1;
    }
    

}
