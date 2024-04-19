/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo.ocho;

/**
 *
 * @author mari2
 */
public class Cap8_11 {


		//Atributos de clase
		private double parteReal;
		private double parteImaginaria;
		//Constructores
		public Cap8_11(){
			this.parteReal=0;
			this.parteImaginaria=0;
		}
		public Cap8_11(double real, double imaginaria){
			this.parteReal=real;
			this.parteImaginaria=imaginaria;
		}
		//Accesadores
		public double getParteReal() {
			return parteReal;
		}
		public double getParteImaginaria() {
			return parteImaginaria;
		}
		//MÃ©todos
		//Suma: (a,b)+(c,d)=(a+c,b+d)
		public void suma(Cap8_11 otro){
			this.parteReal = this.getParteReal() + otro.getParteReal();
			this.parteImaginaria += otro.getParteImaginaria();
		}
		//Resta: (a,b)-(c,d)=(a-c,b-d)
		public void resta(Cap8_11 otro){
			this.parteReal -= otro.getParteReal();
			this.parteImaginaria -= otro.getParteImaginaria();
		}
		

		@Override
		public String toString() {
			return "(" + parteReal + ","
					+ parteImaginaria + ")";
		}
		
		public static void main(String[] args) {

			Cap8_11 n1 = new Cap8_11(9,5);
			Cap8_11 n2 = new Cap8_11(7,8);

			System.out.print(" SUMA de los números complejos: "+ n1
					+ " - "+n2 +" = ");
			n1.suma(n2);
			System.out.println(n1+"\n");

			System.out.print(" RESTA de los números complejos: "+ n1 + " + "+ n2 + " = ");
			n1.resta(n2);
			System.out.println(n1+"\n");

			
		}

	
    
}
