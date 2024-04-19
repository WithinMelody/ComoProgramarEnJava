/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.tres;

/**
 *
 * @author mari2
 */
public class Cap3_14 {

    private int mes, dia, year;

    public Cap3_14(int mes, int dia, int year) {
        this.mes = mes;
        this.dia = dia;
        this.year = year;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getMes() {
        return this.mes;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return this.dia;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void mostrarFecha() {
        System.out.println("Fecha ingresada:" + "" + dia + "/" + mes + "/" + year);
    }

}
