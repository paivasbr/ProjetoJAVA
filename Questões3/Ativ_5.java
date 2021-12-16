package Questões3;

import java.util.*;

public class Ativ_5 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int num, somaNum=0;
		
			System.out.println("\nDigite um número: ");
			num=read.nextInt();
			
		do{
			somaNum+=num;
			System.out.println("Por gentileza, digite um novo número: ");
			num=read.nextInt();
			
		}while(num!=0);
			System.out.println("A somatória dos números informados foi de "+somaNum);
	}
}