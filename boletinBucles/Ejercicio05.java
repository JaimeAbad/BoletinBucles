package boletinBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		int aleatorio, max, min;
		
		System.out.println(" -- Introduce un rango --");
		System.out.println("Valor menor: ");
		min = keyboard.nextInt();
		System.out.println("Valor mayor: ");
		max = keyboard.nextInt();
		keyboard.close();
		
		System.out.printf("Rango de numero aleatorio entre %d - %d \n\n",min,max);
		for(int i = 1;i<=15;i ++) {
			aleatorio = rnd.nextInt(max - min  + 1) + 1;
			System.out.println(aleatorio);
		}
		
		
		
	}

}
