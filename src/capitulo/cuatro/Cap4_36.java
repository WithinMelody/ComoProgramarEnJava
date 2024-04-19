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
public class Cap4_36 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte lado1,lado2,lado3,mayor,a,b;
        double resultado;
         Validaciones val = new Validaciones();
        String dato = "";

         do {
                System.out.print("Teclee el primer lado del triangulo:");
                dato = entrada.nextLine();
            } while (val.validar(dato, 127, 0));
            lado1 = (byte) val.getNumero();

         do {
                System.out.print("Teclee el segundo lado del triangulo:");
                dato = entrada.nextLine();
            } while (val.validar(dato, 127, 0));
            lado2 = (byte) val.getNumero();
        
        do {
                System.out.print("Teclee el tercer lado del triangulo:");
                dato = entrada.nextLine();
            } while (val.validar(dato, 127, 0));
            lado3 = (byte) val.getNumero();
        
       if(lado1>lado2 && lado1>lado3){
            mayor = lado1;
            a=lado2;
            b=lado3;
       } else if(lado2>lado1 && lado2>lado3){
           mayor = lado2;
           a= lado1;
           b= lado3;
       } else{
           mayor = lado3;
           a= lado1;
           b=lado2;
       }
       
       resultado = Math.pow(a/mayor,2)+Math.pow(b/mayor,2);
       //SI (a/c)^2+(b/c)^2=1 es un triangulo rectangulo
       if(resultado==1){
           System.out.println("Si es un triangulo rectangulo");
       } else{
           System.out.println("No es un triangulo rectangulo");
       }
           
    }

}
