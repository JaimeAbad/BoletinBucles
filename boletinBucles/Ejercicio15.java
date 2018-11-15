package boletinBucles;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {

		
		/*
Realizar un programa en java para jugar con el ordenador a un juego de adivinanza.
El programa tendrá que adivinar una letra o un número pensado por el usuario. Para ello, el
juego consta de dos partes.

En la primera parte, el programa tendrá que adivinar el tipo, que puede ser:
• Un número del 0 al 9
• Una vocal minúscula
• Una consonante minúscula (sin contar la ñ)

El programa tendrá dos intentos como máximo para averiguar ese tipo. Si no lo adivina, el
juego termina y el ordenador habrá perdido.

Si lo adivina, se continúa jugando con la segunda parte donde tendrá que adivinar la letra o
el número concreto. Para ello tendrá los siguientes intentos:
• El número entre 0 y 9: tres intentos
• La vocal minúscula: dos intentos
• La consonante minúscula: cinco intentos. En este caso, el usuario le irá ayudando
diciéndole al ordenador si es mayor o menor según el orden alfabético.
Si el programa, dentro de ese número de intentos lo adivina, habrá ganado, si no, habrá
perdido. En cualquier caso, hay que informar al usuario.*/
		
		
		
		/*
		 * 1. La maquina tendra que adivinar el tipo en 2 intentos
		 * 		1.1 En el 1 intento genera un numero aleatorio entre 0 y 2 (0,1,2), si acierta, sigue con el paso 2
		 * 		1.2 si falla repite la operacion, controlando que no genere el mismo numero que en el intento1
		 * 2. 
		 * 2.1 numero: tendra que adivinar un numero entre 0-9 en 3 intentos
		 * 			Si el tipo es numero, la maquina nos dira un numero y le diremos si es mayor o menor
		 * 2.2 vocal: la maquina tendra que adivinar la vocal en 2 intentos
		 * 			Indicaremos si es mayor o menor segun el orden alfabetico
		 * 2.3 consonante minuscula: tendra que adivinar la consonante en 5 intentos(sin añadir la ñ)
		 * 			Indicaremos si es mayor o menor segun el orden alfabetico
		 * 3. si no adivina el tipo el juego finaliza
		 * 4. si en los intentos no ha adivinado el caracter secreto la maquina pierde
		 * 
		 * */
		Scanner keyboard = new Scanner(System.in);
		Random rnd = new Random();
		int tipo, intentoTipo = 5, intento = 1, acertado, number, vowel, consonant, respuestaNumero = 0, numeroGenerado = 11;
		boolean numero = false, vocal = false, consonante = false, exit = false, aciertoNumero = false, aciertoVocal= false, aciertoConsonante = false;
		int intentoNumero=1, intentoVocal=1, intentoConsonante=1;
		char vocA = '\u0061', vocE = '\u0065', vocI = '\u0069', vocO= '\u006F', vocU = '\u0075';
		char c ;
		System.out.println("Piensa un numero (0-9), una vocal, o una consonante minuscula(no ñ).");
		//la maquina genera un numero entre 0 y 3(0,1,2) segun el numero sera un tipo y el usuario dira si a acertado o no
		
		
		do {
			do {
				tipo = rnd.nextInt(3);
				System.out.println(tipo);
			}while(tipo==intentoTipo);
			
			
			if(tipo == 0) {
				System.out.println("¿Es un numero? 1-si 2-no ");
			}else if(tipo == 1) {
				System.out.println("¿Es una vocal? 1-si 2-no ");
			}else if(tipo == 2) {
				System.out.println("¿Es una consonante? 1-si 2-no ");
			}
			acertado = keyboard.nextInt();
			if(acertado == 1 && tipo==0) {
				exit = true;
				numero = true;
			}else if(acertado == 1 && tipo==1) {
				exit = true;
				vocal = true;
			}else if(acertado == 1 && tipo==2) {
				exit = true;
				consonante = true;
			}else {
				intento ++;
				intentoTipo = tipo;
			}
			
		}while(intento <=2 && !exit);
		
		//una vez pase aqui sera pq ha acertado el tipo o ha agotado los 2 intentos y no lo ha hecho
		if(numero == true) {//3 INTENTOS
			System.out.println("LA MAQUINA HA ACERTADO QUE ES TIPO NUMERO. AHORA DEBERA ACERTAR CUAL ES ENTRE 0-9");
			do {
				do {
					number = rnd.nextInt(10);
					System.out.println(number);
				}while(number==numeroGenerado);
				System.out.printf("Es el %d ? : 1-si 2-no", number);
				respuestaNumero = keyboard.nextInt();
				if(respuestaNumero == 1) {
					aciertoNumero = true;
					System.out.println("LA MAQUINA HA ACERTADO EL NUMERO");
				}else {
					intentoNumero ++;
				}
				
			}while(!aciertoNumero && intentoNumero <=3);
			
		}else if(vocal == true) {//2 INTENTOS
			System.out.println("LA MAQUINA HA ACERTADO QUE ES TIPO VOCAL. AHORA DEBERA ACERTAR CUAL ES");
			do {
				do {
					vowel = rnd.nextInt(5);
					System.out.println(vowel);
				}while(vowel==numeroGenerado);
				switch(vowel) {
				case 0:
					System.out.printf("Es la vocal %c  ?" ,vocA);
					respuestaNumero = keyboard.nextInt();
					break;
				case 1:
					System.out.printf("Es la vocal %c  ?" ,vocE);
					respuestaNumero = keyboard.nextInt();
					break;
				case 2:
					System.out.printf("Es la vocal %c  ?" ,vocI);
					respuestaNumero = keyboard.nextInt();
					break;
				case 3:
					System.out.printf("Es la vocal %c  ?" ,vocO);
					respuestaNumero = keyboard.nextInt();
					break;
				case 4:
					System.out.printf("Es la vocal %c  ?" ,vocU);
					respuestaNumero = keyboard.nextInt();
					break;
				}
				
				if(respuestaNumero == 1) {
					aciertoVocal = true;
					System.out.println("LA MAQUINA HA ACERTADO LA VOCAL");
				}else {
					intentoVocal ++;
				}
			}while(!aciertoVocal && intentoVocal<=2);
			
		}else if(consonante == true) {//5 INTENTOS
			System.out.println("LA MAQUINA HA ACERTADO QUE ES TIPO CONSONANTE. AHORA DEBERA ACERTAR CUAL ES ENTRE a-z");
			do {
				do {
					consonant = rnd.nextInt(26) +98;
					System.out.println(consonant);
				}while(consonant==numeroGenerado || consonant == 101 ||  consonant == 105 || consonant == 111 || consonant == 117);

					c = (char) consonant;
					System.out.printf("Es la letra %c ? 1-si 2-no", c);
					respuestaNumero = keyboard.nextInt();
					if(respuestaNumero == 1) {
						aciertoConsonante = true;
						System.out.println("LA MAQUINA HA ACERTADO LA CONSONANTE");
					}else {
						intentoConsonante ++ ;
					}
				
			}while(!aciertoConsonante && intentoConsonante<=5);
		}else {
			System.out.println("LOSING MACHINE");
		}
		
		keyboard.close();
		
	}

}
