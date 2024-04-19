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
public class Cap4_32 {

    public static void main(String arg[]) {
        System.out.println("Tablero de asteriscos");
        for (int fila = 1; fila <= 8; fila++) {
            if (fila % 2 == 0) {
                System.out.print(" ");
            }
            for (int columna = 1; columna <= 8; columna++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
