package boletinBucles;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {

		
		/*1 Pedimos dos numeros por teclado (a y b) que formaran un rango de numeros
		 * 2. obtenemos los pares y los impares entre dicho rango
		 * 3. sumamos los pares y mostramos / igual con los impares*/
		
		
		Scanner keyboard = new Scanner(System.in);
		int a, b, pair = 0, odd = 0 ;
		
		
		System.out.println("Introduce el valor menor del rango: ");
		a = keyboard.nextInt();
		System.out.println("Introduce el valor mayor del rango: ");
		b = keyboard.nextInt();
		keyboard.close();
		
		for(int i = a;i<=b; i++) {
			if(i%2 == 0) {
				pair+=i;
			}else if(i%2 == 1) {
				odd+=i;
			}
		}
		System.out.printf("Pares: %d\n",pair);
		System.out.printf("Impares: %d",odd);
	}

}
