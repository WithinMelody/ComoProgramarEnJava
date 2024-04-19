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
public class Cap5_22 {

    public static void main(String[] args) {
        System.out.printf("(a)\t   (b)\t      (c)\t  (d)\n");
        for (int i = 0; i < 10; i++) {
            triánguloA(i);
            System.out.print(" ");
            triánguloB(i);
            System.out.print(" ");
            triánguloC(i);
            System.out.print(" ");
            triánguloD(i);
            System.out.println();
        }
    }

    static void triánguloA(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        for (int j = i; j < 10; j++) {
            System.out.print(" ");
        }
    }

    static void triánguloB(int i) {
        for (int j = 10; j > i; j--) {
            System.out.print("*");
        }
        for (int j = 0; j < i; j++) {
            System.out.print(" ");
        }
    }

    static void triánguloC(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(" ");

        }
        for (int j = i; j < 10; j++) {
            System.out.print("*");
        }
    }

    static void triánguloD(int i) {
        for (int j = i; j < 10; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }

    }

}
