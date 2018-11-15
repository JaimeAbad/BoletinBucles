package boletinBucles;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {

		
		
		/*En el programa anterior, marcar las casillas a las que se puede mover un alfil desde una
			posición dada por teclado. Que se repita el proceso tantas veces como desee el usuario*/
		
		/*alfil move:  diagonal = col+1 fila +1  */
		
		Scanner keyboard = new Scanner(System.in);
		final int FILA = 8, COLUMNA = 8;
		int posFila, posColumna;
		String whiteBishop = "\u2657", blackBishop = Colores.NEGRO+ "\u265D" + Colores.RESET ;
		/*el usuario elegira la posicion del alfil y donde coincidan fila y columna lo pintaremos
		 * a partir de esta posicion sacaremos los movimientos posibles*/
		
		System.out.println("Introduce la fila del alfil: ");
		posFila = keyboard.nextInt();
		System.out.println("Introduce la columna del alfil: ");
		posColumna = keyboard.nextInt();
		keyboard.close();
		System.out.println(blackBishop);
		System.out.println(whiteBishop);
		for(int i=1;i<=FILA;i++) {
			for(int j=1; j <= COLUMNA;j++) {
				
				if(i == posFila && j == posColumna && (j+i)%2 == 1) {
					System.out.printf(Colores.FONDO_NEGRO + " %s", whiteBishop + Colores.RESET);
				}else if(i == posFila && j == posColumna && (j+i)%2 == 0) {
					System.out.printf(Colores.FONDO_BLANCO + " %s", blackBishop + Colores.RESET);
				}else if(Math.abs(i-posFila) == Math.abs(j-posColumna)) {
					System.out.printf(Colores.FONDO_VERDE + "  " + Colores.RESET);
				}
				else if( (j+i)%2 == 1) {
					System.out.printf(Colores.FONDO_NEGRO + "  " + Colores.RESET);
				}else {
					System.out.printf(Colores.FONDO_BLANCO + "  " + Colores.RESET);
				}
				
				//falta pintar las posiciones que son movimientos posibles del alfil, apartir de la posicion
				//en la que esté
				//si la suma de la posicion del usuario es igual a la suma de fila y columna la pintamos
				//si restamos y hacemos el valor absoluto tenemos la operacion unificada
				//haremos otro else if para poner la formula
				
				/*LA FORMULA ES: 
				 * viene de que la suma de la posicion del alfil es igual a la suma de las posiciones validas
				 * y de que la resta de la posicion tambien es igual a las posiciones validas, por lo tanto se puede
				 * unificar en la siguiente formula : 
				 * 
				 * i-posFila == j-col ambas en valor absoluto
				*/
				
			}
			System.out.println();
		}
		 
	}

}
