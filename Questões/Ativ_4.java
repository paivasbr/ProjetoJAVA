package Quest�es;

import java.util.Scanner;

public class Ativ_4 {
	
	public static void main(String[] args) {
		
		int A,B,C;
		double D,R,S;
		Scanner read = new Scanner(System.in);
		
		System.out.println("\nQual o valor do n�mero A?: ");
		A = read.nextInt();
		System.out.println("\nQual o valor do n�mero B?: ");
		B = read.nextInt();
		System.out.println("\nQual o valor do n�mero C?; ");
		C = read.nextInt();
		
		R = Math.pow(A+B,2);
		S = Math.pow(B+C,2);
		D = (R + S) / 2;
		
		System.out.println("\nO valor de D � "+D+".");
	}

}
