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
public class Cap4_20 {

    public static void main(String arg[]) {

        int n = 1;
        String nombre[] = new String[3];
        Validaciones val = new Validaciones();
        String dato = "";

        for (int i = 0; i < 3; i++) {
            Scanner entrada = new Scanner(System.in);
            System.out.println("Teclee el nombre del empleado" + " " + n + " :");
            nombre[i] = entrada.nextLine();

             do {
                System.out.println("Numero de horas que el empleado trabajo la semana pasada:");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, 0));
            int horas = (int) val.getNumero();
           
            do {
                System.out.println("Tarifa por horas del empleado:");
                dato = entrada.nextLine();
            } while (val.validar(dato, 2147483647, 0));
            int tarifa = (int) val.getNumero();

            int sueldo = 0;
            if (horas == 40 || horas < 40) {
                sueldo = tarifa * horas;
            } else if (horas > 40) {
                sueldo = tarifa * horas + ((tarifa * horas) / 2);
            }

            System.out.println("El sueldo total del empleado" + " " + n + " " + nombre[i] + " " + "es de:" + " " + sueldo);
            n += 1;
        }
    }

}
