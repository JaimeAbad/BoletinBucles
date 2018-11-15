package boletinBucles;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {

		
		/*19. Elabore un programa que imprima el triángulo hasta un valor dado. El triángulo contiene los
		números naturales correlativos, uno en la primera línea, dos en la segunda, etc.; es decir, en
		la fila n-esima aparecen n valores. Ejemplo:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5*/
		
		//igual que el 17 en formato pero en lugar de imprimir * imprimimos desde 1 hasta n_linea 
		
		int numero;
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
				System.out.printf("%s ",k);
			}
		}
		
		
		
	}

}
