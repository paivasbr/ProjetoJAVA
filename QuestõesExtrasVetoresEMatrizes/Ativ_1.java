package Quest�esExtrasVetoresEMatrizes;

public class Ativ_1 {
	public static void main(String[] args) {
		
		int[] vetorA={1,0,5,-2,-5,7};
		int somaVar;

		somaVar=vetorA[0]+vetorA[1]+vetorA[5];
		
		System.out.printf("\nA soma das posi��es A[0], A[1] e A[5] � de %d,",somaVar);
	
		vetorA[4] = 100;
	
		System.out.printf("\nA posi��o 1 do vetor A � de %d;",vetorA[0]);
		System.out.printf("\nA posi��o 2 do vetor A � de %d;",vetorA[1]);
		System.out.printf("\nA posi��o 3 do vetor A � de %d;",vetorA[2]);
		System.out.printf("\nA posi��o 4 do vetor A � de %d;",vetorA[3]);
		System.out.printf("\nA posi��o 5 do vetor A � de %d;",vetorA[4]);
		System.out.printf("\nA posi��o 6 do vetor A � de %d.",vetorA[5]);
	}
}
