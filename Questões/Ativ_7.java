package Quest�es;

import java.util.Scanner;

public class Ativ_7 {
	
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		float a,b,c,d,e,f,x,y;
		
		System.out.println("\nQual o valor de a?: ");
		a = read.nextFloat();
		System.out.println("\nQual o valor de b?: ");
		b = read.nextFloat();
		System.out.println("\nQual o valor de c?: ");
		c = read.nextFloat();
		System.out.println("\nQual o valor de d?: ");
		d = read.nextFloat();
		System.out.println("\nQual o valor de e?: ");
		e = read.nextFloat();
		System.out.println("\nQual o valor de f?: ");
		f = read.nextFloat();
		
		x=(c*e - b*f)/(a*e - b*d);
		y=(a*f-c*d)/(a*e-b*d);
		
		System.out.printf("\nO valor de x � %.2f",x);
		System.out.printf("\nO valor de y � %.2f",y);
	}
}
