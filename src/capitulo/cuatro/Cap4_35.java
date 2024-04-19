/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cuatro;

import java.util.Scanner;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap4_35 {

    public static void main(String[] args) {
        int lado1, lado2, lado3;

        Scanner entrada = new Scanner(System.in);
        Validaciones val = new Validaciones();
        String dato = "";

        //Equilatero 3 lados iguales, Escaleno 3 lados desiaguales, isosceles 2 lados iguales
        do {
            System.out.print("Teclee el primer lado del triangulo:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        lado1 = (int) val.getNumero();

        do {
            System.out.print("Teclee el segundo lado del triangulo:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        lado2 = (int) val.getNumero();

        do {
            System.out.print("Teclee el tercer lado del triangulo:");
            dato = entrada.nextLine();
        } while (val.validar(dato, 2147483647, 0));
        lado3 = (int) val.getNumero();

        if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3 && lado2 == lado1 && lado3 == lado1 && lado3 == lado2) {
            System.out.println("Puede formar un triangulo equilatero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3 || lado2 == lado1 || lado3 == lado1 || lado3 == lado2) {
            System.out.println("Puede formar un triangulo isosceles");
        } else {
            System.out.println("Puede formar un triangulo escaleno");
        }

    }

}
