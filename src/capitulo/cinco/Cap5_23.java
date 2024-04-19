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
public class Cap5_23 {

    public static void main(String[] args) {
        int x = 3, y = 5;
        int a = 2, b = 7, g = 5;
        int i = 2, j = 8;

        System.out.println("Inciso a: ");
        System.out.println(!(x < 5) && !(y <= 7));
        System.out.println(!(x < 5 || y <= 7));

        System.out.println("Inciso b: ");
        System.out.println(!(a == b) || !(g != 5));
        System.out.println(!(a == b && g != 5));

        System.out.println("Inciso c: ");
        System.out.println(!(x <= 8) && (y > 4));
        System.out.println(!(x <= 8) || !(y > 4));

        System.out.println("Inciso d: ");
        System.out.println(!((i > 4) || (j <= 6)));
        System.out.println((!(i > 4) && !(j <= 6)));

    }

}
