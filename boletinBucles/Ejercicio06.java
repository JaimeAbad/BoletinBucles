package boletinBucles;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int n1, n2;
		float result = 0.0f;
		char character =' ';
		String option="";
		
		System.out.println("Calculadora");
		do {
			
			do {
				System.out.println("Pulsa Enter para iniciar el programa.");
				keyboard.nextLine();
				System.out.printf("¿Que operacion desea realizar?\nsumar: + \nrestar: - \nmultiplicar: * \ndividir: / \nsalir: s");
				option = keyboard.nextLine();
				option.toLowerCase();
				character = option.charAt(0);
			}while(character != '+' && character != '*' && character != '-' && character != '/' && character != 's');
		
			
			
			switch(character) {
			case '+':
				System.out.println("Introduce el primer numero :");
				n1 = keyboard.nextInt();
				System.out.println("Numero 2: ");
				n2 = keyboard.nextInt();
				result = n1 + n2;
				System.out.printf("Resultado: %.2f \n", result);
				break;
			case '-':
				System.out.println("Introduce el primer numero :");
				n1 = keyboard.nextInt();
				System.out.println("Numero 2: ");
				n2 = keyboard.nextInt();
				result = n1 - n2;
				System.out.printf("Resultado: %.2f \n", result);
				break;
			case '*':
				System.out.println("Introduce el primer numero :");
				n1 = keyboard.nextInt();
				System.out.println("Numero 2: ");
				n2 = keyboard.nextInt();
				result = n1*n2;
				System.out.printf("Resultado: %.2f \n", result);
				break;
			case '/':
				System.out.println("Introduce el primer numero :");
				n1 = keyboard.nextInt();
				System.out.println("Numero 2: ");
				n2 = keyboard.nextInt();
				result = n1/n2;
				System.out.printf("Resultado: %.2f \n", result);
				break;
			case 's':
				System.out.println("Hasta pronto");
				break;
			
			}
			
		}while(character !='s');
		
		keyboard.close();
		
		
		
		
		
		
		
		
	}

}
