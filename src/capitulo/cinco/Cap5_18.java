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
public class Cap5_18 {

    public static void main(String arg[]) {
        double monto, monto2;
        double principal = 1000.0;
        double tasa = 0.05;

        System.out.println("Anio" + "       " + "Monto en dolares" + "    " + "Monto en centavos");

        for (int anio = 1; anio <= 10; anio++) {
            monto = (int) (principal * Math.pow(1.0 + tasa, anio));
            monto2 = (int) (principal * Math.pow(1.0 + tasa, anio)) * 100;
            System.out.println(anio + "             " + monto + "            " + monto2);
        }
    }

}
