package Quest�es;

import java.util.Scanner;

public class Ativ_1 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int anos,meses,dias,totalDias;
		
		System.out.println("\nQuantos anos voc� tem?");
		anos = read.nextInt();
		System.out.println("\nE quantos meses?");
		meses = (int) read.nextInt();
		System.out.println("\nPor fim, quantos dias?");
		dias = (int) read.nextInt();
		
		totalDias = (anos*365+(meses*30+dias));
		
		System.out.printf("\nVoc� viveu, at� o momento " +totalDias , "dias.");
		
	}

}
