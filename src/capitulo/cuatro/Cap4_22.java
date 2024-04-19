/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cuatro;

/**
 *
 * @author mari2
 */
public class Cap4_22 {

    public static void main(String[] args) {
        String cadena = "N\t";
        for (int i = 1; i <= 3; i++) {
            cadena += ((int) Math.pow(10, i)) + "°N\t";
        }
        for (int i = 1; i <= 5; i++) {
            cadena += "\n" + i;
            for (int j = 1; j <= 3; j++) {
                cadena += "\t" + (i * (int) Math.pow(10, j));
            }
        }
        cadena += "\n";
        System.out.printf(cadena);
    }
}
