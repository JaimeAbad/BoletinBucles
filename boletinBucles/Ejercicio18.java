package boletinBucles;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {

		
		/*18.Realiza un algoritmo que lea un número natural n y un carácter por teclado. La salida debe
		ser un rombo compuesto del carácter y de la anchura que especifica el número n. Por
			ejemplo, si n es 5 y el carácter es *, el rombo sería*/
		
		int numero;
		String punto = "* ";
		String espacio = " ";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Introduce el tamaño de la piramide: ");
		numero = keyboard.nextInt();
		System.out.println("Introduce el caracter con el que quieres dibujar la piramide: ");
		punto = keyboard.next();
		keyboard.close();
		
		for(int n_linea=1;n_linea<=numero;n_linea++) {
			System.out.println();
			for(int j=numero-n_linea;j>=1;j--) {
				System.out.printf("%s",espacio);
			}
			for(int k=1;k<=n_linea;k++) {
				System.out.printf("%s ",punto);
			}
		}
		//PARTE DE ABAJO DEL ROMBO
		for(int n_linea2=numero-1;n_linea2>0;n_linea2--) {
			System.out.println();
			for(int l=1;l<=numero - n_linea2;l++) {
				System.out.printf("%s",espacio);
			}
			for(int m=n_linea2;m>0;m--) {
				System.out.printf("%s ",punto);
			}
		}
	}

}
