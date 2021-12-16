package Questões2;

import java.util.Scanner;

public class Ativ_2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("\nQual o primeiro número?: ");
		num1 = read.nextInt();
		System.out.println("\nQual o segundo número?: ");
		num2 = read.nextInt();	
		System.out.println("\nQual o terceiro número?: ");
		num3 = read.nextInt();	
		
		if(num1<num2 && num2<num3) {
			System.out.printf("\nA ordem crescente dos números informados é "+num1+","+num2+","+num3);
		}else if(num1<num3 && num3<num2) {
			System.out.printf("\nA ordem crescente dos números informado é "+num1+","+num3+","+num2);	
		}else if(num2<num1 && num1<num3) {
			System.out.printf("\nA ordem crescente dos números informado é "+num2+","+num1+","+num3);
		}else if(num2<num3 && num2<num1) {
			System.out.printf("\nA ordem crescente dos números informados é "+num2+","+num3+","+num1);
		}else if(num3<num1 && num1<num2) {
			System.out.printf("\nA ordem crescente dos números informados é "+num3+","+num1+","+num2);
		}else {
			System.out.printf("\nA ordem crescente dos números informados é "+num3+","+num2+","+num1);
		}	
		
	}

}
