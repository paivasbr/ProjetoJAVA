package Quest�es3;

import java.util.*;

public class Ativ_5 {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		int num, somaNum=0;
		
			System.out.println("\nDigite um n�mero: ");
			num=read.nextInt();
			
		do{
			somaNum+=num;
			System.out.println("Por gentileza, digite um novo n�mero: ");
			num=read.nextInt();
			
		}while(num!=0);
			System.out.println("A somat�ria dos n�meros informados foi de "+somaNum);
	}
}