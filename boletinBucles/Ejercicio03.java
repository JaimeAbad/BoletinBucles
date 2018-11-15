package boletinBucles;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int nota;
		int deficiente = 0, insuficiente = 0, aprobado = 0, bien = 0, notable = 0, sobresaliente = 0;
		
		for(int i=0; i<=9;i++) {
			System.out.println("Introduce la nota: ");
			nota = keyboard.nextInt();
			
			if(nota >=0 && nota <=2) {
				deficiente ++;
			}else if(nota >= 3 && nota <= 4) {
				insuficiente ++ ;
			}else if(nota == 5) {
				aprobado ++;
			}else if(nota == 6) {
				bien ++ ;
			}else if(nota>=7 && nota<=8) {
				notable ++;
			}else {
				sobresaliente ++;
			}	
			
		}
		
		
		System.out.printf("Deficientes: %d\nInsuficientes: %d\nAprobados: %d\nBien: %d\n"
				+ "Notables: %d\nSobresalientes: %d\n",deficiente,insuficiente, aprobado, bien, notable, sobresaliente);
		
		keyboard.close();
	}

}
