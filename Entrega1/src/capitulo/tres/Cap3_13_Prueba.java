/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.tres;

/**
 *
 * @author mari2
 */
public class Cap3_13_Prueba {

    public static void main(String arg[]) {
        Cap3_13 empleado1 = new Cap3_13("Mariana", "Gallardo", 1500);
        Cap3_13 empleado2 = new Cap3_13("Marco", "Arriaga", 3000);
        salario(empleado1);
        salario(empleado2);
        System.out.println("Realizando un aumento del 10%");
        aumento(empleado1);
        aumento(empleado2);
    }

    public static void salario(Cap3_13 empleado) {
        double anual;
        anual = empleado.getSalarioMensual() * 12;
        System.out.println("El salario anual de" + " " + empleado.getPrimerNombre() + " " + empleado.getApellidoPaterno() + " " + "es de:" + " " + anual);
    }

    public static void aumento(Cap3_13 empleado) {
        double aumento, porc;
        porc = empleado.getSalarioMensual() * .10;
        aumento = (empleado.getSalarioMensual() * 12) + porc;
        System.out.println("Salario con aumento de" + " " + empleado.getPrimerNombre() + " " + empleado.getApellidoPaterno() + ": " + aumento);
    }

}
