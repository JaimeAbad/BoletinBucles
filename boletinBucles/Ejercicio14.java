package boletinBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {

		
		/*Realiza el mismo programa que el ejercicio anterior pero al revés, es decir, es la máquina la
			que tiene que adivinar el número pensado por el usuario.*/
		
		/*1. indicar rango
		 * 2. indicar n intentos
		 * 3. la maquina aleatoriamente mostrara un numero
		 * 4. le indicaremos si es mayor o menor que el secreto*/
		
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		int mayor = 100, menor = 1, nIntentos = 6, intento, respuesta; /*estos datos tmb los podemos pedir por teclado*/
		
		do {
			intento = rnd.nextInt(mayor - menor + 1 ) + menor;
			System.out.printf("Intento maquina : %d\n" ,intento);
			System.out.println("1- mayor 2- menor 3- correcto");
			respuesta = keyboard.nextInt();
			
			if(respuesta == 1) {
				mayor = intento - 1;
			}else if(respuesta == 2) {
				menor = intento + 1;
			}else if(respuesta == 3) {
				nIntentos = 6;
				System.out.println("SOTONTO La maquina gana");
			}else {
				System.out.println("La maquina no ha conseguido acertar el numero");
			}
			nIntentos --;
		}while(respuesta != 3 && nIntentos>=1);
		
		
		
		
		keyboard.close();
	}

}
