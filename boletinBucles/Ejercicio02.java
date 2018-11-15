package boletinBucles;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		int n1, n2, resultado = 0;
		
		System.out.println("Introduce un primer numero entero positivo: ");
		n1 = keyboard.nextInt();
		System.out.println("Introduce un segundo numero entero positivo: ");
		n2 = keyboard.nextInt();
		
		keyboard.close();
		
		
		for(int i=1; i<=n1;i++) {
			resultado +=n2;
		}
		
		System.out.printf("El resultado del producto de %d y %d sumado es : %d" , n1, n2, resultado);
		
		
	}

}
