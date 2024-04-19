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
public class Cap5_21 {

    public static void main(String[] args) {
        int limite = 500;

        for (int hipotenusa = 1; hipotenusa < limite; hipotenusa++) {
            for (int lado1 = 1; lado1 <= limite; lado1++) {
                for (int lado2 = 1; lado2 <= limite; lado2++) {

                    if ((lado1 * lado1) + (lado2 * lado2) == hipotenusa) {
                        System.out.printf("%3d\t%3d\t%3d\n", lado1, lado2, hipotenusa);
                    }
                }
            }
        }

    }

}
