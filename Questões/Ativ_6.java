package Questões;

import java.util.Scanner;

public class Ativ_6 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		double x1,x2,y1,y2,dx,dy,dxy,distanciaEntrePontos;
		
		System.out.println("\nInforme o valor de x1: ");
		x1 = read.nextFloat();
		System.out.println("\nInforme o valor de y1: ");
		y1 = read.nextFloat();
		System.out.println("\nInforme o valor de x2: ");
		x2 = read.nextFloat();
		System.out.println("\nInforme o valor de y2: ");
		y2 = read.nextFloat();
		
		dx=Math.pow((x2-x1),2);
		dy=Math.pow((y2-y1),2);
		dxy=dx+dy;
		distanciaEntrePontos=Math.sqrt(dxy);
		
		System.out.printf("\nA distância entre os pontos no plano é de %.2f",distanciaEntrePontos);
	
	}

}
