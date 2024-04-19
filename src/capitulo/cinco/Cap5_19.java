/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cinco;

/**
 *
 * @author mari2
 */
public class Cap5_19 {

    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;

        System.out.println(i == 1); //True
        System.out.println(j == 3); //False
        System.out.println(i >= 1 && j < 4);//True
        System.out.println(m <= 99 & k < m); //False
        System.out.println(j >= i || k == m); //True por i^j
        System.out.println(k + m < j | 3 - j >= k); //False con ambas condiciones
        System.out.println(!(k < m)); //True
    }

}
