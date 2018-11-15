package boletinBucles;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {

		
		
		/*Realiza un programa que encuentre el primer valor N para el que la suma
						1 + 2 + 3 + ... + N
			exceda a un valor M que se introduce por teclado.*/
		
		
		/*1. pedir un numero entero M por teclado
		 * 2. sumar desde 1 hasta que la suma sea superior a M*/
		
		
		Scanner keyboard = new Scanner(System.in);
		int number, result = 0, count = 1;
		
		System.out.println("Introduce un numero entero: ");
		number = keyboard.nextInt();
		keyboard.close();
		
		do {
			result+=count;
			count++;
			System.out.printf("%d ",result);
			
		}while(result<=number);
		
	}

}
