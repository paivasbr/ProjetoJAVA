package Quest�es2;

import java.util.Scanner;

public class Ativ_1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);	
	
		System.out.println("\nDigite um n�mero inteiro: ");
		int n1 = read.nextInt();
		System.out.println("\nDigite um segundo n�mero inteiro: ");
		int n2 = read.nextInt();
		System.out.println("\nPor fim, digite um terceiro n�mero inteiro: ");
		int n3 = read.nextInt();
	
		if(n1 > n2 && n1 > n3) {
			System.out.printf("\nO maior n�mero inteiro � "+n1+".");
		}else if (n2 > n1 && n2 > n3) {
			System.out.printf("\nO maior n�mero inteiro � "+n2+".");
		}else{
			System.out.printf("\nO maior n�mero inteiro � "+n3+".");
		}
	}
}
