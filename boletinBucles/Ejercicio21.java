package boletinBucles;

public class Ejercicio21 {

	public static void main(String[] args) {

		/*21.Crear un programa que imprima un tablero de ajedrez.*/
		
		/*1. imprimimos 8 filas y 8 columnas.
		 * 2. en cada fila habra 8 espacios(columnas)
		 * 3. las posiciones cuya suma de columna y fila sean pares las colorearemos de negro y las impares de blanco*/
		
		
	
		final int FILA = 8, COLUMNA = 8;
		
		for(int i=1;i<=FILA;i++) {
			for(int j=1; j <= COLUMNA;j++) {
				if((j+i)%2 == 1) {
					System.out.printf(Colores.FONDO_NEGRO + "  " + Colores.RESET);
				}else {
					System.out.printf(Colores.FONDO_BLANCO + "  " + Colores.RESET);
				}
			}
			System.out.println();
		}
		
		
		
	}

}
