package boletinBucles;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {

		
		/*Realiza un programa que calcule el primer elemento de la serie de Fibonacci que sea mayor o
igual que un valor introducido por teclado. La serie de Fibonacci se define mediante:
a0 = 0 a1 = 1 an = an-1 + an-2
es decir, la serie de Fibonacci sería la siguiente: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, …..*/
		
		/*1. pedir un numero por teclado
		 * 2. partiendo de dos numeros a = 0 y b = 1, ir sumando los dos ultimos hasta superar el numero dado*/
		
		Scanner keyboard = new Scanner(System.in);
		int number, result=0;
		int first = 0 , second = 1;
		
		

		System.out.println("Introduce un numero por teclado: ");
		number = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.printf("%d, %d, ", first, second);
		
		do {
			result = first + second;
			first = second;
			second = result;
		System.out.printf("%d, ",result);
		}while(result<=number);
		
		
		
	}

}
