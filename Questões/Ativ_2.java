package Quest�es;

import java.util.Scanner;

public class Ativ_2 {
	
	public static void main(String[] args) {
		
		int anosEmDias,mesesEmDias,dias,totalAnos,totalMeses,totalDias;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQuantos anos voc� tem em dias? ");
		anosEmDias = read.nextInt();
		System.out.println("\nE quantos meses em dias? ");
		mesesEmDias = read.nextInt();
		System.out.println("\nPor fim, quantos dias? ");
		dias = read.nextInt();		
		
		totalAnos=anosEmDias/365;
		totalMeses=mesesEmDias/30;
		totalDias=dias;
		
		System.out.printf("\nVoc� tem, at� o momento, "+totalAnos+" anos, "+totalMeses+" meses e "+totalDias+" dias.");			
	}
}
