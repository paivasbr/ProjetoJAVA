package Quest�esExtrasVetoresEMatrizes;

import java.util.Scanner;

public class Ativ_2 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);

		int[] vetor = new int [6]; 
		int x,num,somaNumPar=0,quantNumImpar=0;
		
		for (x=0;x<6;x++) {
			System.out.printf("\nDigite um n�mero inteiro: ");
			num=read.nextInt();
			
			vetor[x]=num;
				
			if (vetor[x]%2==0) {
			somaNumPar+=vetor[x];			
		   }else {
			quantNumImpar++;
			}
		}
		System.out.println("\nA somat�ria dos n�meros pares � de "+somaNumPar+".");
		System.out.println("\nA quantidade de n�meros �mpares digitados � "+quantNumImpar+".");	
		
		System.out.println("\nOs n�meros pares digitados s�o: ");
		for (x=0;x<6;x++) {
			if (vetor[x]%2==0) {
				System.out.println(vetor[x]);
			}
		}
		System.out.println("\nOs n�meros �mpares digitados s�o: ");
		for (x=0;x<6;x++) {
			if (vetor[x]%2!=0) {
			System.out.println(vetor[x]);
				}
			}
		}
	}