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
public class Cap4_23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[10];
        int indice = 0;
        int mayor = 0, mayor2 = 0;
        boolean aceptado = true;
         Validaciones val = new Validaciones();
        String dato = "";
        //Ingresando 10 numeros
        for (int contador = 0; contador < 10; contador++) {
            do {
                System.out.print("Ingrese un numero:");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647,-2147483648));
            numeros[contador] = (int) val.getNumero();

            //Checando que no se repitan los numeros	
            for (int i = 0; i < indice; i++) {
                if (numeros[i] == numeros[contador]) {
                    aceptado = false;
                    System.out.println("El número " + numeros[contador] + " ya existe en posición: " + i);
                }
            }

            if (aceptado) {
                numeros[indice] = numeros[contador];
                indice++;
            }
            //En la primera pasada el mayor tomara el valor tecleado
            if (contador == 0) {
                mayor = numeros[contador];
            } else if (contador == 0) { //Segunda pasa el mayor2 tomara el valor tecleado
                mayor2 = numeros[contador];
            }

            if (numeros[contador] > mayor) {
                mayor2 = mayor;
                mayor = numeros[contador];

            } else if (numeros[contador] > mayor2) {
                mayor2 = numeros[contador];
            }
        }

        if (mayor > mayor2) {
            System.out.print("El primer numero mas grande es:" + " " + mayor + " " + "\nEl segundo numero mas grande es:" + " " + mayor2);

        } else {
            System.out.print("El primer numero mas grande es:" + " " + mayor2 + " " + "\nEl segundo numero mas grande es:" + " " + mayor);
        }

    }

}
