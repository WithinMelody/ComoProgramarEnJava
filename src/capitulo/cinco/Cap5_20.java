/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.cinco;
import java.text.DecimalFormat;

/**
 *
 * @author mari2
 */
public class Cap5_20 {
        public static void main(String[] args) {
        double pi=4;
        int cont=0,termino=0;
        boolean bandera=true,señal=false;
        DecimalFormat df = new DecimalFormat("#.00000");
        System.out.println("-Calculando el valor de Pi-");
        System.out.println("t\tValor\n");
        for (int i = 3; i <= 200002; i++) {//200002
            if (i%2==0) {
                bandera=!bandera;
            }
            else{
                if(bandera){
                    pi-=4.0/i;
                }
                else{
                    pi+=4.0/i;
                }
            }
            cont++;
            if(df.format(pi).equalsIgnoreCase("3.14159")&&!señal){
                señal=true;
                termino=cont;
            }
            System.out.println(cont+" "+pi);
        }
        System.out.println("Pi = "+pi);
        if(señal){
            System.out.println("El valor que comienza en 3.14159 se obtiene en el termino número "+termino);
        }
        else{
            System.out.println("En ningun termino se logra el numero 3.14159 exacto");
        }
        
    }
    
}
