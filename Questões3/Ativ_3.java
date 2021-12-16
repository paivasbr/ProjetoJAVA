package Questões3;

import java.util.*;

public class Ativ_3 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int x,idade,totalPMenosDe21=0,totalPMaisDe50=0;
		
		System.out.println("\nQual a sua idade?: ");
		idade = read.nextInt();
		
		while(idade!=-99) {
			
			if(idade<21) {
				totalPMenosDe21++;
			}else if (idade>50) {
				totalPMaisDe50++;
			}else {
		System.out.println("\nIdade não registrada!");
			}
		System.out.println("\nQual a sua idade?: ");
				idade = read.nextInt();
		}
		System.out.println("\nO total de pessoas com menos de 21 anos é de "+totalPMenosDe21);
		System.out.println("\nO total de pessoas com mais de 50 anos é de "+totalPMaisDe50);
	}
}
