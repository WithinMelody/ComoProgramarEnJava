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
public class Cap5_15 {

    public static void main(String[] args) {

        System.out.println("-Programa de impresión triangular-");
        String triángulos[] = {"(a)", "(b)", "(c)", "(d)"};
        for (int i = 0; i < 4; i++) {
            System.out.println(triángulos[i]);
            switch (i) {
                case 0:
                    triánguloA();
                    break;
                case 1:
                    triánguloB();
                    break;
                case 2:
                    triánguloC();
                    break;
                case 3:
                    triánguloD();
                    break;
            }
        }
    }

    static void triánguloA() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triánguloB() {
        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triánguloC() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");

            }
            for (int j = i; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triánguloD() {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
