/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.seis;
import java.text.DecimalFormat;
import java.util.Scanner;
import validar.Validaciones;

/**
 *
 * @author mari2
 */
public class Cap6_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double l1, l2;
        double l3 = 3.0 , l4=4.0, l5=5.0,l6=12.0,l7=8.0,l8=15.0;
        Validaciones val = new Validaciones();
        String dato = "";
       
         do {
                System.out.println("Teclee el primer lado");
                dato = entrada.nextLine();
            } while (val.validar(dato, Math.pow(1.79769313486232,308), 0));
            l1 = val.getNumero();
            
        do {
                System.out.println("Teclee el segundo lado");
                dato = entrada.nextLine();
            } while (val.validar(dato, Math.pow(1.79769313486232,308), 0));
            l2 = val.getNumero();
            
        hipotenusa(l1,l2);
        System.out.println("Calculando hipotenusas de la Figura 6.15");
        System.out.println("Triangulo 1");
        hipotenusa(l3,l4);
        System.out.println("Triangulo 2");
        hipotenusa(l5,l6);
        System.out.println("Triangulo 3");
        hipotenusa(l7,l8);
        
        
    }
    
    static double hipotenusa(double lado1, double lado2){
        double resultado;
        resultado = Math.sqrt(Math.pow(lado1,2) + Math.pow(lado2,2));
        System.out.println("La hipotenusa es: "+resultado);
        return resultado;
    }
    
    
}
