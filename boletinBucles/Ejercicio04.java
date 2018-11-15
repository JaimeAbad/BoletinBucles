package boletinBucles;

import java.util.Random;

public class Ejercicio04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		int dado;
		
		//obtener un random entre 1 y 6 y repetir la operacion 20 veces
		
		for(int i=1;i<=20; i++) {
			dado = rnd.nextInt(6) + 1;
			System.out.printf("Lanzamiento %d: %d\n",i,dado);
		}
		
		
	}

}
