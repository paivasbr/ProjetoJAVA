package QuestõesExtrasVetoresEMatrizes;

import java.util.Scanner;

public class Ativ_3 {
	public static void main(String[] args) {
		int linha,coluna,quantNum=0;
		int[] [] matriz = new int [3] [3];
		
		Scanner read = new Scanner(System.in);
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.printf("Insira um elemento M[%d][%d]: ",linha+1,coluna+1);
				matriz[linha][coluna]=read.nextInt();
				
				if(matriz[linha][coluna]>10) {
					quantNum++;
				}
			}
		}
		System.out.printf("\nA matriz possui %d valores maiores que 10.",quantNum);
	
		System.out.println("\nLogo abaixo, representação da matriz: \n");
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				System.out.print(matriz[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}