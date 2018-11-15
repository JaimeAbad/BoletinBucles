package boletinBucles;

import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {

		/*Realiza un algoritmo que imprima una pirámide de dígitos como la de la figura, tomando
		como entrada el número de filas de la misma.
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
		/*igual que el 19 pero con 2 pequeños añadidos:
		 * 1- no dejamos espacio entre numeros
		 * 2. una vez en la linea llegue al maximo, ponemos otro bucle para que llegue hasta 1 */
		
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
				System.out.printf("%s",k);
			}
			for(int k=n_linea-1;k>=1;k--) {
				System.out.printf("%s",k);
			}
		}
		
		
		
		
	}

}
