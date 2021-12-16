package Questões;

import java.util.Scanner;

public class Ativ_5 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		float p1,p2,p3,n1,n2,n3,mediaPonderada;		
		p1=2;
		p2=3;
		p3=5;
		
		System.out.println("\nInformar nota 1: ");
		n1 = read.nextFloat();
		System.out.println("\nInformar nota 2: ");
		n2 = read.nextFloat();
		System.out.println("\nInformar nota 3: ");
		n3 = read.nextFloat();
		
		mediaPonderada = (p1*n1+p2*n2+p3*n3)/(p1+p2+p3);
		System.out.printf("\nSua nota média foi de %.2f",mediaPonderada);
	}

}
