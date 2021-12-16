package Questões3;

import java.util.Scanner;

public class Ativ_6 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
	
		int num,cont=0,somaNum=0;
		float media;
		
		System.out.println("\nInforme um número ");
		num=read.nextInt();
		
		do
		{
			if(num%3==0) 
			{
			cont++;
			somaNum+=num;
			}
			System.out.println("\nInforme um número ");
			num=read.nextInt();
			
		}while(num!=0);
		
		media=(float)somaNum/cont;
		System.out.printf("\nForam informados %d número(s) múltiplo(s) de 3, sua soma é de %d e sua média é %.2f ",cont,somaNum,media);
	}
}