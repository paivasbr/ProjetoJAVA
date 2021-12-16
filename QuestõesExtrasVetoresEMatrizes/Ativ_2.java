package QuestõesExtrasVetoresEMatrizes;

import java.util.Scanner;

public class Ativ_2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vetor = new int [6]; 
		int x,num,somaNumPar=0,quantNumImpar=0;
		
		for (x=0;x<6;x++) {
			System.out.printf("\nDigite um número inteiro: ");
			num=read.nextInt();
			
			vetor[x]=num;
				
			if (vetor[x]%2==0) {
			somaNumPar+=vetor[x];			
		   }else {
			quantNumImpar++;
			}
		}
		System.out.println("\nA somatória dos números pares é de "+somaNumPar+".");
		System.out.println("\nA quantidade de números ímpares digitados é "+quantNumImpar+".");	
		
		System.out.println("\nOs números pares digitados são: ");
		for (x=0;x<6;x++) {
			if (vetor[x]%2==0) {
				System.out.println(vetor[x]);
			}
		}
		System.out.println("\nOs números ímpares digitados são: ");
		for (x=0;x<6;x++) {
			if (vetor[x]%2!=0) {
			System.out.println(vetor[x]);
				}
			}
		}
	}