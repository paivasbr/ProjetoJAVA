package Quest�es2;

import java.util.*;

public class Ativ_4 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		double num;
		
		System.out.println("\nDigite um n�mero: ");
		num = read.nextDouble();
		
		if(num%2==0) {
			System.out.printf("\nO n�mero %.1f � par e sua ra�z quadras � %.2f", num, Math.sqrt(num));
		} else {
			System.out.printf("\nO n�mero "+num+" � �mpar e o seu quadrado � "+Math.pow(num, 2));
		}		
	}
}
