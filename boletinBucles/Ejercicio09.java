package boletinBucles;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {

		/*
		 * Realiza un programa que calcule xn (x elevado a n), siendo x y n dos números enteros que se introducen por
			teclado. (Nota: no se puede utilizar Math.pow)*/
		/*1. pedimos dos numeros enteros por teclado
		 * 2. elevamos el segundo numero al primero
		 * 3. el punto dos se desglosa multiplicando el primer numero por si mismo tantas veces como indique el 2*/
		
		Scanner keyboard = new Scanner(System.in);
		int base, exp, result = 0, count = 1;
		
		System.out.println("Introduce la base de la potencia: ");
		base = keyboard.nextInt();
		System.out.println("Introduce el exponente de la potencia: ");
		exp = keyboard.nextInt();
		keyboard.close();
		
		
		result = base;
		do {
			System.out.printf("%d ...",result);
			result*= base;
			count++;
		}while(count<exp);
		System.out.printf("%d ...",result);
		
		
//		for(int i= 1; i<exp;i ++) {
//			result*=base;
//			System.out.printf("%d ...",result);
//		}
		
	}

}
