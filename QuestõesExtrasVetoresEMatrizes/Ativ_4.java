package Quest�esExtrasVetoresEMatrizes;

import java.util.Scanner;

public class Ativ_4 {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		float[][] m1 = new float [2][2]; 
		float[][] m2 = new float [2][2];
		float[][] m3 = new float [2][2];
		int linha,coluna,op;
		float num;
				
		for(linha=0;linha<2;linha++){
			for(coluna=0;coluna<2;coluna++){
				System.out.printf("Informe um n�mero para primeira matriz, posi��o M1[%d][%d]: ",linha+1,coluna+1);
				m1[linha][coluna]=leia.nextFloat();						
			}
		}
		for(linha=0;linha<2;linha++){
			for(coluna=0;coluna<2;coluna++){
				System.out.printf("Informe um n�mero para segunda matriz, posi��o M2[%d][%d]: ",linha+1,coluna+1);
				m2[linha][coluna]=leia.nextFloat();
			}
		}
		do{
		System.out.println("\nAgora que informou os valores, escolha uma das op��es abaixo: ");
		System.out.println("\n1 - Somar as duas matrizes.");
		System.out.println("\n2 - Subtrair a primeira matriz da segunda.");
		System.out.println("\n3 - Adicionar uma constante as duas matrizes.");
		System.out.println("\n4 - Imprimir as matrizes.");
		System.out.println("\n0 - Sair do sistema.");
		op=leia.nextInt();
		
		switch(op){
				case 1:
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							m3[linha][coluna]=m1[linha][coluna]+m2[linha][coluna];	
						}
					}
					System.out.println("\nA soma das duas matrizes � de: ");
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							System.out.printf("\t %.1f \t",m3[linha][coluna]);
						}
						System.out.println();
					}
					break;
					
				case 2:
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							m3[linha][coluna]=m1[linha][coluna]-m2[linha][coluna];	
						}
					}
					System.out.println("\nA subtra��o da primeira matriz para a segunda � de: ");
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							System.out.printf("\t %.1f \t",m3[linha][coluna]);
						}
						System.out.println();
					}
					break;
				case 3:
					
					System.out.println("\nInforme uma constante a adicionar na primeira e segunda matriz: ");
					num=leia.nextFloat();
					
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							m1[linha][coluna]+=num;
							m2[linha][coluna]+=num;					
						}
					}				
					System.out.println("\nNovos valores MATRIZ 1");
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							System.out.printf("\t %.1f \t",m1[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("\nNovos valores MATRIZ 2");
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							System.out.printf("\t %.1f \t",m2[linha][coluna]);
						}
						System.out.println();
					}
					break;
				case 4:
					System.out.println("\nMATRIZ 1 ");
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							System.out.printf("\t %.1f \t",m1[linha][coluna]);
						}
						System.out.println();
					}
					System.out.println("\nMATRIZ 2 ");
					for(linha=0;linha<2;linha++){
						for(coluna=0;coluna<2;coluna++){
							System.out.printf("\t %.1f \t",m2[linha][coluna]);
						}
						System.out.println();
					}
					break;
					default:
						System.out.println("\nOp��o inv�lida ou sair do sistema.");
			}
		}while(op!=0);	
	}
}
