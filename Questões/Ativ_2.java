package Questões;

import java.util.Scanner;

public class Ativ_2 {
	
	public static void main(String[] args) {
		
		int anosEmDias,mesesEmDias,dias,totalAnos,totalMeses,totalDias;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQuantos anos você tem em dias? ");
		anosEmDias = read.nextInt();
		System.out.println("\nE quantos meses em dias? ");
		mesesEmDias = read.nextInt();
		System.out.println("\nPor fim, quantos dias? ");
		dias = read.nextInt();		
		
		totalAnos=anosEmDias/365;
		totalMeses=mesesEmDias/30;
		totalDias=dias;
		
		System.out.printf("\nVocê tem, até o momento, "+totalAnos+" anos, "+totalMeses+" meses e "+totalDias+" dias.");			
	}
}
