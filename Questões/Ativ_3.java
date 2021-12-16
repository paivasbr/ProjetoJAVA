package Questões;

import java.util.Scanner;

public class Ativ_3 {
	
	public static void main(String[] args) {
		
		int totalSegund,horas,min,segund;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nInforme a duração em segundos do evento: ");
		totalSegund = read.nextInt(); 
		
		horas = totalSegund/3600;
		min = (totalSegund-(horas*3600))/60;
		segund = (totalSegund % 60);
		
		System.out.println("\nO evento teve a duração de "+horas+" horas(s), "+min+" minutos(s) e "+segund+" segundo(s).");				
	}
}
