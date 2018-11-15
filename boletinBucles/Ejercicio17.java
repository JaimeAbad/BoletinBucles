package boletinBucles;

import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {

		
		/*Realiza un algoritmo que lea un número natural n por teclado y dibuje un triángulo de
		asteriscos con base y altura n. Por ejemplo si n = 5 debería dibujarse:
    *
   * *
  * * *
 * * * *
* * * * *     */
		
		
		/*1. pedimos un numero al usuario
		 * 2. pintamos tantos espacios como n-1 y tantos * como n_lineas
		 * 3. repetimos hasta q n * = n_linea
		 * */
		int numero;
		String punto = "* ";
		String espacio = " ";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de la piramide: ");
		numero = keyboard.nextInt();
		keyboard.close();
		
		for(int n_linea=1;n_linea<=numero;n_linea++) {
			System.out.println();
			for(int j=numero-n_linea;j>=1;j--) {
				System.out.printf("%s",espacio);
			}
			for(int k=1;k<=n_linea;k++) {
				System.out.printf("%s",punto);
			}
		}
		
		
		
	}

}
