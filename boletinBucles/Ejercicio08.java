package boletinBucles;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {

		/*8.Utilizando un bucle for con dos contadores, realiza un programa que dados dos números enteros
a y b que se introducen por teclado(a<b), vaya aumentando a al doble de su valor y
disminuyendo b a la mitad de su valor hasta que a>b.*/
		
		/*1. Pedir un rango de valores de numeros enteros
		 * 2. Aumentar el numero menor el doble hasta llegar al mayor
		 * 3. disminuir el numero mayor a la mitad hasta llegar al menor
		 * */
		
		Scanner keyboard = new Scanner(System.in);
		int a, b;
		int doble = 0, half = 0 ;
		
		
		System.out.println("Introduce el valor menor del rango: ");
		a = keyboard.nextInt();
		System.out.println("Introduce el valor mayor del rango: ");
		b = keyboard.nextInt();
		keyboard.close();
		
		
		 
		doble = a;
		half = b;
		do {
			doble*=2;
			System.out.printf(" %d",doble);
		}while(doble<b);
		System.out.println();
		do {
			half/=2;
			System.out.printf(" %d ",half);
		}while(half>a);
		
	}

}
