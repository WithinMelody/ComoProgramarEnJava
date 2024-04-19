/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;

import javax.swing.JOptionPane;

/**
 *
 * @author mari2
 */
public class Cap8_14 {
    
    private int dia;
    private int mes;
    private int year;
    private String m;
    
    public Cap8_14(int dia, int mes, int year){
        this.dia= dia;
        this.mes = mes;
        this.year = year;
        
    }
    
    public Cap8_14(String mes, int dia, int year){
        this.m = mes;
        this.dia =dia;
        this.year = year;
    }
    
    public Cap8_14(int dia, int year){
        this.dia = dia;
        this.year = year;
    }
    
       public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }
    public static void main(String[] args) {
   
         Cap8_14 fecha1 = new Cap8_14(21,19,1997);
         Cap8_14 fecha3 = new Cap8_14(21,1997);
         Cap8_14 fecha2 = new Cap8_14("Noviembre",20,1950);
         
         fecha(fecha1);
         fecha2(fecha2);
         fecha3(fecha3);
        
    }
public static void fecha(Cap8_14 fecha){
    JOptionPane.showMessageDialog(null,fecha.getMes()+"/"+fecha.getDia()+"/"+fecha.getYear());
}

public static void fecha2(Cap8_14 fecha){
    JOptionPane.showMessageDialog(null,fecha.getMes()+fecha.getDia()+","+fecha.getYear());
}

public static void fecha3(Cap8_14 fecha){
    JOptionPane.showMessageDialog(null,fecha.getDia()+"/"+fecha.getYear());
}
 
    
}
