package Quest�es2;

import java.util.Scanner;

public class Ativ_2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("\nQual o primeiro n�mero?: ");
		num1 = read.nextInt();
		System.out.println("\nQual o segundo n�mero?: ");
		num2 = read.nextInt();	
		System.out.println("\nQual o terceiro n�mero?: ");
		num3 = read.nextInt();	
		
		if(num1<num2 && num2<num3) {
			System.out.printf("\nA ordem crescente dos n�meros informados � "+num1+","+num2+","+num3);
		}else if(num1<num3 && num3<num2) {
			System.out.printf("\nA ordem crescente dos n�meros informado � "+num1+","+num3+","+num2);	
		}else if(num2<num1 && num1<num3) {
			System.out.printf("\nA ordem crescente dos n�meros informado � "+num2+","+num1+","+num3);
		}else if(num2<num3 && num2<num1) {
			System.out.printf("\nA ordem crescente dos n�meros informados � "+num2+","+num3+","+num1);
		}else if(num3<num1 && num1<num2) {
			System.out.printf("\nA ordem crescente dos n�meros informados � "+num3+","+num1+","+num2);
		}else {
			System.out.printf("\nA ordem crescente dos n�meros informados � "+num3+","+num2+","+num1);
		}	
		
	}

}
