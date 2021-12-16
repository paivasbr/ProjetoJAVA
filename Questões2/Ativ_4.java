package Questões2;

import java.util.*;

public class Ativ_4 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double num;
		
		System.out.println("\nDigite um número: ");
		num = read.nextDouble();
		
		if(num%2==0) {
			System.out.printf("\nO número %.1f é par e sua raíz quadras é %.2f", num, Math.sqrt(num));
		} else {
			System.out.printf("\nO número "+num+" é ímpar e o seu quadrado é "+Math.pow(num, 2));
		}		
	}
}
