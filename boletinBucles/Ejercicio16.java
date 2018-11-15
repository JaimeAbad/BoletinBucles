package boletinBucles;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {

		/*Realiza un programa que dado un número entero positivo de n cifras, calcule el número con
sus cifras en orden inverso. El resultado debe quedar en una variable. No utilizar String ni
calcular previamente el número de cifras. Ej: 54.321 debe devolver 12.345*/
		
		/*1. pedimos un numero entero
		 * 2. obtenemos el resto de la multiplicacion y multiplicamos por 10
		 * 3. sumamos el resto al numero y multiplicamos por 10
		 * repetimos hasta que el numero sea menor que 0 ó 0*/
		
		Scanner keyboard = new Scanner(System.in);
		int number = 473;
		int numberInverse = 0;
		int resto;
		
		System.out.println("Introduce un numero entero positivo");
		number = keyboard.nextInt();
		do {
			resto = number%10;
			number = number/10;
			
			if(number>0) {
				numberInverse = (numberInverse + resto)*10;
			}else {
				numberInverse+=resto;
			}

		}while(number>0);
		System.out.println("numero inverso: " + numberInverse);
		
		keyboard.close();
		
		
	}

}
