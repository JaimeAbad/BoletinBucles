package boletinBucles;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {

		
		/*Realiza un programa que calcule el factorial de un número entero positivo que se introduce por
teclado. El factorial de un número entero positivo n se define como el producto de todos los
números enteros positivos desde 1 hasta n:*/
		
		
		/*1.pedimos un numero entero positivo N por teclado
		 * 2 recorremos desde 1 hasta N multiplicando los numeros*/
		
		Scanner keyboard = new Scanner(System.in);
		 int number, result=1;
		 
		 System.out.println("Introduce el numero del que quieras obtener el factorial: ");
		 number = keyboard.nextInt();
		 keyboard.close();
		 
		 for(int i= 1; i<=number;i++) {
			 result = result*i;
			 System.out.println(result);
		 }
		 
	}

}
