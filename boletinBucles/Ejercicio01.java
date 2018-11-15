package boletinBucles;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int numero;
		
		System.out.println("Introduce el numero del que quieras su tabla de multiplicar : ");
		numero = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.printf("Tabla de multiplicar del %d\n",numero);
		tablaMultiplicar(numero);
	}

	public static String tablaMultiplicar(int n) {
		String tabla = "";
		
		for(int i=0;i<=10;i++) {
			tabla = n + "*" + i;
			System.out.printf("%s\n" , tabla);
		}
		return tabla;
	}
}
