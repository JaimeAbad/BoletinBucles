package boletinBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		
		/*Realiza un juego de adivinanza de un número entero. El programa pedirá dos números (el
número inferior y el número superior), por ejemplo 1 y 100, y un número de intentos, por
ejemplo, 4. El programa obtendrá a continuación un número aleatorio entre 1 y 100, y el
usuario deberá adivinarlo utilizando como mucho 4 intentos. Cada vez que el usuario
introduce un número, el programa le dice si es mayor o menor. Al final, el programa indica si
se ha ganado o no. Si acierta, el programa finaliza aunque no haya agotado el número de
intentos.*/
		
		
		/*1. pedir dos numeros enteros por teclado, entre los cuales estara el numero a adivinar
		 * 	1.1 el primer numero sera el menor del rango
		 *  1.2 el segundo numero sera el mayor del rango
		 *  
		 *2. pedir otro entero que sera el numero de intentos
		 *3. obtener un numero aleatorio entre el rango, que sera el numero secreto
		 *4. el usuario introducira un numero y la maquina le indicara si es mayor o menor al secreto
		 *5. si se acierta finaliza el programa
		 *6. cuando se acabe el numero de intentos se indica si se a ganado o perdido 
		 * */
		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		int menor, mayor, secreto, intento, nIntentos;
		
		System.out.println("Introduce el rango.");
		System.out.println("Numero menor: ");
		menor = keyboard.nextInt();
		System.out.println("Numero mayor: ");
		mayor = keyboard.nextInt();
		
		System.out.println("Numero de intentos: ");
		nIntentos = keyboard.nextInt();
		
		
		secreto = rnd.nextInt(mayor-menor + 1 ) + menor;
		System.out.println(secreto);
		
		System.out.printf("Tienes %d intentos para adivinar el numero. \n", nIntentos);
		for(int i= 1; i<=nIntentos;i++) {
			System.out.printf("Intento %d: ", i);
			intento = keyboard.nextInt();
			
			if(intento == secreto) {
				System.out.println("Has ganado ! ! ! !");
				i = nIntentos;
			}else if(i == nIntentos && intento!=secreto){
				System.out.printf("\nHas perdido...\nEl numero era el %d", secreto);
			}else {
				//indica si el intento es mayor o menor al secreto
				System.out.println(intento>=secreto ? "mayor":"menor");
			}
		}
		
		
		
		
		
		
		
		
		
		
		keyboard.close();
	}

}
